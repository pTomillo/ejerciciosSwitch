import java.util.Scanner;

public class salaryCalculator {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Declaramos variables necesarias:

        int workerHours, workerSalary;
        char workerClass;

        // Solicitamos al usuario que introduzca las horas trabajadas:

        System.out.println("Introduzca las horas trabajadas: ");
        workerHours = lector.nextInt();

        // Pedimos la clase del trabajador:

        System.out.println("A que clase pertenece el trabajador: ");
        workerClass = lector.next().charAt(0);

        // Calculamos el salario dentro de una estrctura Switch

        switch (workerClass) {
            case 'a': {
                workerSalary = 25*workerHours;
                System.out.println("El salario del trabajador es "+workerSalary);
                break;
            }
            case 'b': {
                workerSalary = 20*workerHours;
                System.out.println("El salario del trabajador es "+workerSalary);
                break;
            }
            case 'c': {
                workerSalary = 15*workerHours;
                System.out.println("El salario del trabajador es "+workerSalary);
                break;
            }
            case 'd': {
                workerSalary = 10*workerHours;
                System.out.println("El salario del trabajador es "+workerSalary);
                break;
            }
        }

    }
}
