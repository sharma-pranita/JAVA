public class Advance_Pattern {

  // public static void hollowRect(int rows,int cols){
  //     for (int i = 1; i <= rows; i++) {
  //         for (int j = 1; j <= cols; j++) {
  //           if (i == 1 || i == rows || j == 1 || j == cols) {
  //             System.out.print("*");
  //           }
  //           else{
  //               System.out.print(" ");
  //           }
  //         }
  //         System.out.println();
  //       }
  // }

  //   public static void RotaPyr(int rows, int cols) {
  //     for (int i = 1; i <= rows; i++) {
  //       for (int j = 1; j <= rows - i; j++) {
  //         System.out.print(" ");
  //       }
  //       for (int k = 1; k <= i; k++) {
  //         System.err.print("*");
  //       }
  //       System.out.println();
  //     }
  //   }

  //   public static void InvertPyr(int n) {
  //     for (int i = 1; i <= n; i++) {
  //       //   int num = 1;
  //       for (int k = 1; k <= n - i + 1; k++) {
  //         System.out.print(k);
  //         // num++;
  //       }
  //       System.out.println();
  //     }
  //   }

  //   public static void Floyd(int n) {
  //     int num = 1;
  //     for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j <= i; j++) {
  //         System.out.print(num);
  //         num++;
  //       }
  //       System.out.println();
  //     }
  //   }

  // public static void Tri(int n){
  //     for(int i =1;i<=n;i++){
  //         for(int j =1 ; j<=i;j++){
  //             if((i==j)||((i+j)%2==0)){
  //                 System.out.print(1);
  //             }
  //             else{
  //                 System.out.print(0);
  //             }
  //         }
  //         System.out.println();
  //     }
  // }

  //   public static void Butterfly(int n) {
  //     for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j <= i; j++) {
  //         System.out.print("*");
  //       }
  //       for (int k = 1; k <= 2*(n - i); k++) {
  //         System.out.print(" ");
  //       }
  //     //   for (int k = 1; k <= n - i; k++) {
  //     //     System.out.print(" ");
  //     //   }
  //       for (int j = 1; j <= i; j++) {
  //         System.out.print("*");
  //       }
  //       System.out.println();
  //     }

  //     for (int i = n; i >= 1; i--) {
  //       for (int j = 1; j <= i; j++) {
  //         System.out.print("*");
  //       }
  //       for (int k = 1; k <=2*(n - i); k++) {
  //         System.out.print(" ");
  //       }
  //     //   for (int k = 1; k <= n - i; k++) {
  //     //     System.out.print(" ");
  //     //   }
  //       for (int j = 1; j <= i; j++) {
  //         System.out.print("*");
  //       }
  //       System.out.println();
  //     }
  //   }

  // public static void Rhombus(int n) {
  //   //Approach1
  //   for (int i = 1; i <= n; i++) {
  //     for (int j = 1; j <= n - i; j++) {
  //       System.out.print(" ");
  //     }
  //     for (int j = 1; j <= i - 1; j++) {
  //       System.out.print("*");
  //     }
  //     for (int k = 1; k <= 1; k++) {
  //       System.out.print("*");
  //     }
  //     for (int j = 1; j <= n - i; j++) {
  //       System.out.print("*");
  //     }
  //     System.out.println();
  //   }
  // }

  //  public static void Rhombus(int n) {
  //   //Approach2
  //   for (int i = 1; i <= n; i++) {
  //     for (int j = 1; j <= n - i; j++) {
  //       System.out.print(" ");
  //     }
  //     for (int j = 1; j <= 5; j++) {
  //       System.out.print("*");
  //     }
  //     for (int j = 1; j <= i-1; j++) {
  //       System.out.print(" ");
  //     }
  //     System.out.println();
  //   }
  // }

  // public static void HollowRhom(int n) {
  //   for (int i = 1; i <= n; i++) {
  //     for (int j = 1; j <= n - i; j++) {
  //       System.out.print(" ");
  //     }
  //     for (int j = 1; j <= n; j++) {
  //       if (i == 1 || i == n || j == 1 || j == n) {
  //         System.out.print("*");
  //       } else {
  //         System.out.print(" ");
  //       }
  //     }
  //     System.out.println();
  //   }
  // }

  public static void Diam(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= ((2 * i) - 1); j++) {
        System.out.print("*");
      }

      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }

    for (int i = 4; i >=1; i--) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= ((2 * i) - 1); j++) {
        System.out.print("*");
      }

      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    //    hollowRect(4,5 );
    // RotaPyr(4, 4);
    // InvertPyr(5);
    // Floyd(5);
    // Tri(5);
    // Butterfly(4);
    // Rhombus(5);
    // HollowRhom(5);
    Diam(4);
  }
}
