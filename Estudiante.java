import java.util.*;
public class Estudiante
{
    String codigo;
    String nombre;
    String telefono;
    String email;
    String direccion;
    Integer edad;
    String documento;
    String tipodoc;
    Integer creditos;
    Integer semestre;
    String estado;
    Carrera carrera;
 
    public Estudiante()
    {
        this.codigo="1151892";
        this.nombre="Joan Barreto";
        this.telefono="3229507135";
        this.email="joanstiwardbmed@ufps.edu.co";
        this.direccion="AV 34 #32-54 La Divina Pastora";
        this.edad=18;
        this.documento="1004844465";
        this.tipodoc="cc";
        this.creditos=120;
        this.semestre=20;
        this.estado="Activo";
        this.carrera=new Carrera();
    }

    public Estudiante( String codigo, String nombre,String telefono,String email,String direccion,Integer edad,String documento,String tipodoc,Integer creditos,Integer semestre,
    String estado,Carrera carrera)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.telefono=telefono;
        this.email=email;
        this.direccion=direccion;
        this.edad=edad;
        this.documento=documento;
        this.tipodoc=tipodoc;
        this.creditos=creditos;
        this.semestre=semestre;
        this.estado=estado;
        this.carrera=carrera;

    }

    public void  calcularMayorEdad()
    {
        if (getEdad()>=18){
            System.out.println("El estudiante es mayor de edad");
        }
        else {
            System.out.println("El estudiante es menor de edad");}

    }

    public void cursoTotalCreditos()
    {
        if(getCreditos()>=carrera.getNumcreditos()){
            System.out.println("El estudiante a cursado:" +getCreditos());
            System.out.println("La carrera tiene:" +carrera.getNumcreditos());
            System.out.println("Estás a un paso de ser:   "+carrera.getTitulo());
        }
        else 
        {   System.out.println("El estudiante a cursado:" +getCreditos());
            System.out.println("La carrera tiene:" +carrera.getNumcreditos());
            System.out.println("El que persevera alcanza");}
    }

    public void matricularProyecto(){
        if(getCreditos()>=(carrera.getNumcreditos()*0.7)&&getSemestre()>=7)
        {
            System.out.println("Señor estudiante usted ya puede matricular proyecto de grado");}

        else
            System.out.println("No puedes matricular poryecto de grado te faltan creditos y semestres por cursar");
    }

    public void promedioCreditosSemestre(){
    
       Float promedio=(float)(getCreditos()/getSemestre());
        
        System.out.println("El promedio de creditos cursados es: " + promedio);
    
    }
    
    public void actualizarEstado(){
   
        if (getSemestre()>=carrera.getNumsem()*2)
        {
             this.estado ="PFU";
        }
        System.out.println("Los semestres cursados son: " + getSemestre());
        System.out.println("Los semestres cursados son: " +carrera.getNumsem());
    
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

    
    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    
    public String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    
    public Integer getEdad(){
        return this.edad;
    }
    public void setEdad(Integer edad){
        this.edad = edad;
    }

   
    public String getDocumento(){
        return this.documento;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }

   
    public String getTipodoc(){
        return this.tipodoc;
    }
    public void setTipodoc(String tipodoc){
        this.tipodoc = tipodoc;
    }

    
    public Integer getCreditos(){
        return this.creditos;
    }
    public void setCreditos(Integer creditos){
        this.creditos = creditos;
    }

    
    public Integer getSemestre(){
        return this.semestre;
    }
    public void setSemestre(Integer semestre){
        this.semestre = semestre;
    }

    
    public String getEstado(){
        return this.estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }

    
    public Carrera getCarrera(){
        return this.carrera;
    }
    public void setCarrera(Carrera carrera){
        this.carrera = carrera;
    }

}


