/*
author: Jaume Latorre Guardia
data: 07/10/2023
version: 1.0
*/

/*
Escriu un programa per a jugar al joc de parells i senars contra l’ordinador. Al
principi de cada torn, el jugador tria entre parells o senars [“pa”/”se”] i l’ordinador
es queda amb l'opció restant. Si el jugador introdueix malament l’elecció, se li
assignarà parells. Després d’haver triat, tots dos mostren alhora una mà amb el
nombre de dits aixecats que vulguin (ha de ser entre 0 i 5 ambdós inclosos) i es
sumen tots.

Si el resultat de la suma és un nombre parell, el/la guanyador/a serà el
jugador que hagi triat parells i, en cas contrari, el guanyador serà el jugador que hagi
triat senars. El jugador pot tornar a jugar (“s” per a jugar altre vegada /”n” en cas
contrari).
*/

/* Taula de tests
Entrada | Sortida esperada
-------------------------------------
(pio) 0 | Com no has introduït pa o se, trio per tu parell Dits de l’ordinador: 5  Dits del jugador: 0
          Ha guanyat l’ordinador! Vols jugar de nou? [s/n]

(se) 2 | Dits de l’ordinador: 3  Dits del jugador: 2 Has guanyat! Enhorabona!! Vols jugar de nou? [s/n]

(pa) 6 | Has d'introduir un nombre vàlid entre 0 i 5. Quants dits mostres?
*/

import java.util.Objects;
import java.util.Scanner;

public class ParellsiSenars {
    public static void main(String [] args) {
        Scanner teclat = new Scanner(System.in);
        int numEntrada, numOrd, numResult;
        boolean inGame = true;
        String repeat, pase;

        System.out.println("Benvingut/da a parells i senars!");

        while(inGame) {
            System.out.println("Tria parell o senar [pa/se]: ");
            pase = teclat.next();

            if (!Objects.equals(pase, "pa") && !Objects.equals(pase, "se")) {
                System.out.println("Com no has introduït pa o se, trio per tu parell");
                pase = "pa";
            }

            System.out.println("Quants dits mostres?");
            numEntrada = teclat.nextInt();

            while((numEntrada > 5)||(numEntrada < 0)) {
                System.out.println("Has d'introduir un nombre vàlid entre 0 i 5.");
                System.out.println("Quants dits mostres?");
                numEntrada = teclat.nextInt();
            }

            numOrd = (int) (Math.random() * 6);
            numResult = numEntrada + numOrd;

            System.out.println("Dits de l’ordinador: " + numOrd);
            System.out.println("Dits del jugador: " + numEntrada);

            if ((Objects.equals(pase, "pa") && (numResult % 2 == 0)) ||
                    (Objects.equals(pase, "se") && (numResult % 2 == 1))) {
                System.out.println("Has guanyat! Enhorabona!!");
            } else {
                System.out.println("Ha guanyat l’ordinador!");
            }

            System.out.println("Vols jugar de nou? [s/n]");
            repeat = teclat.next();

            while(!Objects.equals(repeat, "s") && !Objects.equals(repeat, "n")){
                System.out.println("Vols jugar de nou? [s/n]");
                repeat = teclat.next();
            }

            if (!Objects.equals(repeat, "s")) {
                System.out.println("Adeu!");
                inGame = false;
            }
        }
    }
}
