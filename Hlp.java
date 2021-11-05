import java.util.Arrays;

public class Hlp {
    public static void main(String[] args) {

    }
    public static long triangle_numbers(long t){
        if (t < 2){return t;}
        else{return triangle_numbers(t - 1) + t;}
    }

    public static int fact(int num) {
        int fact = 1;
        for (int i = 1; i < num + 1; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int fib(int num) {
        if (num < 2) {
            return num;
            } else {
                return (fib(num - 1) + fib(num - 2));
            }
    }

    public static String coor(int x, int y) {
        if (x > 0 && y > 0) {
            return "1";
        } else if (x < 0 && y > 0) {
            return "2";
        } else if (x < 0 && y < 0) {
            return "3";
        } else if (x > 0 && y < 0) {
            return "4";
        } else {
            return " ";
        }
    }

    public static boolean in_com_coor(int x, int y, int x1, int y1) {
        return coor(x, y).equals(coor(x1, y1));
    }
    public static long NOD(long a, long b){// Нахождение НОД
        if(b == 0)
            return Math.abs(a);
        else
            return NOD(b, a % b);
    }

    public static long NOK(long gcd, long a, long b){// Нахождение НОК
        return Math.abs(a / gcd * b);
    }



    public static void bubbleSort(int[] a) {
        boolean sorted = false;
        int temp;
        while (!sorted)
        {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++)
            {
                if (a[i] > a[i + 1])
                {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

}


