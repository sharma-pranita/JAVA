import java.util.*;

public class Dec_to_Bin {

  public static void Dec_to_Bin(int n) {
    int pow = 0;
    int Bin = 0;

    while (n > 0) {
      int rem = n % 2;
      Bin = Bin + (rem * (int) (Math.pow(10, pow)));
      pow++;

      n = n / 2;
    }
    System.out.print(Bin);
  }

  public static void main(String[] args) {
    Dec_to_Bin(9);
  }
}
