package esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

public class ArrayManipulation {

    private static final Logger logger = LoggerFactory.getLogger(ArrayManipulation.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        Random rand = new Random();

        // Riempimento dell'array con valori casuali tra 1 e 10
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
        }
        printArray(array);

        while (true) {
            try {
                System.out.println("Inserisci un numero (0 per terminare): ");
                int number = scanner.nextInt();
                if (number == 0) break;

                System.out.println("Inserisci la posizione dove inserire il numero: ");
                int position = scanner.nextInt();

                array[position] = number;
                printArray(array);
            } catch (ArrayIndexOutOfBoundsException e) {
                logger.error("Posizione non valida. Riprova.", e);
            } catch (Exception e) {
                logger.error("Errore non previsto. Riprova.", e);
            }
        }
        scanner.close();
        logger.info("Programma terminato.");
    }

    private static void printArray(int[] array) {
        System.out.println("Stato attuale dell'array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
