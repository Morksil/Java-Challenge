package Bartosz.wieczorek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathematicalOperation();
        System.out.println("Czy chcesz wykonać kolejne działanie? t/n.");
        String decision = scanner.nextLine();
        while(decision.equals("t")) {
            MathematicalOperation();
            System.out.println("Czy chcesz wykonać kolejne działanie? t/n.");
            decision = scanner.nextLine();
        }
    }

    public static void MathematicalOperation() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź w oddzielnych linijkach pierwszą liczbę, znak działania{+,/,*,-,%) oraz drugą liczbę.");
        double firstNumber = scanner.nextDouble();
        scanner.nextLine();
        String dzialanie = scanner.nextLine();

        double secondNumber = scanner.nextDouble();
        scanner.nextLine();
        double result=0;
        if(dzialanie.equals("+")){
            result=firstNumber+secondNumber;
        } else if(dzialanie.equals("-")){
            result=firstNumber-secondNumber;
        } else if(dzialanie.equals("/")){
            result=firstNumber/secondNumber;
        } else if(dzialanie.equals("*")){
            result=firstNumber*secondNumber;
        } else if(dzialanie.equals("%")){
            result=firstNumber*secondNumber;
        }else {
            System.out.println("Wprowadzono niepoprawny znak operacji matematycznej.");
        }

        System.out.println("Wynik działania to: " + result);

    }
}
