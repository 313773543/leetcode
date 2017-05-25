

case class RunningApps(countrun: Int, duration: Int, ts: Int)

val x = sqlContext.read.parquet("s3://bigdata-platform/bigdatasdk/sdk_dau/20170505/")

val exploded = x.filter($"runningapplist".isNotNull).explode("runningapplist", "runningapps"){runningapplist: Map[String, Seq[RunningApps]] => runningapplist.toList}.select($"runningapps"("_1") as ("pkg"), $"runningapps"("_2") as ("details"))

val pkgsInfo = exploded.withColumn("detail",explode(exploded("details")))

val pkg_duration = pkgsInfo.select($"pkg",$"detail.duration").filter($"duration" > 3600)

pkg_duration.groupBy("pkg").count.orderBy($"count".desc).show(10,false)












