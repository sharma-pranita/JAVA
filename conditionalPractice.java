import java.util.*;

public class conditionalPractice {

  public static void main(String[] args) {
    //1
    // Scanner scn = new Scanner(System.in);
    // System.out.println("Enter the number : ");
    // double A = scn.nextDouble();
    // if (A >= 0) {
    //   System.out.println("Positive Number");
    // } else {
    //   System.out.println("Negative Number");
    // }

    //2
    // double temp = 103.5;
    // if(temp>100){
    //     System.out.println("You have fever");
    // }
    // else{
    //     System.out.println("You don't have fever");
    // }

    // Scanner scn = new Scanner(System.in);
    // System.out.println("Enter a week day : ");
    // int week = scn.nextInt();
    // switch (week) {
    //   case 1:
    //   System.out.println("It's Monday!");
    //     break;
    //   case 2:
    //   System.out.println("It's Tuesday!");
    //     break;
    //   case 3:
    //   System.out.println("It's Wednesday!");
    //     break;
    //   case 4:
    //   System.out.println("It's Thursday!");
    //     break;
    //   case 5:
    //   System.out.println("It's Friday!");
    //     break;
    //   case 6:
    //   System.out.println("It's Saturday!");
    //     break;
    //   case 7:
    //   System.out.println("It's Sunday!");
    //     break;
    //   default:
    //   System.out.println("You have entered wrong number");
    //     break;
    // }

    //4
    // int a= 63 , b=36;
    // boolean x = (a<b)? true : false;
    // System.out.println(x);
    // int y = (a>b)? a:b;
    // System.out.println(y);

    //5

    Scanner scn = new Scanner(System.in);
    System.out.println("Enter Year :");
    int Year = scn.nextInt();
    if (Year % 4 == 0) {
      if (Year % 100 == 0) {
        if (Year % 400 == 0) {
          System.out.println("Leap Year");
        } else {
          System.out.println("Not a Leap Year");
        }
      } else {
        System.out.println("Leap Year");
      }
    } else {
      System.out.println("Not a Leap Year");
    }
  }
}
