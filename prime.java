public class prime {

  public static boolean isPrime(int n) {
    boolean isPrime = true;
    for (int i = 2; i <= n - 1; i++) {
      if (n % i == 0) {
        return false;
      }
      // else{
      //     System.out.println("Prime no.");
      // }

    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPrime(9));
  }
}
