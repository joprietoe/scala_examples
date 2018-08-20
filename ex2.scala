/*val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"
for (i <- 0 to 2)
    print(greetStrings(i))*/

/*
 Listas son inmutables, como String en Java.
 Son ListDE con un puntero al principio.
 1. Cuando se adiciona o elimina un valor se crea
 una nueva lista a partir de la anterior.
 2. Se adiciona al principio.
 3. Comportamiento como Prolog (Head,Tail)
*/
/*val oneTwoThree = List(1, 2, 3)
val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour //concatena dos listas
println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")*/

/*val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree //adiciona al frente twoThree.::(1) porque el operador termina con :
println(oneTwoThree)*/

/*val oneTwoThree = 1 :: 2 :: 3 :: Nil
println(oneTwoThree)*/

/*val thrill = List("Will","fill","until")
val c = thrill.mkString("")
println(c)*/

/*
Tuples: Igual a lista pero se combinan varios tipos
Se accede a los elementos como variable._index 
*/

/*val pair = (99, "Luftballons")
var(n,m) = pair
println(pair._1)
println(pair._2)
n = n + 1
println(n)
println(m)*/

/*
Set and Maps:

*/

/*
//Inmutable (default)
var jetSet = Set("Boeing", "Airbus") // Set.apply("Boeing", "Airbus")
jetSet += "Lear" // new Set jetSet
println(jetSet.contains("Cessna"))

//Mutable
import scala.collection.mutable //Need to import 
val movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek" //movie.+=("Shrek")
println(movieSet) */

import scala.io.Source

if (args.length > 0) {
    for (line <- Source.fromFile(args(0)).getLines())
        println(line.length + " " + line)
}
else
    Console.err.println("Please enter filename")
