public class CursoVirtual extends Curso {
    private String plataforma;

    public CursoVirtual(String nombreCurso, Profesor profesor, String plataforma) {
        super(nombreCurso, profesor);
        this.plataforma = plataforma;
    }

    public double calcularParticipacionPromedio() {
        return 0.0;
    }

}
