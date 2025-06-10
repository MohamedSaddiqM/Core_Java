package JavaBasics;

import java.util.Scanner;

public class ex_03_Java_Scan {
    public static void main(String[] args) {
        System.out.println("Enter you number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number>6){
            System.out.println("You won the game");
        }
        else {
            System.out.println("You lost the game");
        }
    }
}
