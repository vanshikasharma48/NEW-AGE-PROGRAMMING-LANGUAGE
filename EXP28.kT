
fun main() {

    
    var name: String = "Vanshika"
    var city: String? = null

    println("Name: $name")
    println("City: $city")

   
    println("City Length: ${city?.length}")

   
    val result = city ?: "Not Available"
    println("City: $result")

    // Not-null Assertion Operator
    try {
        println(city!!.length)
    } catch (e: NullPointerException) {
        println("NullPointerException Caught!")
    }
}
