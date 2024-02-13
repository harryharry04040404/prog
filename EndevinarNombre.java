/*
author: Jaume Latorre Guardia
data: 07/10/2023
version: 1.0
*/

/*
Feu un programa per a jugar al joc d’endevinar un nombre. El jugador ha d’endevinar
un nombre secret, dins del rang [0 , 5], escollit per l’ordinador. L’ordinador pregunta
al jugador/a un nombre. En cas que el jugador/a falli, la màquina li diu si el nombre
introduït era més petit o més gran que el nombre secret i repta al jugador/a tornar a
intentar-lo amb altre nombre secret. El joc acaba quan el jugador/a encerti el nombre
secret, moment en que la màquina li diu que ha encertat, i a continuació li pregunta si
vol o no vol (“s”/”n”) tornar a jugar.

La sortida per pantalla ha de ser com la que es mostra a l’exemple d’execució. Fixeuvos
que s’ha de comprovar que el nombre està al rang [0 , 5], i que la resposta a la
pregunta de tornar a jugar ha de ser “s” o “n”.
 */

/* Taula de tests
Entrada | Sortida esperada
-------------------------------------
9 | El nombre 9 no és vàlid. Ha d'estar en el rang [0, 5].
    Estic pensant un nombre entre 0 i 5....
    Quin nombre creus que he pensat?:

0 | El nombre secret era 4, és major que 0.
    Estic pensant un nombre entre 0 i 5....
    Quin nombre creus que he pensat?:

3 | Has esbrinat que era 3! Has guanyat!
    Vols jugar altre vegada? [s/n]
 */

import java.util.Objects;
import java.util.Scanner;

public class EndevinarNombre {
    public static void main(String [] args){
        Scanner teclat = new Scanner(System.in);
        int numEntrada, numEndevinar;
        boolean inGame = true;
        String repeat;

        numEndevinar = (int) (Math.random()*6);
        System.out.println("Benvingut/da al joc d'endevinar nombres!");

        while(inGame) {
            System.out.println("Estic pensant un nombre entre 0 i 5....");
            System.out.println("Quin nombre creus que he pensat?:");

            numEndevinar = (int) (Math.random()*6);
            numEntrada = teclat.nextInt();

            while ((numEntrada < 0) || (numEntrada > 5)) {
                System.out.println("El nombre " + numEntrada + " no és vàlid. Ha d'estar en el rang [0, 5].");
                numEntrada = teclat.nextInt();
            }

            if (numEndevinar < numEntrada) {
                System.out.println("El nombre secret era, " + numEndevinar + " és menor que " + numEntrada + ".");
            } else if (numEndevinar > numEntrada) {
                System.out.println("El nombre secret era, " + numEndevinar + " és major que " + numEntrada + ".");
            } else {
                System.out.println("Has esbrinat que era " + numEndevinar + "! Has guanyat!\n" + "Vols jugar altra vegada? [s/n]");
                repeat = teclat.next();

                while(!Objects.equals(repeat, "s") && !Objects.equals(repeat, "n")){
                    System.out.println("Vols jugar altra vegada? [s/n]");
                    repeat = teclat.next();
                }

                if (!Objects.equals(repeat, "s")) {
                    System.out.println("Fins altra vegada!");
                    inGame = false;
                }
            }
        }
    }
}
