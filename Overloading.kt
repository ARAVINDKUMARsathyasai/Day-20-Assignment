import java.util.Scanner;

fun add (num1 : Int, num2:Int) : Int {
    return num1+num2
}

fun add(num1:Float , num2:Int) : Float{
    return num1+num2;
}

fun main(){
    println("Enter the numbers as per the suggestion ")
    var num1 : Int
    var num2 :Int
    var num3 : Float
    println("Enter the integer number that has too be calculated")
    var sc : Scanner = Scanner(System.`in`)
    num1 = sc.nextInt()
    println("Enter the integer numbber again ")
    num2 = sc.nextInt()
    println("Enter the floating point number ")
    num3 = sc.nextFloat()
    
    System.out.println("Sum of the two integers $num1 + $num2 = $(add(num1,num2))")
    System.out.printf("Sum of the integer and float data %d + %f = %.2f",num2,num3,add(num3,num1))
}