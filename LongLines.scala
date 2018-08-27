import scala.io.Source

//Variante 1
/*object LongLines {
    def processFile(filename: String, width: Int) = {
        val source = Source.fromFile(filename)
        for (line <- source.getLines())
            processLine(filename, width, line)
    }

    private def processLine(filename: String, width: Int, line: String) = {
        if (line.length > width)
            println(filename + ": " + line.trim)
    
    }
}*/

//Variante 2
// paso processLine como inner function y elimino el private
/*object LongLines{
    def processFile(filename: String, width: Int) = {

        def processLine(filename: String, width: Int, line: String) = {
            if (line.length > width)
                println(filename + ": " + line.trim)
        }

        val source = Source.fromFile(filename)
        for (line <- source.getLines())
            processLine(filename, width, line)

    }

}*/

//Variante 3 (Preferida)
//inner function puede acceder a los parametros de la outer function
object LongLines{
    def processFile(filename: String, width: Int) = {

        def processLine(line: String) = {
            if (line.length > width)
                println(filename + ": " + line.trim)
        }

        val source = Source.fromFile(filename)
        for (line <- source.getLines())
            processLine(line)

    }

}