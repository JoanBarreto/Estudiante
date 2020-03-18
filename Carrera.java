import java.util.*;
public class Carrera
{
    String codigo;
    String nombre;
    Integer numsem;
    Integer numcreditos;
    String titulo;
    String director;
    Date fechaini;

    
    public Carrera()
    {
        this.codigo="015";
        this.nombre="Ingeniería de Sistemas";
        this.numsem=10;
        this.numcreditos=150;
        this.titulo="Ingeniero de Sistemas";
        this.director="Oscar Gallardo";
        this.fechaini= new java.util.Date();
    }

    public Carrera(String codigo,String nombre,Integer numsem,Integer numcreditos,String titulo,String director,
    Date fechaini)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.numsem=numsem;
        this.numcreditos=numcreditos;
        this.titulo=titulo;
        this.director=director;
        this.fechaini=fechaini;

    }

    public void imprimirCreditos(){
        System.out.println("Los creditos de la carrera so:" +getNumcreditos());
    }

   
    public String getCodigo(){
        return this.codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    
    public Integer getNumsem(){
        return this.numsem;
    }
    public void setNumsem(Integer numsem){
        this.numsem = numsem;
    }//end method setNumsem

    
    public Integer getNumcreditos(){
        return this.numcreditos;
    }
    public void setNumcreditos(Integer numcreditos){
        this.numcreditos = numcreditos;
    }

    
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }//end method setTitulo

  
    public String getDirector(){
        return this.director;
    }
    public void setDirector(String director){
        this.director = director;
    }

    
    public Date getFechaini(){
        return this.fechaini;
    }
    public void setFechaini(Date fechaini){
        this.fechaini = fechaini;
    }

}