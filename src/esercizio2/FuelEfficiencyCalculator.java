package esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class FuelEfficiencyCalculator {

    private static final Logger logger = LoggerFactory.getLogger(FuelEfficiencyCalculator.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci il numero di km percorsi: ");
            double km = scanner.nextDouble();

            System.out.println("Inserisci i litri di carburante consumati: ");
            double litri = scanner.nextDouble();

            if (litri == 0) {
                throw new ArithmeticException("I litri consumati non possono essere 0.");
            }

            double kmPerLitro = km / litri;
            System.out.printf("Il veicolo ha percorso %.2f km per litro di carburante.%n", kmPerLitro);
        } catch (ArithmeticException e) {
            logger.error("Errore: non è possibile dividere per zero.", e);
        } catch (Exception e) {
            logger.error("Errore di input non previsto.", e);
        } finally {
            scanner.close();
        }

        logger.info("Calcolo efficienza del carburante completato.");
    }
}
