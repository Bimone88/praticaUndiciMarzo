import esercizio1.ArrayManipulation;
import esercizio2.FuelEfficiencyCalculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleziona l'esercizio da eseguire:");
        System.out.println("1. Manipolazione Array");
        System.out.println("2. Calcolo Efficienza Carburante");
        System.out.print("Scelta: ");

        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                ArrayManipulation.main(null); // Chiama il main di ArrayManipulation
                break;
            case 2:
                FuelEfficiencyCalculator.main(null); // Chiama il main di FuelEfficiencyCalculator
                break;
            default:
                System.out.println("Scelta non valida.");
                break;
        }
        scanner.close();
    }
}