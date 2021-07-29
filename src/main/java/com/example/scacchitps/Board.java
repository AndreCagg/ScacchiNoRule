package com.example.scacchitps;

import java.util.Objects;

public class Board implements Punteggio {

    private Pezzo board[][];

    public Board() {

        this.board = new Pezzo[DIM_BOARD][DIM_BOARD];
    }

    public void spostaPedina(Integer convX, Integer y, Integer convX2, Integer y1) {
        if ((this.board[y1][convX2]==null) || (this.board[y1][convX2].punteggio < this.board[y][convX].punteggio)) { //campara i punteggi
            this.board[y1][convX2] = this.board[y][convX];
            this.board[y][convX] = null;
        }else{
            this.board[y][convX] = null;
        }
    }

    public void aggiungiPezzo(String colore, Integer num) {

        Boolean a = false;
        Integer pedone = 0;
        Integer torre = 0;
        Integer alfiere = 0;
        Integer cavallo = 0;
        Integer regina = 0;

        for (Integer i = 0; i < num; i++) {
            do {
                Integer x = (int) (Math.random() * DIM_BOARD);
                Integer y = (int) (Math.random() * DIM_BOARD);
                char y1 = (char) (y + 65);

                Integer pezzo = (int) (Math.random() * 5) + 1;

                if (this.board[x][y] == null) {
                    a = true;
                    switch (pezzo) {
                        case 1:
                            if (pedone < PEDONI_MAX) {
                                this.board[x][y] = new Pedone(x, colore, y1);
                                pedone++;
                            }
                            break;

                        case 2:
                            if (torre < TORRI_MAX) {
                                this.board[x][y] = new Torre(x, colore, y1);
                                torre++;
                            }
                            break;

                        case 3:
                            if (alfiere < ALFIERI_MAX) {
                                this.board[x][y] = new Alfiere(x, colore, y1);
                                alfiere++;
                            }
                            break;

                        case 4:
                            if (cavallo < CAVALLI_MAX) {
                                this.board[x][y] = new Cavallo(x, colore, y1);
                                cavallo++;
                            }
                            break;

                        case 5:
                            if (regina < REGINA_MAX) {
                                this.board[x][y] = new Regina(x, colore, y1);
                                regina++;
                            }
                            break;
                    }
                }
            } while (!a);
        }
    }

    public void aggiungiRe(String colore) {

        Boolean a = false;

        do {
            Integer x = (int) (Math.random() * DIM_BOARD);
            Integer y = (int) (Math.random() * DIM_BOARD);
            char y1 = (char) (y + 65);

            if (this.board[x][y] == null) {
                a = true;
                this.board[x][y] = new Re(x, colore, y1);
            }
        } while (!a);
    }

    public Integer calcoloPunteggio(String colore, Integer punteggio) {

        for (Integer i = 0; i < DIM_BOARD; i++) {
            for (Integer j = 0; j < DIM_BOARD; j++) {

                if (this.board[i][j] != null) {
                    if (this.board[i][j].getColore() == colore) {
                        punteggio += this.board[i][j].getPunteggio();
                    }
                }

            }
        }

        return punteggio;
    }

    public Integer controllaRimasti(){
        Integer k=0;
        for(Integer i=0;i<DIM_BOARD;i++){
            for(Integer j=0;j<DIM_BOARD;j++){//controlla tutta la matrice e increamenta k se è presente una pedina
                if(this.board[i][j]!=null){
                    k++;
                }
            }
        }
        return k;
    }
    public void visualizzaBoard() {

        for (Integer a = -1; a <= DIM_BOARD; a++) {

            if (a == -1 || a == DIM_BOARD) {
                System.out.print(" X |");
            } else {
                System.out.format("%2d", a + 1); //per stampare sempre due caratteri decimali 
                System.out.print(" |");
            }
            for (Integer b = 0; b < DIM_BOARD; b++) {

                if (a == -1 || Objects.equals(a, DIM_BOARD)) {

                    System.out.print("____");
                    System.out.format("%2c", (char) (b + 65));
                    System.out.print("____");

                } else if (this.board[a][b] != null) {
                    System.out.format("|%8s|", this.board[a][b].getName());
                } else {
                    System.out.print("|        |");
                }
            }
            System.out.print("|\n");
        }
    }

}
