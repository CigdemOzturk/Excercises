import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello" + '\n' + "Cigdem");

        System.out.println((sum(74, 36)));

        System.out.println(reverseString("The quick brown fox"));

        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println(("Output: " + multiply(num1,num2)));
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static String reverseString(String str){
        String newString = "";

        for(int i = str.length() - 1; i >= 0; i--){
            newString += str.charAt(i);
        }
        return newString;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
}