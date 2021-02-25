package ru.geekbrains.dz1;

public class Main {

    public static void main(String[] args) {
        byte a1 = 1;
        int b1 = 2;
        short c = 3;
        long d = 400000L;

        float e = 1.5f;
        double f = 2.55;
        char g = 'A';
        boolean h = true;

        System.out.println(isSumGreatherThan10AndLessThan20(5,2));
        System.out.println(calculateFormula(1.1f, 2.2f, 3.3f, 4.4f));
        isPositive(0);
        System.out.println(returnPositive(4));
        showName( "Юрий");
    }

    private static float calculateFormula(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    private static boolean isSumGreatherThan10AndLessThan20(int a, int b) {
        int sum = a + b;
        if (10 < sum && sum <= 20) {
            return true;
        } else {
            return false;
        }

    }

    private static void isPositive(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    private static boolean returnPositive(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }
    private static void showName(String a) {
        System.out.println("Привет, " + a);
    }
}
