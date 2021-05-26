
fun main() {

    var bodyStats = BodyStats(
        height = 10,
        weight = 160,
    )
    var bodyStat = BodyStats(
        height = 15,
        weight = 140,
    )
    var bmi = bmiCalculator(bodyStats)

    println(bmi)
}

data class BodyStats(
    var height: Int,
    var weight: Int,
    var bmi: Int = 0,
    var weightStatus: String? = null
)

fun bmiCalculator(bodyStats: BodyStats): BodyStats {

    bodyStats.bmi = bodyStats.weight / bodyStats.height


    if (bodyStats.bmi == 0 || bodyStats.bmi <= 18) {
        bodyStats.weightStatus = "underweight"
    } else if (bodyStats.bmi!! >= 19 && bodyStats.bmi!! <= 25) {
        bodyStats.weightStatus = "normal"
    } else if (bodyStats.bmi!! >= 26 && bodyStats.bmi!! <= 30) {
        bodyStats.weightStatus = "overweight"
    } else {
        bodyStats.weightStatus = "obese"
    }
    return bodyStats
}

//    when (bodyStats.bmi) {
//        in 0..19 -> {
//            bodyStats.weightStatus = "underweight"
//        }
//        in 20..25-> {
//            bodyStats.weightStatus = "normal"
//        }
//        in 26..30 -> {
//            bodyStats.weightStatus = "overweight"
//        }
//        else-> bodyStats.weightStatus = "obese"
//    }
//    return bodyStats
//}
