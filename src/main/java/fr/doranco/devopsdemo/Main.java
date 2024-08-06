package fr.doranco.devopsdemo;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.sum(200, 100);
        System.out.println(sum);

        float divide = calculator.divide(100,4);
        System.out.println(divide);

        System.out.println();


    }
}
