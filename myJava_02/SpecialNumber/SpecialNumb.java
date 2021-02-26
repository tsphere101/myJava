import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigInteger;

public class SpecialNumb {
    public static void main(String[] args) {
        BigInteger spec_number = new BigInteger("277777788888899");

        BigInteger number = new BigInteger("10000000000000000000000000000000000000000000000000000000000000000000000000000000000");

        BigInteger max = new BigInteger("0");
        BigInteger whichIs = new BigInteger("0");
        for(BigInteger i = new BigInteger("0") ; i.compareTo(number) == -1 ; i = i.add(BigInteger.ONE))
        {
            System.out.print("Number : " + i + " ");
            BigInteger times = multiplyToTilOneDigit(getDigit(i));
            if(times.compareTo(max) == 1) {max = times;whichIs = i;}
            System.out.println(times + " Max : " + max + " Which is : " + whichIs);
        }


        System.out.println("1 to " + number);
        System.out.println("Done!...");

    }

    public static BigInteger multiplyToTilOneDigit(ArrayList<Long> digitList) {
        BigInteger times = new BigInteger("0");

        while (!(digitList.size() == 1)) {
            digitList = getDigit(multiplyAllDigits(digitList));
            times = times.add(new BigInteger("1"));
        }

        return times;
    }

    public static BigInteger multiplyToTilOneDigitOutLound(ArrayList<Long> digitList) {
        BigInteger times = new BigInteger("0");

        while (!(digitList.size() == 1)) {
            System.out.println(multiplyAllDigits(digitList));
            digitList = getDigit(multiplyAllDigits(digitList));
            times = times.add(new BigInteger("1"));
        }

        return times;
    }

    public static BigInteger multiplyAllDigits(ArrayList<Long> digitList) {
        BigInteger result = new BigInteger(Long.toString(digitList.get(0)));
        for (int i = 0; i < digitList.size() - 1; i++) {
            result = result.multiply(new BigInteger(Long.toString(digitList.get(i+1))));
        }
        return result;
    }

    public static ArrayList<Long> getDigit(BigInteger num) {
        ArrayList<Long> result = new ArrayList<Long>();
        if (num.compareTo(new BigInteger("0")) == 0)
            result.add((long) 0);
        while (num.compareTo(new BigInteger("1")) == 1 || num.compareTo(new BigInteger("1")) == 0 ) {
            result.add( (num.mod(new BigInteger("10")).longValue() ));
            num = num.divide(new BigInteger("10"));
        }
        return result;
    }

}