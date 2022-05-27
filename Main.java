package Clase12;

public class Main 
{
        public static void main(String args[])
        {
            Docente luisa = new Docente("LUISA");
            Docente wali = new Docente("WALI");
            Docente luis= new Docente("luis");
            Docente ana = new Docente("Ana Fernanda");
            Docente angel = new Docente("Angel Pereyra");
            Docente mila = new Docente("Milagros Chamorro");
    
            Curso cursoMatematica = new Curso("matematica", 123456);
            cursoMatematica.setDocente(luisa);
            cursoMatematica.setDocente(ana);
    
            Curso cursoLenguaje = new Curso("lenguaje", 123456789);
            cursoLenguaje.setDocente(wali);
            cursoLenguaje.setDocente(angel);


            
            Curso cursoPOO = new Curso("POO", 444444);
            cursoPOO.setDocente(luis);
            cursoPOO.setDocente(mila);

    
            Estudiante estudiante = new Estudiante("bella", 74988739, 200345682);
            estudiante.setCurso(cursoMatematica);
            estudiante.setCurso(cursoPOO);
            estudiante.setCurso(cursoLenguaje);

            Matricula matricula = new Matricula("2022-I");
            matricula.setEstudiante(estudiante);
            
            for (Estudiante e : matricula.getEstudiante()) {
                System.out.println();
                System.out.println("Estudiante:" + e.getNombres());
                System.out.println("Dni:" + e.getDni());
                System.out.println("codigo de alumno:" + e.getCodigo());
                System.out.println("semestre: " + matricula.getSemestre());
    
                for (Curso c : e.getCurso()) {
                    System.out.println();
                    System.out.println("Curso: " + c.getAsignatura());
                    System.out.println("Codigo del curso: " + c.getCodigo());
    
                    for (Docente d : c.getDocente()) {
                        System.out.println("Docente: " + d.getNombres());
                    }
                }
            }
                
           
        
             
}
}
