import java.util.Scanner;

public class figureAreas {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Declaramos las variables:
        double triangleBase, triangleHeigth, squareSide, circleRadius, rectangleBase, rectangleHeigth, triangleArea, squareArea, circleArea, rectangleArea;
        int option;

        // Solicitamos al usuario la operacion:

        System.out.println("AREA DE FIGURAS GEOMETRICAS:");
        System.out.println(" ");
        System.out.println("Introduzca un valor: ");
        System.out.println("------------------------------------------");
        System.out.println("1 - Area del Triangulo. ");
        System.out.println("2 - Area del Cuadrado.");
        System.out.println("3 - Area del Circulo.");
        System.out.println("4 - Area del Rectangulo");
        System.out.println("------------------------------------------");
        option = lector.nextInt();

        // Pedimos y calculamos:

        switch (option) {
            case 1: {
                System.out.println("Introduzca la base del triangulo: ");
                triangleBase = lector.nextDouble();
                System.out.println("Introduzca la altura del trinangulo: ");
                triangleHeigth = lector.nextDouble();

                triangleArea = (triangleBase*triangleHeigth)/2;

                System.out.println("El area del triangulo es "+triangleArea);

                break;
            }
            case 2: {
                System.out.println("Introduzca el lado del cuadrado: ");
                squareSide = lector.nextDouble();

                squareArea = squareSide*squareSide;

                System.out.println("El area del cuadrado es "+squareArea);
                break;

            }
            case 3: {
                System.out.println("Introduzca el radio del circulo: ");
                circleRadius = lector.nextDouble();
                circleArea = Math.PI*Math.pow(circleRadius, 2);

                System.out.println("El area del circulo es "+circleArea);
                break;

            }
            case 4: {
                System.out.println("Introduzca la base del rectangulo: ");
                rectangleBase = lector.nextDouble();
                System.out.println("Introduzca la altura del rectangulo: ");
                rectangleHeigth = lector.nextDouble();

                rectangleArea = rectangleBase*rectangleHeigth;

                System.out.println("El area del rectangulo es "+rectangleArea);
                break;
            }
            default: {
                System.out.println("Opcion incorrecta.");
            }
        }
    }
}
