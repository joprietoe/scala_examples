import ChecksumAccumulator.calculate

/*object Summer {
    def main(args: Array[String]) = {
        for (arg <- args)
            println(arg + ": " + calculate(arg))
    }
}*/

//scala.App: A trait(interface) to main substitution
object FallWinterSpringSummer extends App {
    for (season <- List("fall", "winter", "spring"))
        println(season + ": " + calculate(season))
}