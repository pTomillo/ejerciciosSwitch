
import java.util.Scanner;

public class operadorMeses {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("MESES DEL AÑO");

        // Pedimos al usuario un numero entre 1 y 12:
        int mes;


        System.out.println("Usuario introduzca un numero para saber a que mes corresponde: ");
        mes = lector.nextInt();


        switch (mes) {
            case 1: {
                System.out.println("Enero");
                break;
            }
            case 2: {
                System.out.println("Febrero");
                break;
            }
            case 3: {
                System.out.println("Marzo");
                break;
            }
            case 4: {
                System.out.println("Abril");
                break;
            }
            case 5: {
                System.out.println("Mayo");
                break;
            }
            case 6: {
                System.out.println("Junio");
                break;
            }
            case 7: {
                System.out.println("Julio");
                break;
            }
            case 8: {
                System.out.println("Agosto");
                break;
            }
            case 9: {
                System.out.println("Septiembre");
                break;
            }
            case 10: {
                System.out.println("Octubre");
                break;
            }
            case 11: {
                System.out.println("Noviembre");
                break;
            }
            case 12: {
                System.out.println("Diciembre");
                break;
            }
            default:
                System.out.println("Numero Incorrecto!");
        }


    }
}
