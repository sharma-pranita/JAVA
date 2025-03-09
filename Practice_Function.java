import java.util.*;

public class Practice_Function {

  public static void avg(double a, double b, double c) {
    double avg = (a + b + c) / 3;
    System.out.println(avg);
  }

  public static boolean even(int n) {
    boolean isEven = false;
    if (n % 2 == 0) {
      isEven = true;
      return isEven;
    }
    isEven = false;
    return isEven;
  }

  public static boolean palindrome(int n) {
    int originalNum = n;

    int reverseNum = 0;

    while (n > 0) {
      int lastDig = n % 10;
      reverseNum = reverseNum * 10 + lastDig;

      n = n / 10;
    }
    if (originalNum == reverseNum) {
      return true;
    } else {
      return false;
    }
  }

  public static void Sum(int n) {
    int sum = 0;

    while (n > 0) {
      int lastDig = n % 10;
      sum = sum + lastDig;

      n = n / 10;
    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    //1
    // Scanner scn = new Scanner(System.in);
    // System.out.println("Enter the value of a : ");
    // double a = scn.nextDouble();
    // System.out.println("Enter the value of b : ");
    // double b = scn.nextDouble();
    // System.out.println("Enter the value of c : ");
    // double c = scn.nextDouble();
    // avg(a,b,c);

    //2
    // System.out.println(even(8));

    // //3
    // System.out.println(palindrome(100));

    //4
    Sum(1234);
  }
}
