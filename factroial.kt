import java.util.Scanner;

fun main(){
    var sc : Scanner = Scanner(System.`in`);
    var num : Int ;
    println("Enter the number to which the factorial has to be calculated ")
    num = sc.nextInt()
    var fact : Int
    fact = 1
    for(i in num downTo 1){
        fact = fact*i;
    }
    System.out.println("Factorial of $num = $fact")
}