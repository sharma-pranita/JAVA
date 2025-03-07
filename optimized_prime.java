import java.util.*;

public class optimized_prime {

  public static boolean prime(int n) {
    boolean prime = true;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false; 
      } 
      }
      return true;
    }

    public static void primeInRange(int range){
        for(int i=2; i<=range;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
    } 
  

  public static void main(String[] args) {
    System.out.println(prime(9));
  }
}
