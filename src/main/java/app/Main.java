package app;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calculation");

        int resInt = add(5,6);
        System.out.println(resInt);

        float resFloat = add(5.5f,6.5f);
        System.out.println(resFloat);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }
}
