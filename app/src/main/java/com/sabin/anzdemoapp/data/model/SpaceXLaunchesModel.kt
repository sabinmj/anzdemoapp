package com.sabin.anzdemoapp.data.model

import com.google.gson.annotations.SerializedName

/*
Copyright (c) 2023 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class SpaceXLaunchesModel (

	@SerializedName("flight_number") val flight_number : Int,
	@SerializedName("mission_name") val mission_name : String,
	@SerializedName("mission_id") val mission_id : List<String>,
	@SerializedName("upcoming") val upcoming : Boolean,
	@SerializedName("launch_year") val launch_year : Int,
	@SerializedName("launch_date_unix") val launch_date_unix : Int,
	@SerializedName("launch_date_utc") val launch_date_utc : String,
	@SerializedName("launch_date_local") val launch_date_local : String,
	@SerializedName("is_tentative") val is_tentative : Boolean,
	@SerializedName("tentative_max_precision") val tentative_max_precision : String,
	@SerializedName("tbd") val tbd : Boolean,
	@SerializedName("launch_window") val launch_window : Int,
	@SerializedName("rocket") val rocket : Rocket,
	@SerializedName("ships") val ships : List<String>,
	@SerializedName("telemetry") val telemetry : Telemetry,
	@SerializedName("launch_site") val launch_site : Launch_site,
	@SerializedName("launch_success") val launch_success : Boolean,
	@SerializedName("launch_failure_details") val launch_failure_details : Launch_failure_details,
	@SerializedName("links") val links : Links,
	@SerializedName("details") val details : String,
	@SerializedName("static_fire_date_utc") val static_fire_date_utc : String,
	@SerializedName("static_fire_date_unix") val static_fire_date_unix : Int,
	@SerializedName("timeline") val timeline : Timeline
)


/*data class Cores (

	@SerializedName("core_serial") val core_serial : String,
	@SerializedName("flight") val flight : Int,
	@SerializedName("block") val block : String,
	@SerializedName("gridfins") val gridfins : Boolean,
	@SerializedName("legs") val legs : Boolean,
	@SerializedName("reused") val reused : Boolean,
	@SerializedName("land_success") val land_success : String,
	@SerializedName("landing_intent") val landing_intent : Boolean,
	@SerializedName("landing_type") val landing_type : String,
	@SerializedName("landing_vehicle") val landing_vehicle : String
)*/


data class Fairings (

	@SerializedName("reused") val reused : Boolean,
	@SerializedName("recovery_attempt") val recovery_attempt : Boolean,
	@SerializedName("recovered") val recovered : Boolean,
	@SerializedName("ship") val ship : String
)

/*data class First_stage (

	@SerializedName("cores") val cores : List<Cores>
)
data class Second_stage (

	@SerializedName("block") val block : Int,
	@SerializedName("payloads") val payloads : List<Payloads>
)*/

data class Rocket (

	@SerializedName("rocket_id") val rocket_id : String,
	@SerializedName("rocket_name") val rocket_name : String,
	@SerializedName("rocket_type") val rocket_type : String,
//	@SerializedName("first_stage") val first_stage : First_stage,
//	@SerializedName("second_stage") val second_stage : Second_stage,
	@SerializedName("fairings") val fairings : Fairings
)
/*


data class Payloads (

	@SerializedName("payload_id") val payload_id : String,
	@SerializedName("norad_id") val norad_id : List<String>,
	@SerializedName("reused") val reused : Boolean,
	@SerializedName("customers") val customers : List<String>,
	@SerializedName("nationality") val nationality : String,
	@SerializedName("manufacturer") val manufacturer : String,
	@SerializedName("payload_type") val payload_type : String,
	@SerializedName("payload_mass_kg") val payload_mass_kg : Int,
	@SerializedName("payload_mass_lbs") val payload_mass_lbs : Int,
	@SerializedName("orbit") val orbit : String,
	@SerializedName("orbit_params") val orbit_params : Orbit_params
)
*/

/*
data class Orbit_params (

	@SerializedName("reference_system") val reference_system : String,
	@SerializedName("regime") val regime : String,
	@SerializedName("longitude") val longitude : String,
	@SerializedName("semi_major_axis_km") val semi_major_axis_km : String,
	@SerializedName("eccentricity") val eccentricity : String,
	@SerializedName("periapsis_km") val periapsis_km : Int,
	@SerializedName("apoapsis_km") val apoapsis_km : Int,
	@SerializedName("inclination_deg") val inclination_deg : Int,
	@SerializedName("period_min") val period_min : String,
	@SerializedName("lifespan_years") val lifespan_years : String,
	@SerializedName("epoch") val epoch : String,
	@SerializedName("mean_motion") val mean_motion : String,
	@SerializedName("raan") val raan : String,
	@SerializedName("arg_of_pericenter") val arg_of_pericenter : String,
	@SerializedName("mean_anomaly") val mean_anomaly : String
)*/

data class Links (

	@SerializedName("mission_patch") val mission_patch : String,
	@SerializedName("mission_patch_small") val mission_patch_small : String,
	@SerializedName("reddit_campaign") val reddit_campaign : String,
	@SerializedName("reddit_launch") val reddit_launch : String,
	@SerializedName("reddit_recovery") val reddit_recovery : String,
	@SerializedName("reddit_media") val reddit_media : String,
	@SerializedName("presskit") val presskit : String,
	@SerializedName("article_link") val article_link : String,
	@SerializedName("wikipedia") val wikipedia : String,
	@SerializedName("video_link") val video_link : String,
	@SerializedName("youtube_id") val youtube_id : String,
	@SerializedName("flickr_images") val flickr_images : List<String>
)

data class Launch_site (

	@SerializedName("site_id") val site_id : String,
	@SerializedName("site_name") val site_name : String,
	@SerializedName("site_name_long") val site_name_long : String
)

data class Launch_failure_details (

	@SerializedName("time") val time : Int,
	@SerializedName("altitude") val altitude : String,
	@SerializedName("reason") val reason : String
)


data class Telemetry (

	@SerializedName("flight_club") val flight_club : String
)

data class Timeline (

	@SerializedName("webcast_liftoff") val webcast_liftoff : Int
)