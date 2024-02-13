/*
author: Jaume Latorre Guardia
data: 07/10/2023
version: 1.0
*/

/*
Feu un programa que llegeix un String i compta el nombre de vocals que hi ha en
total. Per exemple, “Avui fa molta calor.” dona el missatge “La frase té 8 vocals”.
Utilitza el mètode CharAt() de la classe String per a resoldre’l.
*/

/* Taula de tests
Entrada | Sortida esperada
-------------------------------------
a | La frase té 1 vocal

ada | La frase té 2 vocals

jaume latorre guardia | La frase té 10 vocals
*/

import java.util.Scanner;

public class CompteVocals {
    public static void main(String [] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.println("Entra una frase: ");
        String word = teclat.nextLine();
        int counter = 0, numVowels = 0;

        while (counter != word.length()) {
            switch (word.charAt(counter)) {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    numVowels += 1;
                    break;
                default:
                    break;
            }
            counter += 1;
        }

        if (counter == 1) {
            System.out.println("La frase té " + numVowels + " vocal");

        } else {
            System.out.println("La frase té " + numVowels + " vocals");
        }
    }
}