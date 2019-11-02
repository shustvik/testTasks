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
}
