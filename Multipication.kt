import java.util.Scanner;

fun main(){
    var sc :Scanner = Scanner(System.`in`)
    System.out.println("Enter any two numbers to pass for the paramerized methods ")
    var num1: Int = sc.nextInt()
    var num2: Int = sc.nextInt()
    hOdMul (::mulNN)
    hodMul (::mulNY)
    hodmul (num1,num2,::mulYN)
    hodMUL(num1,num2,::mulYY)
}

fun mulNN (){
    println("This method has no parameters and return type ")
    var sc : Scanner = Scanner(System.`in`)
    System.out.println("Enter the numbers one by one ")
    var num1 : Int = sc.nextInt()
    var num2 : Int  = sc.nextInt()
    var res : Int = num1 *num2

    System.out.println("$num1 * $num2 = $res")
}

fun mulNY():Int{
    System.out.println("This is the second type of the higher order function ")
    System.out.println("Enter the numbers one after the another")
    var sc : Scanner = Scanner(System.`in`)
    var num1 : Int = sc.nextInt()
    var num2 : Int = sc.nextInt()
    var prod : Int = num1*num2
    println("I am returning the product of $num1 and $num2 to the called method")
    return prod
}

fun mulYN(num1:Int,num2:Int){
    System.out.println("This is the method that has no return type but it accepts the parameters")
    val prod : Int = num1 *num2
    System.out.println("$num1 + $num2 = $prod")
}

fun mulYY(num1:Int,num2:Int):Int{
    System.out.println("This method takes parameter input and also returns the data")
    var prod : Int = num1+num2;

    return prod;
}

fun hOdMul(funmul : ()->Unit){
    funmul()
    println("This method is from the higher order function")
}

fun hodMul(funmulNY : ()->Int){
    System.out.println("this is the method with no parameters but has a return type")
    System.out.println("Summ from the return method ${funmulNY()}")
}

fun hodmul(num1:Int, num2:Int, funmulYN :(Int,Int)->Unit){
    println("This method is from the no return type higher order function")
    funmulYN(num1,num2)
}

fun hodMUL(num1:Int, num2:Int, funmulYY :(Int,Int)->Int){
    System.out.println("This is the higher order function")
    System.out.println("$num1 + $num2 = ${funmulYY(num1,num2)}")
}
