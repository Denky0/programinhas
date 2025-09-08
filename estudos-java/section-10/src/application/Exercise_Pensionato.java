package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_Pensionato {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        String[] emails = new String[n];
        int[] rooms = new int[n];

         for (int i=0; i<n; i++) {
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            nomes[i] = sc.next();
            sc.nextLine();
            System.out.print("Email: ");
            emails[i] = sc.nextLine();
            System.out.print("Room: ");
            rooms[i] = sc.nextInt();
            System.out.println();
        }

        System.out.println("Busy rooms:");
        
        for (int roomNB=0; roomNB<10; roomNB++) {
            for (int i=0; i<n; i++) {
                if (rooms[i] == roomNB) {
                    System.out.println(roomNB + ": " + nomes[i] + ", " + emails[i]);
                }
            }
        }

        sc.close();
    }

}
