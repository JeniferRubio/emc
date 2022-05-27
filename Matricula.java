package Clase12;

public class Matricula 
{
    private String semestre;
    private Estudiante[] estudiante;
    private int contador;

    public Matricula(String semestre)
    {
       this.semestre = semestre;
       this.contador=0;

        this.estudiante = new Estudiante[1];
    }

    void setSemestre(String semestre)
    {
       this.semestre = semestre;
    }

    String getSemestre()
    {
        return semestre;
    }
    void setEstudiante(Estudiante estudiante)
    {
       this.estudiante[this.contador++] = estudiante;
    }

    Estudiante[] getEstudiante()
    {
        return estudiante;
    }


}
