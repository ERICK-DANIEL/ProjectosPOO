package StudenSection;
import java.util.ArrayList;

public class Section {
    private String NRC;
    private ArrayList<Student> arrayStu;

    public Section() {
        this.NRC = "21761";
        arrayStu = new ArrayList<Student>();
    }

    public void addStudent(Student st) {
        arrayStu.add(st);
        System.out.println("Estudiante agregado");
    }

    public void searchStudent(int id) {
        for (int i = 0; i < arrayStu.size(); i++) {
            if (arrayStu.get(i).getId() == id) {
                System.out.println(arrayStu.get(i).toString());
                break;
            }
        }
        System.out.println("Estudiante no encontrado");
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < arrayStu.size(); i++) {
            if (arrayStu.get(i).getId() == id) {
                arrayStu.remove(i);
                System.out.println("Estudiante eliminado");
                break;
            }
        }
        System.out.println("Estudiante no encontrado");
    }

    public void printForGender() {
        System.out.println("Estudiantes hombres: ");
        for (int i = 0; i < arrayStu.size(); i++) {
            if (arrayStu.get(i).getGender() == "male") {
                System.out.println(arrayStu.get(i).toString());
            }
        }

        System.out.println("Estudiantes mujeres: ");
        for (int i = 0; i < arrayStu.size(); i++) {
            if (arrayStu.get(i).getGender() == "femele") {
                System.out.println(arrayStu.get(i).toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Section [NRC=" + NRC + ", arrayStu=" + arrayStu + "]";
    }
}