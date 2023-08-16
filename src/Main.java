// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // creacion estudiantes
        Estudiante estudiantePedro = new Estudiante("Pedro", 18, "masculino", "123456");
        Estudiante estudianteMaria = new Estudiante("Maria", 20, "femenino", "789654");
        Estudiante estudiantePablo = new Estudiante("Pablo", 25, "masculino", "456123");
        Estudiante estudianteJulanito = new Estudiante("Julanito", 30, "masculino", "111111");

        // creacion profesores
        Profesor profesorJuan = new Profesor("Juan", 40, "masculino", "Licenciado en programacion");
        Profesor profesorJose = new Profesor("Jose", 60, "masculino", "Licenciado en Historia");

        // creacion cursos
        CursoPresencial cursoProgramacionPresencial = new CursoPresencial("programacion", profesorJuan, "mañana");
        CursoVirtual cursoHistoria = new CursoVirtual("Historia", profesorJose, "Zoom");

        Universidad univesidadOxford = new Universidad("Oxford");
        univesidadOxford.agregarCurso(cursoProgramacionPresencial);
        univesidadOxford.agregarCurso(cursoHistoria);

        cursoHistoria.inscripcion(estudiantePedro);
        cursoHistoria.agregarEstudiante(estudianteMaria);
        cursoHistoria.inscripcion(estudiantePablo);
        cursoHistoria.agregarEstudiante(estudianteJulanito);
        cursoHistoria.agregarEstudianteParticipante(estudiantePedro);
        cursoHistoria.agregarEstudianteParticipante(estudianteMaria);

        //System.out.println(cursoHistoria.getProfesor());

        univesidadOxford.getCursosUniversidad();
        univesidadOxford.getEstudiantesUniversidad();
        univesidadOxford.getProfesoresUniversidad();
    }
}