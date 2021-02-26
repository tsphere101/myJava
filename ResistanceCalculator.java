import java.util.Scanner;

public class ResistanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter R1:");
        double R1 = Double.parseDouble(sc.nextLine());

        fullLoopCal(R1);

    }

    public static void fullLoopCal(double R1) {
        double result = halfLoopCal(R1);
        fullLoopCal(result);
    }

    public static double halfLoopCal(double R1) {
        double result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter operation ( / or + ) : ");
        String operation = sc.nextLine();

        System.out.println("Enter R2:");
        double R2 = Double.parseDouble(sc.nextLine());

        if (operation.equals("/")) {
            /* Parallel Operation */
            result = ((double) R1 * (double) R2) / ((double) R1 + (double) R2);
            System.out.println("Result of Parallel is : " + result);
            System.out.println("or " + R1 + "/" + R2);
        }

        else if (operation.equals("+")) {
            /* Plus operation */
            result = R1 + R2;
            System.out.println("Result of Sum is : " + result);
        }
        return result;
    }
}