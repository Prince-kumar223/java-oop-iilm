import java.util.Scanner;

public class MethodOverloadingExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Example of method Overloading");
// creating an object of the class
        MethodOverloadingExamples obj = new MethodOverloadingExamples();
        System.out.println("sum of 2 integers:- " + obj.add(2,4));
        System.out.println("sum of 3 integers:-" + obj.add(2,5,6));
        System.out.println("sum of 2 doubles:- " +  obj.add(2.5 ,7.8));
        scanner.close();
    }
//    methods to add two integers
    public int add (int num1, int num2){
        return num1+num2;
    }
    public int add (int num1 , int num2 ,int num3){
        return num1 + num2+ num3;
    }
//    methods to add two doubles
    public double add(double num1 , double num2){
        return  num1 + num2;
    }
}
