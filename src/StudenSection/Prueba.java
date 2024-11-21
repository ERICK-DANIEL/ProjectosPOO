package StudenSection;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Section lis301 = new Section();
        int opcion;

        do {
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Imprimir por genero");
            System.out.println("5. Imprimir todos");
            System.out.println("6. Salir");

            //Eligir opcion
            System.out.print("Opcion: ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1: // Agregar estudiante
                    System.out.print("Ingresa Id, nombre, edad y genero: ");
                    Student st = new Student(in.nextInt(), in.next(), in.nextInt(), in.next());
                    lis301.addStudent(st);
                    break;
                case 2: // Buscar estudiante
                    System.out.println("Ingrese el id del estudiante a buscar");
                    lis301.searchStudent(in.nextInt());
                    break;
                case 3: // Eliminar estudiante
                    System.out.println("Ingresa el estudiante a elimninar");
                    lis301.deleteStudent(in.nextInt());
                    break;
                case 4: // Imprimir por genero
                    lis301.printForGender();
                    break;
                case 5: // Imprimir todos
                    System.out.println(lis301.toString());
                    break;
                case 6: // Salir
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 6);
    }
}
