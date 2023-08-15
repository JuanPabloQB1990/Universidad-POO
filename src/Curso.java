import java.util.ArrayList;

public class Curso implements Gestionable {
    private String nombreCurso;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Estudiante> estudiantesParticipantes;

    public Curso(String nombreCurso, Profesor profesor) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }


    public void agregarEstudiante(Estudiante alumno) {
        this.estudiantes.add(alumno);
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
