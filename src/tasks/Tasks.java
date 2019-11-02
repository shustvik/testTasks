package tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tasks {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Cp1251"));
        System.out.println("Please enter task number (1, 2, 3, 4, 5, 6) or enter '0' to complete the program:");
        int task = inInt(br);
        switch (task) {
            case 1:
                System.out.println("Enter N:");
                task1(inInt(br));
                break;
            case 2:
                System.out.println("Enter N:");
                task2(inInt(br));
                break;
            case 3:
                System.out.println("Enter the coordinates of point A1 (ax1,ay1,ax2,ay2) and B1 (bx1,by1,bx2,by2):");
                task3(inInt(br), inInt(br), inInt(br), inInt(br), inInt(br), inInt(br), inInt(br), inInt(br));
                break;
            case 4:
                System.out.println("Enter a and b :");
                task4(inInt(br), inInt(br));
                break;
            default:
                System.out.print("\nEntered data is incorrect!");
                break;
        }
        System.out.println("\n");
    }

    static int inInt(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

    static String inString(BufferedReader br) throws IOException {
        return br.readLine();
    }

    static void task1(int n) {
        int nSqrt = (int) Math.round(Math.sqrt(n));
        int i = 1;
        System.out.println("Prime numbers in range 1 to " + n + ":");
        while (i != n) {
            int count = 2;
            if (i <= 3) {
                System.out.print(i + "\t");
            } else {
                for (int j = 2; j < nSqrt; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.print(i + "\t");
                }
            }
            i++;
        }
    }

    static void task2(int n) {
        int i = 1;
        System.out.println("Fibonacci numbers in range 1 to " + n + ":");
        while (i <= n) {
            System.out.print(fibonacci(i) + "\t");
            i++;
        }
    }

    static void task3(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        double v1 = (bx2 - bx1) * (ay1 - by1) - (by2 - by1) * (ax1 - bx1);
        double v2 = (bx2 - bx1) * (ay2 - by1) - (by2 - by1) * (ax2 - bx1);
        double v3 = (ax2 - ax1) * (by1 - ay1) - (ay2 - ay1) * (bx1 - ax1);
        double v4 = (ax2 - ax1) * (by2 - ay1) - (ay2 - ay1) * (bx2 - ax1);

        String s = ((v1 * v2 <= 0) && (v3 * v4 <= 0)) ? "Yes, the segments intersect" : "No, the segments don't intersect";
        System.out.print(s);
    }

    static void task4(int a, int b) {
        System.out.print("GCD(" + a + "," + b + ") = " + gcd(a, b) + "\n");
        System.out.print("LCM(" + a + "," + b + ") = " + lcm(a, b));
    }

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    static int gcd(int a, int b) {
        if (b != 0) {
            return a > b ? gcd(b, a % b) : gcd(a, b % a);
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

}
