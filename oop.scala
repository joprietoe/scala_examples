import scala.collection.mutable

class ChecksumAccumulator{
    private var sum = 0

    def add(b: Byte):Unit = {
        sum += b
    }

    /*def checksum(): Int = {
        return ~(sum & 0xFF) + 1
    }*/

    def checksum(): Int = ~(sum & 0xFF) + 1
}

//Singlenton object  ChecksumAccumulator , not class
object ChecksumAccumulator {
    private val cache = mutable.Map.empty[String, Int]
    def calculate(s: String): Int =
        if (cache.contains(s))
            cache(s)
        else {
            val acc = new ChecksumAccumulator  //Class deined above
            for (c <- s)
                acc.add(c.toByte)
        val cs = acc.checksum()
        cache += (s -> cs)
        cs // Return value
        }
    }

   