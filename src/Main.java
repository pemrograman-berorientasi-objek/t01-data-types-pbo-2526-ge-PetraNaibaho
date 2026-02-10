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

            if ((a > 0 && b > 0 && a > Integer.MAX_VALUE - b) ||
                (a < 0 && b < 0 && a < Integer.MIN_VALUE - b)) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println(a + b);
            }
        }

        /* ================= SOAL 2 ================= */
        else if (soal.equals("Soal2")) {
            String xStr = sc.next();
            String yStr = sc.next();

            float floatSum =
                    Float.parseFloat(xStr) + Float.parseFloat(yStr);

            double doubleSum =
                    Double.parseDouble(xStr) + Double.parseDouble(yStr);

            double diff = Math.abs(doubleSum - floatSum);

            System.out.printf("%.6f%n", diff);
        }

        /* ================= SOAL 3 ================= */
        else if (soal.equals("Soal3")) {
            int N = sc.nextInt();

            Integer a = N;
            Integer b = a;

            a = a + 1;

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        /* ================= SOAL 4 ================= */
        else if (soal.equals("Soal4")) {
            String S = sc.next();

            String a = S;
            String b = new String(S);

            a = a + "X";

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        /* ================= SOAL 5 ================= */
        else if (soal.equals("Soal5")) {
            int i = Integer.parseInt(sc.next());
            double d = Double.parseDouble(sc.next());
            boolean flag = Boolean.parseBoolean(sc.next());

            double result = i * d;

            if (!flag) {
                result *= -1;
            }

            System.out.printf("%.2f%n", result);
        }

        sc.close();
    }
}
