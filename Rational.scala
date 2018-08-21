/*class Rational(n:Int, d:Int){
    //println("Created " + n + "/" + d)
    //Dentro del constructor.
    //Duda en toString pero al parecer se autodefine dentro del constructor
    //como algo predeterminado ??
    require(d != 0) //Predef scala objects. Precondition
    override def toString = n + "/" + d
    
    //Afuera del constructor
    //No compila porque n y d no son miembros de la clase.
    //def add(that: Rational): Rational =
    //    new Rational(n * that.d + that.n * d, d * that.d)
    def add()
}*/

class Rational(n:Int, d:Int){
    require(d != 0)
    //public by default
    //val number = n 
    //val denom = d

    //Para mantener las fracciones lo mas pequenhas posibles
    private val g = gcd(n.abs, d.abs) 
    val numer = n / g
    val denom = d / g

    def this(n: Int) = this(n, 1) // auxiliary constructor new Rational(3) = new Rational(3,1)

    //def add(that:Rational):Rational = 
    //    new Rational(number * that.denom + denom * that.number, denom * that.denom)    //oneHalf add twoThirds
    
    //Como + es una funcion podemos definirla para nuestro objeto
    //No es una sobrecarga de operador, es una definicion de funcion
    //this.+(that)
    def + (that: Rational): Rational =
        new Rational(numer * that.denom + that.numer * denom,
                    denom * that.denom)
    
    def + (i: Int): Rational = new Rational(numer + i * denom, denom)

    
    def - (that: Rational): Rational = 
        new Rational(numer * that.denom - that.numer * denom,
                    denom * that.denom)
    def - (i: Int): Rational =
        new Rational(numer - i * denom, denom)

    def * (that: Rational): Rational =
        new Rational(numer * that.numer, denom * that.denom)
    
    def * (i: Int): Rational = new Rational(numer * i, denom)

    def / (that: Rational): Rational =
        new Rational(numer * that.denom, denom * that.numer)
    
    def / (i: Int): Rational =
        new Rational(numer, denom * i)    
    
    def lessThan(that: Rational) = 
        this.numer * that.denom < that.numer * this.denom

    def max(that: Rational) =
        if (lessThan(that)) that else this

    override def toString = numer + "/" + denom

    private def gcd(a: Int, b: Int): Int =
        if (b == 0) a else gcd(b, a % b)

}