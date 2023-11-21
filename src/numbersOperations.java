
import java.util.Scanner;

public class numbersOperations {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Pedir dos numeros enteros:
        int x, y, resultado, option;
        boolean salir = false;

        do {

        System.out.println("Introduzca un numero X: ");
        x = lector.nextInt();
        System.out.println("Introduzca un numero Y: ");
        y = lector.nextInt();

        // Pedir la operacion:


            System.out.println(" ");
            System.out.println("--------------------------------------");
            System.out.println("SELECCIONE LA OPERACION A REALIZAR: ");
            System.out.println("1 - Sumar (+).");
            System.out.println("2 - Restar (-).");
            System.out.println("3 - Multiplicar (*).");
            System.out.println("4 - Dividir (/).");
            System.out.println("5 - Salir");
            System.out.println("--------------------------------------");
            option = lector.nextInt();
            System.out.println(" ");

            // Realizar las operaciones y mostrar el resultado.

            switch (option) {
                case 1: {
                    resultado = (x+y);
                    System.out.println(x+"+"+y+" = "+resultado);
                    break;
                }
                case 2: {
                    resultado = (x-y);
                    System.out.println(x+"-"+y+" = "+resultado);
                    break;
                }
                case 3: {
                    resultado = (x*y);
                    System.out.println(x+"*"+y+" = "+resultado);
                    break;
                }
                case 4: {
                    resultado = (x/y);
                    System.out.println(x+"/"+y+" = "+resultado);
                }
                case 5: {
                    salir = true;
                    break;
                }

            }

        } while (salir);





    }
}
