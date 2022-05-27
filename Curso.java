package Clase12;

public class Curso 
{
   
    private String asignatura;
    private int codigo;
    private Docente[] docente;
    private int contador;


    
    public Curso(String asignatura,int codigo)
    {
      this.asignatura= asignatura;
      this.contador=0;
      this.codigo=codigo;
      this.docente = new Docente[2];
    }

   public void setAsignatura(String asignatura)
    {
        this.asignatura= asignatura;
    }

    public String getAsignatura()
    {
      return asignatura;
    }
    public void setCodigo(int codigo)
    {
        this.codigo= codigo;
    }

    public int getCodigo()
    {
      return codigo;
    }
    public void setDocente(Docente docente)
    {
        this.docente[this.contador]= docente;
        this.contador++;
    }

    public Docente[] getDocente()
    {
      return docente;
    }



}
