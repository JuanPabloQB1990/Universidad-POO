import java.util.ArrayList;

public class CursoVirtual extends Curso {
    private String plataforma;

    private ArrayList<Estudiante> estudiantesParticipantes;

    public CursoVirtual(String nombreCurso, Profesor profesor, String plataforma) {
        super(nombreCurso, profesor);
        this.plataforma = plataforma;
        this.estudiantesParticipantes = new ArrayList<>();
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void agregarEstudianteParticipante(Estudiante alumno) {
        this.estudiantesParticipantes.add(alumno);
    }

    public double calcularParticipacionPromedio() {
        double promedioParticipantes = (double) getCantidad() / this.estudiantesParticipantes.size();
        return promedioParticipantes;
    }

}
