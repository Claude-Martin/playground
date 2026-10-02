// hello.kts
val name = "Kotlin"
println("Hello, $name!")

fun square(x: Int) = x * x

println("7 squared is ${square(7)}")

val languages = listOf("Kotlin", "Java", "Scala")
for (lang in languages) {
    println("I know about $lang")
}
