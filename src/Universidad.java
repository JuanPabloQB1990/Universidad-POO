import java.util.ArrayList;

public class Universidad {
    public String nombre;
    private ArrayList<Curso> cursos;


    public Universidad(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso cursoNuevo) {
        this.cursos.add(cursoNuevo);
    }

    public void getCursosUniversidad(){
        System.out.println(" ");
        System.out.println("Lista de Cursos");
        for (int i = 0; i < this.cursos.size(); i++) {
            System.out.println("Nombre del Curso: " + this.cursos.get(i).getNombreCurso());
        }

    }

    public void getProfesoresUniversidad(){
        System.out.println(" ");
        System.out.println("Lista de profesores");
        for (int i = 0; i < this.cursos.size(); i++) {
            System.out.println(this.cursos.get(i).getProfesor());
        }

    }

    public void getEstudiantesUniversidad(){
        System.out.println(" ");
        System.out.println("Lista de alumnos");
        for (int i = 0; i < this.cursos.size(); i++) {

            for (int j = 0; j < this.cursos.get(i).getEstudiantes().size(); j++) {
                System.out.println(this.cursos.get(i).getEstudiantes().get(i).getDatos() + " carnet: " + this.cursos.get(i).getEstudiantes().get(i).getCarnet());
            }
        }
    }
}
