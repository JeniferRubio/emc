package Clase12;

public class Estudiante 
{
    private String nombres;

    private int codigoAlum;

    private int dni;

    private Curso[] curso;
    private int contador;



    Estudiante(String nombres, int dni,int codigoAlum)
{
    this.nombres= nombres;
    this.codigoAlum= codigoAlum;
    this.dni=dni;
    this.contador=0;
    this.curso = new Curso[3];

    
}
    void setNombre(String nombres)
    {
        this.nombres= nombres;
    }

    String getNombres()
    {
      return nombres;
    }

    void setDni(int dni)
    {
        this.dni= dni;
    }

    int getDni()
    {
      return dni;
    }
    
    void setCodigo(int codigoAlum)
    {
        this.codigoAlum= codigoAlum ;
    }

    int getCodigo()
    {
      return codigoAlum;
    }


     public void setCurso(Curso curso)
    {
        this.curso[this.contador]= curso;
        this.contador++;
    }

    public Curso[] getCurso()
    {
      return curso;
    }



    
}
