package com.info.assignment4

import org.apache.spark.SparkContext
import org.apache.spark.sql.{DataFrame, SparkSession}

/**
  * DataFrames/ Spark-SQL Related:
  * 1)Find the airlines name and total number of flights run by these airlines
  * 2) Find airline info (Flight Number, Airlines Number, Airlines Name), Description, who are running flights to LAX (Los Angeles, CA: Los Angeles International)
  * 3) Find largest distance of origin and destination (Print flight code, name, origin and destination which are traveled largest distance)
  * 4) Get the Airlines info (Airlines number and airline name) and average delay for all flights they are running
  * 5) Get the total count of flights running from each origin (like Hyderabad --> 10, Mumbai --> 25)
  * 6) Get the total count of flights running from each origin to destination (Like Hyderabad to Chennai ; Hyderabad to Mumbai; Hyderabad to Delhi)
  */
object spark_assigment {
  private val sampleText = "C:\\scala_training\\spark_assigments\\sample.txt"
  private val airlinesPath =
    "C:\\scala_training\\spark_assigments\\Airlines-DS\\airlines.csv"
  private val flightsPath =
    "C:\\scala_training\\spark_assigments\\Airlines-DS\\flights.csv"
  private val airportsPath =
    "C:\\scala_training\\spark_assigments\\Airlines-DS\\airports.csv"

  private var airlines: DataFrame = _;
  private var flights: DataFrame = _;
  private var airports: DataFrame = _;

  /**
    * getting spark session
    *
    * @return
    */
  def getSparkSession(): SparkSession = {
    SparkSession
      .builder()
      .master("local[*]")
      .appName(name = "core-demo")
      .getOrCreate();

  }

  /**
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    val spSession = getSparkSession();
    loadDataFrames(spSession)
    //    findFlightsByName(spSession)
    //    findLagrestJourneyFlight(spSession)
//    findAvgDelay(spSession)
    numOfFlightsBySource(spSession)
    numOfFlightsBySourceAndDest(spSession)
  }

  /**
    * loading data frames
    *
    * @param sparkSession
    */
  def loadDataFrames(sparkSession: SparkSession): Unit = {
    this.airlines = getDataFrame(sparkSession, airlinesPath)
    this.flights = getDataFrame(sparkSession, flightsPath)
    this.airports = getDataFrame(sparkSession, airportsPath)

    airlines.createOrReplaceTempView("airlines")
    flights.createOrReplaceTempView("flights")
    airports.createOrReplaceTempView("airports")
  }

  /**
    * getting dataFrame
    *
    * @param sparkSession
    * @param path
    * @return
    */
  def getDataFrame(sparkSession: SparkSession, path: String): DataFrame = {
    sparkSession.read
      .format("csv")
      .option("header", "true")
      .option("inferSchema", "true")
      .load(path)
  }

  /**
    * Task 1
    * Find the airlines name and total number of flights run by these airlines
    */
  def getTotalFlightByName(sparkSession: SparkSession) = {
    sparkSession
      .sql(
        "select e.code, e.description, " +
          "count(d.flight_number) as num_of_flights from airlines e " +
          "INNER JOIN flights d ON e.code == d.airlines GROUP BY e.code, e.description "
      )
      .show()

  }

  /**
    * Task 2
    * Find airline info (Flight Number, Airlines Number, Airlines Name), Description,
    * who are running flights to LAX (Los Angeles, CA: Los Angeles International)
    */
  def findFlightsByName(sparkSession: SparkSession) = {

    sparkSession
      .sql(
        "select  f.flight_number, f.airlines as airlines_num," +
          " ap.description as destination , al.description as airlines_name" +
          " from airlines al " +
          "inner join flights f on al.code = f.airlines" +
          " inner join airports ap on f.origin = ap.code" +
          " where ap.description='Los Angeles, CA: Los Angeles International' "
      )
      .show()
  }

  /**
    * Task 3
    * Find largest distance of origin and destination
    * (Print flight code, name, origin and destination which are traveled largest distance)
    */
  def findLagrestJourneyFlight(sparkSession: SparkSession): Unit = {
    sparkSession
      .sql(
        "select  f.flight_number, f.airlines as airlines_num," +
          " f.origin,f.destination ," +
          "f.distance, al.description as airlines_name" +
          " from airlines al " +
          "inner join flights f on al.code = f.airlines" +
          " inner join airports ap on f.origin = ap.code" +
          " order by f.distance desc LIMIT 1"
      )
      .show()
  }

  /**
    * Task 4
    * Get the Airlines info (Airlines number and airline name)
    * and average delay for all flights they are running
    *
    * @param sparkSession
    */
  def findAvgDelay(sparkSession: SparkSession): Unit = {
    sparkSession
      .sql(
        "select e.code as airline_num, e.description as airline_name, " +
          "avg(d.departure_delay) as delay  from airlines e " +
          "INNER JOIN flights d ON e.code == d.airlines GROUP BY e.code, e.description "
      )
      .show()
  }

  /**
    * Task 5
    *Get the total count of flights running from each origin
    * (like Hyderabad --> 10, Mumbai --> 25)
    * @param sparkSession
    */
  def numOfFlightsBySource(sparkSession: SparkSession) = {

    sparkSession
      .sql(
        "select origin,count(*) as num_of_flights" +
          " from flights group by origin order by num_of_flights desc"
      )
      .show(5)
  }

  /**
    * Task 6:
    * Get the total count of flights running from each origin to destination
    * @param sparkSession
    */
  def numOfFlightsBySourceAndDest(sparkSession: SparkSession): Unit = {
    sparkSession
      .sql(
        "select origin, destination, count(*) as num_of_flights" +
          " from flights group by origin, destination order by num_of_flights desc"
      )
      .show(5)
  }

  /**
    * find TrendingWord
    *
    * @param sc
    */
  def findTrendingWord(sc: SparkContext): Unit = {
    var lines =
      sc.textFile(sampleText)
    val treading = lines
      .flatMap(line => line.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_ + _)
      .sortBy(value => value._2, ascending = false)
      .first()

    println(treading)

  }
}
