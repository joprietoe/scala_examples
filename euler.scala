//Ex1
//233168
/*def mult(x:Int) = if( x % 3 == 0 || x % 5 == 0) true else false

var sum = 0
for( i <- 0 until 1000)
    if(mult(i))
        sum += i

print(sum)*/

def par(x:Int) = if(x % 2 == 0) true else false

var sum = 0
var f1 = 1
var f2 = 1
var fib = 0
val n = 90

while(fib <= n){
    fib = f1 + f2
    if(par(fib) && fib <= n )
        sum += fib
    f1 = f2
    f2 = fib
    
}

print(sum)