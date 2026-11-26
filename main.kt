
data class Student(val id: Int, val name: String, val email: String?)
data class Course(val name: String, val instructor: String, val credits: Int)
data class Registration(val student: Student, val course: Course, val marks: Int?)

fun Registration.isPassed() = (marks ?: 0) >= 40
fun Registration.grade() = when (marks ?: 0) {
    in 90..100 -> "A"
    in 80..89 -> "B"
    in 70..79 -> "C"
    in 60..69 -> "D"
    in 40..59 -> "E"
    else -> "F"
}

fun Registration.info() = 
    "${student.name} | ${student.email ?: "No Email"} | ${course.name} | ${marks ?: "N/A"} | ${grade()}"

class Report {
    val data = mutableListOf<String>()
    fun heading(s: String) { data.add("\n=== $s ===") }
    fun section(s: String) { data.add(s) }
    fun build() = data.joinToString("\n")
}

fun report(block: Report.() -> Unit) = Report().apply(block)

fun main() {
    val students = listOf(
        Student(101, "Aditya", "aditya@college.edu"),
        Student(102, "Nisha", null),
        Student(103, "Rahul", "rahul@college.edu")
    )

 val courses = listOf(
        Course("App Development", "Prof. Kapoor", 4),
        Course("Cloud Computing", "Prof. Iyer", 3)
    )

    val registrations = listOf(
        Registration(students[0], courses[0], 88),
        Registration(students[1], courses[0], 79),
        Registration(students[2], courses[1], 35)
    )

    val names = registrations.map { it.student.name }
    val passed = registrations.filter { it.isPassed() }
    val total = registrations.mapNotNull { it.marks }.reduceOrNull { a, b -> a + b } ?: 0
    val grouped = registrations.groupBy { it.course.name }
    val averages = grouped.mapValues { it.value.mapNotNull { r -> r.marks }.average() }

    println("Names: $names")
    println("Passed: ${passed.map { it.student.name }}")
    println("Total Marks: $total")
    println("Grouped: ${grouped.mapValues { it.value.size }}")
    println("Averages: $averages")

    val result = report {
        heading("COURSE REPORT")
        section("Registrations: ${registrations.size}")
        section("Passed: ${passed.size}")
        section("Total Marks: $total")
        section("Averages: $averages")
        section(registrations.joinToString("\n") { it.info() })
    }

    println(result.build())
}
