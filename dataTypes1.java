import java.util.Scanner;
public class dataTypes1 {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

    //1
    // System.out.println("Enter num :");
    // boolean num = scn.nextBoolean();
    // System.out.println(num);


    //2
    System.out.println("Enter the value of a :");
    double a = scn.nextDouble();
    System.out.println("Enter the value of b :");
    double b = scn.nextDouble();
    // double sum = a + b ;
    // System.out.println("The Sum of two nos. is " + sum);

    // double product = a * b ;
    // System.out.println("The Product of two nos. is " + product);

    double areaCirc = 3.14 * a * a ;
    System.out.println("The area of circle is "+ areaCirc);
    }
}
