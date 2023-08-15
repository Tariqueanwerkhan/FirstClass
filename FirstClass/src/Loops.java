import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //for loop
        /*
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Hello World");
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
         */

        //while loop
        /*
        int i = 0;
        while(i < 11){
            System.out.println(i);
            i++;
        }
         */

         // do while
        /*
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while(i < 11);
    }
         */

        //print the sum of first n natural numbers.

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);



//        int n = 4;
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i*n);
        }
    }
}
