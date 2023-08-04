package Modelo;
import java.io.*;
import java.util.ArrayList;
public class Niño {
    String nombre;
    String direccion;
    String pais;
    String continente;
    String genero;
    String jugete;
    Integer edad;
    String estado;
    public ArrayList <Niño> nn;
    public Niño xx;
    String informacion;
    FileWriter fw;
    BufferedWriter bw;
    PrintWriter pw;
    
    
    public Niño() {
        nn = new ArrayList<>();
    }

    public Niño(String nombre, String direccion, String pais, String continente, String genero, String jugete, Integer edad, String estado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pais = pais;
        this.continente = continente;
        this.genero = genero;
        this.jugete = jugete;
        this.edad = edad;
        this.estado = estado;
        nn = new ArrayList<>();
        xx = new Niño();
        }
        
         public void guardar(Niño n){
             nn.add(n);
             String cadena="";
         try{
             fw = new FileWriter("navidad.txt",true);
             bw = new BufferedWriter(fw);
             
             BufferedReader br = new BufferedReader(new FileReader("navidad.txt"));
              
              //String bfr;
             // for(int i=0; i<nn.size();i++){
             //while((bfr= br.readLine())!=null || (bfr= br.readLine())==null){
              bw.newLine();
              bw.write(this.nombre+", "+ this.direccion+", "+ this.pais+", "+this.continente+", "+this.genero+", " +this.jugete+", "+this.edad+", "+this.estado); 
              bw.close();
              br.close();
             // break;
             //}
          // }
             
            }catch(Exception e){
                
            }
            
    }
    
    public void act (ArrayList <Niño> x){
        
    }
    
    public void Actualizar(){
        if(!nn.isEmpty()){
            guardar(xx);
        }
    }
    
      
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getJugete() {
        return jugete;
    }

    public void setJugete(String jugete) {
        this.jugete = jugete;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}

