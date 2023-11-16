package app;

import java.util.Scanner;

public class Main {

    static int randomNumber;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your ticket:\n ");
        int [][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] =  (i + 3) * (j + 2);
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Input any number from ticket: ");
        randomNumber = sc.nextInt();
        if (randomNumber == 16){
            System.out.println("Congratulations! You won 1 million dollar!");
        }else{
            System.out.println("Unfortunately, you lose.");
        }
        sc.close();
    }
}
