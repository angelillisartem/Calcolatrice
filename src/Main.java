import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scelta = new Scanner(System.in);
        Scanner input  = new Scanner(System.in);

        double pnum, snum, risultato;
        double sc;

        System.out.print("Quale operazione vuoi svolgere? ");
        sc = scelta.nextDouble();

        //Addizione

        if (sc == 1) {
            System.out.print("Inserisci il primo numero: ");
            pnum = input.nextDouble(); //inserisco il numero nella variabile

            System.out.print("Inserisci il secondo numero: ");
            snum = input.nextDouble();

            risultato= pnum + snum; //svolgo l'operazione con le variabili

            System.out.println("Il risultato dell' addizione è "+ risultato);

        }

        //Sottrazione

        if(sc== 2) {
            System.out.print("Inserisci il primo numero: ");
            pnum = input.nextDouble();

            System.out.print("Inserisci il secondo numero: ");
            snum = input.nextDouble();

            risultato= pnum - snum;

            System.out.println("Il risultato della sottrazione è "+ risultato);
        }

        //Moltiplicazione

        if(sc== 3) {
            System.out.print("Inserisci il primo numero: ");
            pnum = input.nextDouble();

            System.out.print("Inserisci il secondo numero: ");
            snum = input.nextDouble();

            risultato= pnum * snum;

            System.out.print("Il risultato della moltiplicazione è "+ risultato);
        }

        //Divisione

        if(sc== 4) {
            System.out.print("Inserisci il primo numero: ");
            pnum = input.nextDouble();

            System.out.print("Inserisci il secondo numero: ");
            snum = input.nextDouble();

            risultato= pnum / snum;

            System.out.println("Il risultato della divisione è "+ risultato);
        }
    }
}
