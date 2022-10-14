package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    // static int primitiv = 1;

    //todo Task 1
    public void largestNumber() {
        int counter = 1;
        double highestValue;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number "+ counter++ + ": ");
        double number = highestValue = scanner.nextDouble();
        if (number <= 0) {
            System.out.println("No number entered.");
        } else {
            while (number > 0) {
                System.out.print("Number " + counter + ": ");
                number = scanner.nextDouble();
                if (highestValue < number) {
                    highestValue = number;
                }
                counter++;
            }
            System.out.printf("The largest number is %.2f" + System.lineSeparator(), highestValue);
        }
    }


    //todo Task 2
    public void stairs() {
        // input your solution here
        System.out.print("n: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int counter = 0;
        int spalte = 1;

        if (a <= 0) {
            System.out.println("Invalid number!");
            return;
        }

        for (int j = 0; j <= a; j++) {       //So oft wie eingabe durchlaufen wir Über-Schleife


            for (int i = 1; i < spalte; i++) {   //Pro Schleife zählt mein Counter Hoch: 1,2,3,4,... und erhöht pro Durchgang den Grenzwert an zahlen die ausgegeben werden sollen.
                counter++;
                System.out.print(counter + " ");
            }
            if (spalte == 1) {
                System.out.print("");
            } else {
                System.out.println("");
            }
            spalte++;
        }
    }

    //todo Task 3
    public void printPyramid() {
        int Reihe = 6;
        for (int row = 1; row <= Reihe; row++) {
            for (int Spalte = Reihe; Spalte > row; Spalte--) {
                System.out.print(" ");
            }
            for (int col = 0; col < row * 2 - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //todo Task 4
    public void printRhombus() {
        // input your solution here
        Scanner scan4 = new Scanner(System.in);

        System.out.print("h: ");
        int h = scan4.nextInt();

        System.out.print("c: ");
        char c = scan4.next().charAt(0);

        if (h % 2 == 1) {
            for (int row = 0; row <= h / 2; row++) {
                for (int spalte = row; spalte < h / 2; spalte++) {
                    System.out.print(" ");
                }
                for (int k = 0 - row; k <= row; k++) {
                    System.out.print((char) (c - Math.abs(k)));
                }
                System.out.println();
            }
            for (int row1 = h / 2; row1 > 0; row1--) {
                for (int spalte2 = row1; spalte2 <= h / 2; spalte2++) {
                    System.out.print(" ");
                }
                for (int k = 0 - row1 + 1; k < row1; k++) {
                    System.out.print((char) (c - Math.abs(k)));
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 5
    public void marks() {
        // input your solution here
        DecimalFormat f = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        int counterfünfer = 0;
        double counterlegit = 0;
        int alle = 0;

        for (int i = 1; i >= i; i++) {
            System.out.print("Mark " + i + ": ");
            double eingabe = scan.nextDouble();
            if (eingabe == 0 && i == 1) {
                System.out.println("Average: 0.00");
                System.out.println("Negative marks: 0");
                break;
            }
            if (eingabe < 0 || eingabe > 5) {
                System.out.println("Invalid mark!");
                System.out.print("Mark " + i + ": ");
                eingabe = scan.nextDouble();
                alle += eingabe;
            } else {
                alle += eingabe;
            }
            if (eingabe == 1 || eingabe == 2 || eingabe == 3 || eingabe == 4 || eingabe == 5) {
                counterlegit++;
            }
            if (eingabe == 5) {
                counterfünfer++;
            }
            if (i > 1 && eingabe == 0) {
                //double i1 = alle / counterlegit;
                System.out.println("Average: " + f.format(alle / counterlegit));
                System.out.println("Negative marks: " + counterfünfer);
                break;
            }
        }
    }

    //todo Task 6
    public void happyNumbers() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int number = scanner.nextInt();
        int reminder = 0;
        int together = 0;
        while (number != 1) {
            together = 0;
            while (number != 0) {
                reminder = number % 10;
                together = together + (reminder * reminder);
                number = number / 10;
            }
            number = together;
            if (number == 4) {
                System.out.println("Sad number!");
                return;
            }
            if (number == 1){
                System.out.println("Happy number!");
                return;
            }
        }

















        
    }

    public static void main(String[] args) {
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        //exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        //exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        //exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        //exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        //exercise2.happyNumbers();
    }
}


