import java.util.*;

public class loopsPractice {

  public static void main(String[] args) {
    //1
    // for(int i=0 ; i<5 ; i++){
    //     System.out.println("Hello");
    //     i+=2;
    // }

    //2
    // int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    // int sumEven = 0;
    // int sumOdd = 0;
    // for (int i = 0; i < arr.length; i++) {
    //   if (arr[i] % 2 == 0) {
    //     sumEven = sumEven + arr[i];
    //   } else {
    //     sumOdd = sumOdd + arr[i];
    //   }

    // }

    // System.out.println("Sum of even number :" + sumEven);
    // System.out.println("Sum of odd integer :" + sumOdd);

    //3

    //     Scanner scn = new Scanner(System.in);
    //     System.out.println("Enter the number: ");
    //     int num = scn.nextInt();
    //     int fact = 1;
    // for(int i = 2 ; i<=num ; i++){
    // fact *=i;
    // }
    // System.out.println("Factorial of "+num + " is : "+ fact);

    //4
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = scn.nextInt();
    int mul = 1;
    for (int i = 1; i <= 10; i++) {
      mul = num * i;
      System.out.println(mul);
    }
  }
}
