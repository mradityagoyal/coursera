package week1

object wk1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def square(x: Double) = x * x                   //> square: (x: Double)Double

  def sumOfSquares(x: Double, y: Double) = square(x) + square(y)
                                                  //> sumOfSquares: (x: Double, y: Double)Double

  square(3)                                       //> res0: Double = 9.0

  sumOfSquares(3, 4)                              //> res1: Double = 25.0

  def abs(x: Double) = if (x >= 0) x else -x      //> abs: (x: Double)Double

  def and(x: Boolean, y: => Boolean) = if (x) y else false
                                                  //> and: (x: Boolean, y: => Boolean)Boolean

  and(false, false)                               //> res2: Boolean = false

  def or(x: Boolean, y: => Boolean) = if (x) true else y
                                                  //> or: (x: Boolean, y: => Boolean)Boolean
  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) = abs(x - guess * guess) / x < .001

    def improve(guess: Double) = (guess + x / guess) / 2

    sqrtIter(1.0)

  }                                               //> sqrt: (x: Double)Double
  sqrt(2)                                         //> res3: Double = 1.4142156862745097
  or(true, false)                                 //> res4: Boolean = true
  or(false, true)                                 //> res5: Boolean = true
  or(false, false)                                //> res6: Boolean = false
  or(true, true)                                  //> res7: Boolean = true
  
  
  def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a%b)
                                                  //> gcd: (a: Int, b: Int)Int
  
  gcd(14,21)                                      //> res8: Int = 7
  
  def factorial(n: Int): Int = if (n==0) 1 else n * factorial(n-1)
                                                  //> factorial: (n: Int)Int
  
  factorial(4)                                    //> res9: Int = 24

}