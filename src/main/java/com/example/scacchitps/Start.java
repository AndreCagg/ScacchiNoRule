package com.example.scacchitps;

import java.io.IOException;

public class Start {

    public static void main(String[] args) throws IOException {

        ConsoleInput input = new ConsoleInput();
        Board b = new Board();
        Integer ris, punteggio = 0, y, y1, convX, convX1,k;
        String x;
        char x1;


        System.out.println("\nInserire numero di pedine da generare per squadra ");
        Integer num = input.readInt();

        
        b.aggiungiPezzo("Bianco", num);

        b.aggiungiPezzo("Nero", num);

        b.aggiungiRe("Bianco");
        b.aggiungiRe("Nero");

        System.out.println("\nAcquisizione...");

        System.out.println("\n");
        b.visualizzaBoard();
        System.out.println("\nLa squadra BIANCA ha totalizzato un punteggio parziale pari a " + b.calcoloPunteggio("Bianco", punteggio));
        System.out.println("\nLa squadra NERA ha totalizzato un punteggio parziale pari a " + b.calcoloPunteggio("Nero", punteggio));
        do {
            System.out.println("vuoi continuare la partita o terminarla?(1 continua/0 termina)");
            ris = input.readInt();

            if (ris == 1) {
                do {
                    System.out.println("Inserisci coordinata X attuale della pedina da spostare");
                    x = input.readStr();

                    convX = (int) x.toUpperCase().charAt(0);
                    if ((convX > 72) || (convX < 65)) {
                        System.out.println("il valore X inserito è out of bound\n\n");
                    }
                } while ((convX > 72) || (convX < 65));

                do {
                    System.out.println("Inserisci coordinata Y attuale della pedina da spostare");
                    y = input.readInt() - 1;
                    if ((y < 0) || (y > 7)) {
                        System.out.println("il valore Y inserito è out of bound\n\n");
                    }
                } while ((y < 0) || (y > 7));

                do {
                    System.out.println("Inserisci coordinata X sulla quale ci si vuole spostare");
                    x1 = input.readStr().toUpperCase().charAt(0);;

                    convX1 = (int) x1;
                    if ((convX1 > 72) || (convX < 65)) {
                        System.out.println("il valore X inserito è out of bound\n\n");
                    }
                } while ((convX > 72) || (convX < 65));
                
                do {
                    System.out.println("Inserisci coordinata Y sulla quale ci si vuole spostare");
                    y1 = input.readInt() - 1;
                    
                    if ((y < 0) || (y > 7)) {
                        System.out.println("il valore Y inserito è out of bound\n\n");
                    }
                } while ((y < 0) || (y > 7));

                

                convX -= 65;
                convX1 -= 65;

                b.spostaPedina(convX, y, convX1, y1);

                b.visualizzaBoard();
            }

            k=b.controllaRimasti();
            if(k<=1){
                ris=0;
            }
        } while (ris != 0);

        System.out.println("\nLa squadra BIANCA ha totalizzato un punteggio TOTALE pari a " + b.calcoloPunteggio("Bianco", punteggio));
        System.out.println("\nLa squadra NERA ha totalizzato un punteggio TOTALE pari a " + b.calcoloPunteggio("Nero", punteggio));

        System.out.print("\nVINCE LA SQUADRA ... ");
        if (b.calcoloPunteggio("Bianco", punteggio) > b.calcoloPunteggio("Nero", punteggio)) {
            System.out.print(" BIANCA!!");
        } else if (b.calcoloPunteggio("Bianco", punteggio) == b.calcoloPunteggio("Nero", punteggio)) {
            System.out.println("PAREGGIO");
        } else {
            System.out.print(" NERA!!");
        }

    }

}
