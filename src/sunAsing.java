import java.util.Scanner;

public class sunAsing {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Declaramos las variables:
        int hijos = 0;

        // Pedir al usuario el numero de hijo:
        System.out.println("Introduzca el numero de hijos del trabajador");
        hijos = lector.nextInt();

        switch (hijos) {
            case 0: {
                System.out.println("No corresponde asignacion.");
                break;
            }
            case 1: {
                System.out.println("50 soles asignados.");
                break;
            }
            case 2: {
                System.out.println("75 soles asisgnados.");
                break;
            }
            case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: {
                System.out.println("100 Soles asignados.");
                break;
            }
            default: {
                System.out.println("Numero de hijos incorrecto");
            }
        }

    }
}
