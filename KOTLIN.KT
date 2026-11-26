
data class Student(val name: String, val percentage: Double)

fun main() {

    
    val list = listOf(10, 20, 30)
    println("Read-only List: $list")
    println("Contains 20: ${list.contains(20)}")
    println("Get index 1: ${list[1]}")

    val mList = mutableListOf(10, 20, 30)
    mList.add(40)
    mList.remove(10)
    println("Mutable List: $mList")

    
    val set = setOf(1, 2, 3)
    println("\nRead-only Set: $set")
    println("Contains 2: ${set.contains(2)}")

    val mSet = mutableSetOf(1, 2, 3)
    mSet.add(4)
    mSet.remove(1)
    println("Mutable Set: $mSet")

    // 3. MAP
    val map = mapOf(1 to "A", 2 to "B")
    println("\nRead-only Map: $map")
    println("Get key 1: ${map[1]}")

    val mMap = mutableMapOf(1 to "A", 2 to "B")
    mMap[3] = "C"
    mMap.remove(1)
    println("Mutable Map: $mMap")

    // 4. FUNCTIONAL TRANSFORMATIONS
    val numbers = listOf(1, 2, 3, 4, 5)

    println("\nOriginal: $numbers")

    val doubled = numbers.map { it * 2 }
    println("Map: $doubled")

    val even = numbers.filter { it % 2 == 0 }
    println("Filter: $even")

    val sum = numbers.reduce { a, b -> a + b }
    println("Reduce (Sum): $sum")

    // 5. SORT STUDENTS
    val students = listOf(
        Student("Aman", 85.0),
        Student("Riya", 92.0),
        Student("Karan", 75.0),
        Student("Neha", 88.0)
    )

    val sorted = students.sortedByDescending { it.percentage }
    println("\nSorted Students:")
    sorted.forEach { println("${it.name}: ${it.percentage}") }

    // 6. GROUP BY
    val groups = students.groupBy {
        if (it.percentage >= 85) "Excellent" else "Good"
    }

    println("\nGrouped Students: $groups")
}
