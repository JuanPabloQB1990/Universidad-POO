import java.util.ArrayList;

public class Curso implements Gestionable {
    private String nombreCurso;
    private Profesor profesor;
    public ArrayList<Estudiante> estudiantes;

    // constructor
    public Curso(String nombreCurso, Profesor profesor) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante alumno) {
        this.estudiantes.add(alumno);
    }

    public int getCantidad(){
        return this.estudiantes.size();
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getProfesor(){
        return this.profesor.getDatos() + " titulo: " + this.profesor.getTitulo();
    }

    public ArrayList<Estudiante> getEstudiantes(){

        return this.estudiantes;
    }

    @Override
    public void inscripcion(Estudiante alumnoNuevo) {
        this.estudiantes.add(alumnoNuevo);
    }

    @Override
    public void retiro(Estudiante alumnoAburrido) {
        this.estudiantes.remove(alumnoAburrido);
    }


}
