/*
author: Jaume Latorre Guardia
data: 07/10/2023
version: 1.0
*/

/*
Feu un programa que llegeix un nombre enter n i escriu el taulell d’escacs de mida n x n.
 */

/* Taula de tests
Entrada | Sortida esperada
-------------------------------------
5 | # # #
     # #
    # # #
     # #
    # # #

8 | # # # #
     # # # #
    # # # #
     # # # #
    # # # #
     # # # #
    # # # #
     # # # #
 */

import java.util.Scanner;

public class Escacs {
    public static void main(String [] args){
        Scanner teclat = new Scanner(System.in);

        int n;
        System.out.println("Entra un valor: ");
        n = teclat.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0){
                    if (j % 2 == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("#");
                    }
                }
            }
            System.out.println();
        }
    }
}
