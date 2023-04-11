import java.util.Scanner;

class Multiplication {
    private var sc : Scanner = Scanner(System.`in`)
    private var num1: Int = 0
    private var num2 : Int = 0

    fun mulNN(){
        System.out.println("This method does not take any parameters and will return nothing")
        System.out.println("Enter two numbers that are to be multiplied")
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("$num1 * $num2 = ${num1*num2}")
    }

    fun hofunNN(mulNN:()->Unit){
        println("This is the higher order funtion with a non paramiterized and non return type method has an input")
        mulNN();
    }

    fun mulNY():Int{
        System.out.println("This method does not take any parameters and will return nothing")
        System.out.println("Enter two numbers that are to be multiplied")
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.print("$num1 * $num2 = ")
        return (num1*num2)
    }

    fun hofunNY(mulNY:()->Int){
        println("This is the higher order funtion with a non paramiterized  with return type method has an input")
        println(mulNN());
    }
}
