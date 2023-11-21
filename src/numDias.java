import java.util.Scanner;

public class numDias {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("MESES DEL AÑO");

        // Pedimos al usuario un numero entre 1 y 12:
        int mes, ano;


        System.out.println("Usuario introduzca el numero de un mes: ");
        mes = lector.nextInt();
        System.out.println("Usuario introduzca el año: ");
        ano = lector.nextInt();


        switch (mes) {
            case 1: {
                System.out.println("Enero");
                System.out.println("31 dias.");
                break;
            }
            case 2: {
                System.out.println("Febrero de " + ano);
                if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                    System.out.println("29 dias");
                } else {
                    System.out.println("28 dias");
                }
                break;
            }
            case 3: {
                System.out.println("Marzo");
                System.out.println("31 dias.");
                break;
            }
            case 4: {
                System.out.println("Abril");
                System.out.println("30 dias.");
                break;
            }
            case 5: {
                System.out.println("Mayo");
                System.out.println("31 dias.");
                break;
            }
            case 6: {
                System.out.println("Junio");
                System.out.println("30 dias.");
                break;
            }
            case 7: {
                System.out.println("Julio");
                System.out.println("31 dias.");
                break;
            }
            case 8: {
                System.out.println("Agosto");
                System.out.println("31 dias.");
                break;
            }
            case 9: {
                System.out.println("Septiembre");
                System.out.println("30 dias.");
                break;
            }
            case 10: {
                System.out.println("Octubre");
                System.out.println("31 dias.");
                break;
            }
            case 11: {
                System.out.println("Noviembre");
                System.out.println("30 dias.");
                break;
            }
            case 12: {
                System.out.println("Diciembre");
                System.out.println("31 dias.");
                break;
            }
            default:
                System.out.println("Numero Incorrecto!");
        }


    }
}
