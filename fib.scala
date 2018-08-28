object Fib{

   def main(args: Array[String]) = {
        val v = fib(args(0).toInt)
        println(v)
    }

    def fib(n: Int): Int = {
        @annotation.tailrec
        /*val fib1 = 0
        val fib2 = 1*/
        def aux_fib(n: Int, f1: Int, f2: Int): Int = {
            if(n == 0) f1
            else if (n == 1) f2
            else aux_fib(n-1, f2, f1 + f2)
        }
        
        aux_fib(n,0,1)
    }

    
}
