import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//
//        if(age > 20){
//            System.out.println("Adult");
//        }
//        else{
//            System.out.println("Not Adult");
//        }
      /*
        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

      */
/*
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Equal");
        } else if(a > b){
            System.out.println("a is greater");
        }
        else {
            System.out.println("a is Lesser");
        }

 */

        /*

        int button = sc.nextInt();
        if (button == 1) {
            System.out.println("Hello");
        }
        else if(button == 2){
            System.out.println("Namaste");
        }
        else if(button == 3){
            System.out.println("Guten Tag");
        }
        else{
            System.out.println("Invalid");
        }

         */

        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Guten Tag");
            break;
            default : System.out.println("Invalid Button");
        }
    }
}
