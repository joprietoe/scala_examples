/*var i = 0
while( i < args.length){
    if (i != 0)
        print(" ")
    print(args(i))
    i += 1
}
println()*/

//Implicit
//args.foreach(arg => println(arg))

//Explicit
args.foreach((arg:String) => println(arg))