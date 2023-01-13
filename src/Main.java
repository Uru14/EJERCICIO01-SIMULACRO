import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numRegalos = 0;

        while (numRegalos == 0) {
            try {
                System.out.println("Quien te visita: 1- Papa Noel o 2- Reyes Magos");
                int remitente = scanner.nextInt();
                if (remitente != 1 & remitente != 2) throw new InputMismatchException();
                else {
                    if (remitente == 1) {
                        numRegalos = 6;
                    } else if (remitente == 2) {
                        System.out.println("Quien es tu rey mago favorito: 1- Melchor, 2- Gaspar, 3- Baltasar");
                        int reyFav = scanner.nextInt();
                        switch (reyFav) {
                            case 1:
                                numRegalos = 5;
                                break;
                            case 2:
                                numRegalos = 4;
                                break;
                            case 3:
                                numRegalos = 3;
                                break;
                            default:
                                System.out.println("Esa no es una opción, repite la carta");
                                numRegalos = 0;
                        }
                    }
                    System.out.println("Te has equivocado? Quieres escribir la carta de nuevo? Responde: 'S'/'N'");
                    char respuesta = scanner.next().toUpperCase().charAt(0);
                    if (respuesta == 'S') {
                        numRegalos = 0;
                    }
                }

            } catch (InputMismatchException ex) {
                System.out.println("Solo puedes elegir: 1 / 2");
                numRegalos = 0;
            }

            scanner.nextLine();

            for (int i = 0; i < numRegalos; i++) {
                System.out.println("Regalo nº: " + (i + 1));
                String regalo = scanner.nextLine();
            }

        }
    }
}