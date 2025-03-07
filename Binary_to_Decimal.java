import java.util.*;
public class Binary_to_Decimal {
    
public static void Binary_to_Decimal(int Bin){

int pow = 0;
int decNum = 0;

while(Bin>0){
    int lastDig = Bin % 10;
    decNum = decNum + (lastDig * (int)Math.pow(2,pow));
    pow++;
    Bin = Bin/10;
}
System.out.println(decNum);

}


public static void main(String[] args) {
    Binary_to_Decimal(101);
}
}
