import java.util.Scanner;

public class loops {

  public static void main(String[] args) {
    // int counter = 1;
    Scanner scn = new Scanner(System.in);

    //1 While Loop
    // System.out.println("Enter the n-th term :");
    // int n = scn.nextInt();
    // while(counter<=n){
    //     System.err.println(counter);
    //     counter++;
    // }

    //2
    // System.out.println("Enter the start term :");
    // int n = scn.nextInt();
    // int sum = 0;
    // while (n <= 9 && n >= 1) {
    //   sum = sum + n;

    //   n++;
    // }
    // System.out.println(sum);

    //3 For Loop

    // for(int i = 1 ; i<=4 ; i++){
    //     System.out.println("****");

    // }

    //4
    // System.out.println("Enter the three digit number");
    // int n = scn.nextInt();

    // int last;

    // while(n>0){
    //     last = n% 10;
    //     System.out.println(last);
    //     n= n/10;
    // }

    //5
    // System.out.println("Enter the digit ");
    // int n = scn.nextInt();

    // int last;
    // int rev = 0;
    // while (n > 0) {
    //   last = n % 10;
    //   rev = (rev*10)+last;
    //   System.out.println(last);
    //   n = n / 10;
    // }

    //6 Break Statement
    // for(int i = 0 ; i <= 6 ; i++){
    //     if(i == 3){
    //         System.out.println("break");
    //         break;
    //     }
    //     System.out.println(i);
    // }

    // do {
    //   System.out.println("Enter the number :");
    //   int n = scn.nextInt();
    //   if (n % 10 == 0) {
    //     System.out.println("You have enter multiple of 10");
    //     break;
    //   }
    //   System.out.println(n);
    // } while (true);

    //  do {
    //   System.out.println("Enter the number :");
    //   int n = scn.nextInt();
    //   if (n % 10 == 0) {
    //     System.out.println("You have enter multiple of 10");
    //     continue;
    //   }
    //   System.out.println(n);
    // } while (true);

    //Checking prime number--
    System.out.println("Enter the number : ");
    int n = scn.nextInt();

    boolean isPrime = true;
    for (int i = 2; i <= n - 1; i++) {
      if (n % i == 0) {
        isPrime = false;
      }
    }
    if (isPrime == true) {
      System.out.println(n + " is a Prime number");
    } else {
      System.out.println("Not a prime number");
    }
  }
}
