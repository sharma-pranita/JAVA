import java.util.*;

public class Conditional {

  public static void main(String[] args) {
    //1 : If-else Statements
    // int age = 18;
    // if(age>=18){
    //     System.out.println("You are an adult");
    // }
    // else{
    //     System.out.println("Not adult");
    // }

    //2
    // int A = 5, B = 10;
    // if (A>=B){
    //     System.out.println("A is greater than B");
    // }
    // else{
    //     System.out.println( "B is greater than A");
    // }

    //3
    // int A = 5;
    // Scanner scn = new Scanner(System.in);
    // System.out.print("Enter the value of A :");
    // int A = scn.nextInt();

    // if (A % 2 == 0) {
    //   System.out.println("Number is even");
    // } else {
    //   System.out.println("Number is odd");
    // }

    //4
    // int age = 13;
    // if (age >= 18) {
    //   System.out.println("You are an adult");
    // } else if (age >= 12 && age < 18) {
    //   System.out.println("You are a teenager");
    // }
    // else{
    //   System.out.println("You are neither a teenager nor an adult ");
    // }

    //5
    // double income = 15;
    // double tax = 0;
    // if (income < 5) {
    //   tax = 0;
    //   System.out.println("You have to pay tax : " + tax);
    // } else if (income >= 5 && income <= 10) {
    //   tax = income * (0.2);
    //   System.out.println("You have to pay tax : " + tax);
    // } else {
    //   tax = income * (0.3);
    //   System.out.println("You have to pay tax : " + tax);
    // }

    //6
    // int A = 5;
    // int B = 6;
    // int C = 7;
    // if (A >= B && A >= C) {
    //   System.out.println("A is greater");
    // } else if (B >= C) {
    //   System.out.println("B is greater");
    // } else {
    //   System.out.println("C is greater");
    // }

    //7 : Ternary Operators
    // int A = 5;
    // int B = 10;
    // String greaterVar = (A > B) ? "A is greater than B" : "B is greater than A";
    // System.out.println(greaterVar);

    //8
    // int Marks = 33;
    // String Check = (Marks >= 33) ? "Pass" : "Fail";
    // System.out.println(Check);

    //9 Switch Statement
    // String[] fruits = { "Apple", "Mango", "Banana", "Orange" };
    // Scanner scn = new Scanner(System.in);
    // System.out.println("Enter the index");
    // int i = scn.nextInt();
    // switch (i) {
    //   case 0:
    //     System.out.println(fruits[0]);
    //     break;
    //   case 1:
    //     System.out.println(fruits[1]);
    //     break;
    //   case 2:
    //     System.out.println(fruits[2]);
    //     break;
    //   case 3:
    //     System.out.println(fruits[3]);
    //     break;
    //   default:
    //     System.out.println("No fruits");
    // }


    //10

    // Scanner scn = new Scanner (System.in);
    // System.out.println("Enter the value of operand A :");
    // double A = scn.nextDouble();
    // System.out.println("Enter the value of operand B :");
    // double B = scn.nextDouble();
    // System.out.println("Enter the operation you want to perform :");
    // String operator = scn.next();

    // switch(operator){
    //   case "+" : 
    //   System.out.println( "The result of A + B is : " + (A + B));
    //   break;
    //   case "-" : 
    //   System.out.println("The result of A - B is : " + (A - B));
    //   break;
    //   case "*" : 
    //   System.out.println( "The result of A * B is : " + (A * B));
    //   break;
    //   case "/" : 
    //   System.out.println( "The result of A / B is : " + (A / B));
    //   break;
    // }
  }
}
