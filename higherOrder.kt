import java.util.Scanner;

fun main(){
    var sc :Scanner = Scanner(System.`in`)
    System.out.println("Enter any two numbers to pass fro the paramerized methods ")
    var num1: Int = sc.nextInt()
    var num2: Int = sc.nextInt()
    hOdSum (::sumNN)
    hodSum (::sumNY)
    hodSum (num1,num2,::sumYN)
    hodSUM(num1,num2,::sumYY)
}

fun sumNN (){
    println("This method has no parameters and return type ")
    var sc : Scanner = Scanner(System.`in`)
    System.out.println("Enter the numbers one by one ")
    var num1 : Int = sc.nextInt()
    var num2 : Int  = sc.nextInt()
    var res : Int = num1 +num2

    System.out.println("$num1 + $num2 = $res")
}

fun sumNY():Int{
    System.out.println("This is the second type of the higher order function ")
    System.out.println("Enter the numbers one after the another")
    var sc : Scanner = Scanner(System.`in`)
    var num1 : Int = sc.nextInt()
    var num2 : Int = sc.nextInt()
    var summ : Int = num1+num2
    println("I am returning the sum of $num1 and $num2 to the called method")
    return summ
}

fun sumYN(num1:Int,num2:Int){
    System.out.println("This is the method that has no return type but it accepts the parameters")
    val sum : Int = num1 +num2
    System.out.println("$num1 + $num2 = $sum")
}

fun sumYY(num1:Int,num2:Int):Int{
    System.out.println("This method takes parameter input and also returns the data")
    var summ : Int = num1+num2;

    return summ;
}

fun hOdSum(funsum : ()->Unit){
    funsum()
    println("This method is from the higher order function")
}

fun hodSum(funsumNY : ()->Int){
    System.out.println("this is the method with no parameters but has a return type")
    System.out.println("Summ from the return method ${funsumNY()}")
}

fun hodSum(num1:Int, num2:Int, funsumYN :(Int,Int)->Unit){
    println("This method is from the no return type higher order function")
    funsumYN(num1,num2)
}

fun hodSUM(num1:Int, num2:Int, funsumYY :(Int,Int)->Int){
    System.out.println("This is the higher order function")
    System.out.println("$num1 + $num2 = ${funsumYY(num1,num2)}")
}