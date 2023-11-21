import java.util.Scanner;

public class scientificCalculator {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Declaramos las variables necesarias:
        double number, numberCube;
        int option;


        // Hacemos el menu:

        System.out.println("CALCULADORA CIENTIFICA");
        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println("1 - Cubo de un numero.");
        System.out.println("2 - Par o Impar.");
        System.out.println("3 - Salir.");
        System.out.println("--------------------------------");

        // Pedimos al usuario que introduzca la opcion desada:
        System.out.println("Seleccione una opcion: ");
        option = lector.nextInt();

        // Calculamos dentro de una estructura switch

        switch (option) {
            case 1: {
                System.out.println("Introduzca un numero: ");
                number = lector.nextDouble();

                numberCube = Math.pow(number, 3);

                System.out.println("El cubo del numero es: " + numberCube);
                break;
            }
            case 2: {
                System.out.println("Introduzca un numero para saber si es par o no");
                number = lector.nextDouble();

                if (number % 2 == 0) {
                    System.out.println("El numero " + number + " es par.");
                } else {
                    System.out.println("El numero " + number + " es impar.");
                }
                break;
            }
            case 3: {
                break;
            }
            default: {
                System.out.println("Opcion no valida!");
            }
        }
    }
}
