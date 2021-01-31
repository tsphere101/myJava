import java.lang.Math;
public class MyMain {
    public static void main(String[] args) {

        for(int i = -500000; i <= 500000; i++)
        {
            if(consecutivePerfect(i, i+1))
            System.out.println(i + " " + (i+1));
        }


    }

    public static boolean consecutivePerfect(int a, int b) {
        if (perfectSquare(a) && perfectSquare(b))
            return true;
        if (perfectCube(a) && perfectSquare(b))
            return true;
        return false;
    }

    public static boolean perfectSquare(int num) {
        double sqr;
        try
        {
            sqr = Math.sqrt(num);
        }
        catch (Exception e)
        {
            return false;
        }
        if (sqr == (int) sqr) {
            return true;
        } else
            return false;
    }

    public static boolean perfectCube(int num) {
        double cube = Math.cbrt(num);
        {
            if (cube == (int) cube) {
                return true;
            } else
                return false;
        }
    }
}