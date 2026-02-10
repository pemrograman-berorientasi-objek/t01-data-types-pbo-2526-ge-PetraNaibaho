// Petra Naibaho
// 12S24002 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String soal = sc.next();

        /* ================= SOAL 1 ================= */
        if (soal.equals("Soal1")) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = a + b;

            if ((a > 0 && b > 0 && sum < 0) ||
                (a < 0 && b < 0 && sum > 0)) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println(sum);
            }
        }

        /* ================= SOAL 2 ================= */
        else if (soal.equals("Soal2")) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            float floatSum = (float) x + (float) y;
            double doubleSum = x + y;

            double diff = Math.abs(doubleSum - floatSum);
            System.out.printf("%.6f%n", diff);
        }

        /* ================= SOAL 3 ================= */
        else if (soal.equals("Soal3")) {
            int N = sc.nextInt();

            Integer a = N;
            Integer b = a;

            a++;

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        /* ================= SOAL 4 ================= */
        else if (soal.equals("Soal4")) {
            String S = sc.next();

            String a = S;
            String b = new String(S);

            a += "X";

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        /* ================= SOAL 5 ================= */
        else if (soal.equals("Soal5")) {
            int i = sc.nextInt();
            double d = sc.nextDouble();
            boolean flag = sc.nextBoolean();

            double result = i * d;

            if (!flag) {
                result = -result;
            }

            System.out.printf("%.2f%n", result);
        }

        sc.close();
    }
}
