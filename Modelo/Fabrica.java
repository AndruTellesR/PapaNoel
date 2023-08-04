package Modelo;
import java.io.*;
import java.util.ArrayList;
public class Fabrica
{
    String codigo;
    String nombre;
    String para;
    Integer edad;
    String estado;
    
    FileWriter fw2;
    BufferedWriter bw2;
    FileReader fr;
    BufferedReader br;
    public ArrayList <Fabrica> fabrica;
    public Fabrica(){
        fabrica = new ArrayList<>();
    }
 

    public Fabrica(String codigo, String nombre,String para,Integer edad, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.para=para;
        this.edad = edad;
        this.estado = estado;
         fabrica = new ArrayList<>();    
        }
    
     public void GuardarJ(Fabrica f){
         fabrica.add(f);
        
         try{
          fw2 = new FileWriter("jugetes.txt",true);
          bw2 = new BufferedWriter(fw2);
      
          fr = new FileReader("jugetes.txt");
          br = new BufferedReader(fr);
        
          bw2.newLine();
          bw2.write(this.codigo+", "+this.nombre+", "+this.para+", "+this.edad+", "+this.estado);
        
          bw2.close();
          br.close();

         }catch(Exception e){
        
        }
    
    }
 
    public void Entrega(String nombre){
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
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
