import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Game24 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] num = new int[4];
        int in1 = -1, in2 = -1, in3 = -1, in4 = -1;
        int temp_input;
        boolean ans_validity = false;
        String temp_sign = "a";
        char sign1 = 'a', sign2 = 'a', sign3 = 'a';
        double result = 0;
        double std_result = 24;

        // Init
        for (int i = 0; i < num.length; i++)
            num[i] = rand.nextInt(10); // can be 0 - 9

        // Display
        System.out.println("Make 24");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println();

        // get AnswerNo1 and remove element
        ans_validity = false;
        do {
            temp_input = sc.nextInt();
            for (int i = 0; i < num.length; i++) {
                if (temp_input == num[i]) {
                    ans_validity = true;
                    in1 = num[i];
                    num = removeElementByIndex(num, i);
                    break;
                }
            }
        } while (ans_validity == false);

        // get Sign1
        ans_validity = false;
        do {
            temp_sign = sc.next();
            if (temp_sign.charAt(0) == '+' || temp_sign.charAt(0) == '-' || temp_sign.charAt(0) == '*'
                    || temp_sign.charAt(0) == 'x' || temp_sign.charAt(0) == 'X' || temp_sign.charAt(0) == '/') {
                sign1 = temp_sign.charAt(0);
                if (temp_sign.charAt(0) == 'x' || temp_sign.charAt(0) == 'X') {
                    sign1 = '*';
                }
                ans_validity = true;
            }
        } while (ans_validity == false);

        // get AnswerNo2 and remove element
        ans_validity = false;
        do {
            temp_input = sc.nextInt();
            for (int i = 0; i < num.length; i++) {
                if (temp_input == num[i]) {
                    ans_validity = true;
                    in2 = num[i];
                    num = removeElementByIndex(num, i);
                    break;
                }
            }
        } while (ans_validity == false);

        // get sign2
        ans_validity = false;
        do {
            temp_sign = sc.next();
            if (temp_sign.charAt(0) == '+' || temp_sign.charAt(0) == '-' || temp_sign.charAt(0) == '*'
                    || temp_sign.charAt(0) == 'x' || temp_sign.charAt(0) == 'X' || temp_sign.charAt(0) == '/') {
                sign1 = temp_sign.charAt(0);
                if (temp_sign.charAt(0) == 'x' || temp_sign.charAt(0) == 'X') {
                    sign2 = '*';
                }
                ans_validity = true;
            }
        } while (ans_validity == false);

        // get AnswerNo3 and remove element
        ans_validity = false;
        do {
            temp_input = sc.nextInt();
            for (int i = 0; i < num.length; i++) {
                if (temp_input == num[i]) {
                    ans_validity = true;
                    in3 = num[i];
                    num = removeElementByIndex(num, i);
                    break;
                }
            }
        } while (ans_validity == false);

        // get Sign3
        ans_validity = false;
        do {
            temp_sign = sc.next();
            if (temp_sign.charAt(0) == '+' || temp_sign.charAt(0) == '-' || temp_sign.charAt(0) == '*'
                    || temp_sign.charAt(0) == 'x' || temp_sign.charAt(0) == 'X' || temp_sign.charAt(0) == '/') {
                sign1 = temp_sign.charAt(0);
                if (temp_sign.charAt(0) == 'x' || temp_sign.charAt(0) == 'X') {
                    sign3 = '*';
                }
                ans_validity = true;
            }
        } while (ans_validity == false);

        // get AnswerNo4 and remove element
        ans_validity = false;
        do {
            temp_input = sc.nextInt();
            for (int i = 0; i < num.length; i++) {
                if (temp_input == num[i]) {
                    ans_validity = true;
                    in4 = num[i];
                    num = removeElementByIndex(num, i);
                    break;
                }
            }
        } while (ans_validity == false);

        System.out.println("End");

        System.out.println(in1 + " " + in2 + " " + in3 + " " + in4);

        // Do the math operation
        result = mathAnswer(in1, in2, in3, in4, sign1, sign2, sign3);

        System.out.println("Answer is " + result);

    }

    public static int[] removeElementByIndex(int[] arr, int index) {
        int[] temp = new int[arr.length - 1];

        // First Half
        for (int i = 0; i < index; i++) {
            temp[i] = arr[i];
        }

        // Second Half
        for (int i = index; i < arr.length - 1; i++) {
            temp[i] = arr[i + 1];
        }

        return temp;
    }

    public static String removeLastChar(String arr) {
        return arr.substring(0, arr.length() - 1);
    }

    public static double mathAnswer(int in1, int in2, int in3, int in4, char sign1, char sign2, char sign3) {
        double result = 0;
        
        if(sign1 == '+')
        {
            result = in1+in2;
        }
        else if (sign1 == '-')
        {
            result = in1 - in2;
        }
        else if (sign1 == '*')
        {
            result = in1*in2;
        }
        else if(sign1 == '/')
        {
            result = (double)in1/(double)in2;
        }

        if(sign2 == '+')
        {
            result = result+in3;
        }
        else if (sign2 == '-')
        {
            result = result - in3;
        }
        else if (sign2 == '*')
        {
            result = result*in3;
        }
        else if(sign2 == '/')
        {
            result = (double)result/(double)in3;
        }

        if(sign3 == '+')
        {
            result = result+in4;
        }
        else if (sign3 == '-')
        {
            result = result - in4;
        }
        else if (sign3 == '*')
        {
            result = result*in4;
        }
        else if(sign3 == '/')
        {
            result = (double)result/(double)in4;
        }

        return result;
    }

}
