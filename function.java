import java.util.Scanner;

public class function {

  public static void printHello() {
    System.out.println("Hello World");
  }

  public static void sum(int x, int y) {
    int add = x + y;
    System.out.println(add);
  }

  public static void swap(int x, int y) {
    int temp = x;
    x = y;
    y = temp;

    System.out.println(
      "Value of a is now : " + x + " and the Value of b is now : " + y
    );
  }

  public static double mul(int a, int b) {
    double mul = a * b;
    // System.out.println(mul);
    return mul;
  }

  public static int fact(int a) {
    int fact = 1;
    for (int i = 1; i <= a; i++) {
      fact = fact * i;
    }
    // System.out.println(fact);
    return fact;
  }

    public static int bino(int n, int r) {
//   int factOfr = 1;
//   for (int i = 1; i <= r; i++) {
//     factOfr = factOfr * i;
//   }

//   int factOfn = 1;
//   for (int i = 1; i <= n; i++) {
//     factOfn = factOfn * i;
//   }

//   int deno = n - r;
//   int factOfDeno = 1;
//   for (int i = 1; i <= deno; i++) {
//     factOfDeno = factOfDeno * i;
//   }

int factOfn = fact(n);
int factOfr = fact(r);
int factOfDeno = fact(n-r);

  int Binomial = factOfn / (factOfr * factOfDeno);
  return Binomial;
    }

  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int a = scn.nextInt();
    System.out.println("Enter the value of r : ");
    int b = scn.nextInt();
    // printHello();

    // sum(a,b);

    // swap(a, b);

    // mul(a,b);
    // System.out.println(mul(a,b));

    // fact(a);


    //1
    // System.out.println("Binomial Coefficient is = "+ bino(a,b));


    //2
    // int factOfn = fact(a);
    // int factOfr = fact(b);
    // int factOfnMinr = fact((a - b));

    // System.out.println(
    //   "Binomial Coefficient : " + factOfn / (factOfr * factOfnMinr)
    // );


    //3
    // System.out.println("Binomial Coefficient : " + bino(a,b));



    


  }
}
