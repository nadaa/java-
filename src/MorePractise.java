import java.util.Scanner;
public class MorePractise {
    public static void main(String[] args) {
//        acceptAndReverse(5);
//        repeatString("dog", 4);
//        acceptAndReverseMe(5);
//        firstAndLast(123);
        firstDigit(123);
        lastDigit(123);
    }

//    public static void acceptAndReverse(int n) {

//        int[] num = new int[n];
//        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < num.length; i++) {
//            System.out.printf("enter a number :");
//            num[i] = scan.nextInt();
//        }
//        for (int i = num.length; i >= 0; i--) {
//            System.out.println(i);
//        }
//
//    }
//
//    public static void acceptAndReverseMe(int n) {

//        int[] num = new int[n];
//        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < num.length; i++) {
//            System.out.printf("enter a number :");
//            num[i] = scan.nextInt();
//        }
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }
//        for (int i = num.length; i > 0; i--) {
//            System.out.println(num[i]);
//        }
//
//    }
//
//    public static void repeatString(String str, int count) {
//        String word = "";
//        for (int i = 0; i < count; i++) {
//            word += str;
//        }
//        System.out.println("the final word is:" + word);
//
//    }

    //    public static int firstAndLast(int n){
//
//
//
//
//
//    }
    public static int firstDigit(int n) {
        if (n / 10 == 0) {
            return n;
        } else {
            return firstDigit(n / 10);
        }
    }

    public static int lastDigit(int n) {
        return n % 10;
    }


}
