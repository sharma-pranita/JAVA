public class Operators {
    public static void main(String[] args){
        // int a = 5;
        // // int b = ++a;
        // int b = a++;
        // System.out.println(b);
        // System.out.println(a);
        // System.out.println(b);


        // int A = 10;
        // int B = 2;
        // A = B;
        // System.out.println(A==B);
        // System.out.println(A);
        // System.out.println(B);




        // int x = 2, y = 5;
        // int exp1 = (x * y / x); //10/2=5
        // int exp2 = (x * (y / x)); //2*2=4
        // System.out.println(exp1);
        // System.out.print(exp2);




        // int x = 200, y = 50, z = 100;
        // if(x > y && y > z){
        //     System.out.println("Hello");
        // }

        // if(z > y && z < x){
        //     System.out.println("Java");
        // }

        // if((y+200) < x && (y+150) < z){
        //     System.out.println("Hello Java");
        // }


        // int x, y, z;
        // x = y = z = 2;
        // x += y;
        // y -= z;
        // z /= (x + y);
        // System.out.println(x + " " + y + " " + z);


        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;

        // int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);

        // System.out.println(exp);

        int x = 10, y = 5;

        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);

        System.out.println(exp1);
        System.out.println(exp2);
    }
}
