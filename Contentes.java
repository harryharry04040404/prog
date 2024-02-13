/*
author: Jaume Latorre Guardia
data: 07/10/2023
version: 1.0
*/

/*
Feu un programa per a veure si cada caràcter ‘a’ d’una paraula llegida per teclat està
contenta. Una ‘a’ està contenta si té a la seva esquerra o a la seva dreta una altre ‘a’.

El programa ens diu si totes les ‘a’ estan contentes. Per exemple: si introduïm
“zdaaaoa” el programa mostra el missatge “No totes les a estan contentes”, amb la
cadena “zdaa” el programa mostra “Totes les a estan contentes
 */

/* Taula de tests
Entrada | Sortida esperada
-------------------------------------
zdaaaoa | No totes les a estan contentes

zdaa | Totes les a estan contentes
 */

import java.util.Scanner;

public class Contentes{
    public static void main(String [] args){
        Scanner teclat = new Scanner(System.in);
        System.out.println("Escriu la paraula per analitzar: ");
        String myString = teclat.nextLine();
        int i = 1;
        boolean contentes = true;

        if (myString.length() < 2 || ((myString.length() == 2) && ((myString.charAt(i) != 'a')||(myString.charAt(i -= 1) != 'a')))){
            contentes = false;
        } else if (myString.length() == 2) {
            contentes = (myString.charAt(0) == myString.charAt(1));
        } else {
            while ((i < myString.length()) && (contentes)) {
                int j = i;
                if (myString.charAt(j) == 'a') {
                    if((i <= myString.length() - 2) && ((myString.charAt(j -= 1) == 'a') || (myString.charAt(j += 1) == 'a'))) {
                        contentes = true;
                    }
                    else  if (myString.charAt(j -= 1) == 'a') {
                        contentes = true;
                    }
                    else {
                        contentes = false;
                    }
                }
                i = i + 1;
            }
        }
        if(contentes){
            System.out.println("Totes les a estan contentes");
        }
        else {
            System.out.println("No totes les a estan contentes");
        }
    }
}

