package Task1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("Кількість елементів у множині = ");

        Error();
    }

    public static void Error() {

        try {
            Calc();
        } catch (IllegalArgumentException err) {
            System.out.println("ERROR!" +err.getMessage());
        }
    }

    public static void Calc( ) {
        int i;
        int numb =0;
        int res;
        int sum = 0;
        int numberOfPaired = 0;
        Scanner scan = new Scanner(System.in);
        
        try {
          numb = scan.nextInt();  
        } catch (java.util.InputMismatchException err) {
            System.out.println("Будь ласка, введіть число");
            return;
        }
        
        if (numb <= 1) {
            throw new IllegalArgumentException("Кількість елементрів у множині має бути більшою або рівною 2");
        }
        
        int[] array = new int[numb];
        for (i = 0; i < numb; i++) {
            array[i] = i + 1;
        }

        for (i = 0; i < numb; i++) {
            if (array[i] % 2 == 0) {
                res = array[i];
                sum += res;
                numberOfPaired++;
            }
        }
        
        System.out.println("Середнє арифметичне усіх парних елементів = " + sum/numberOfPaired);
    }
}

