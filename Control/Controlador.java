package Control;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import Vista.Ventana;
import Vista.Ventana2;
import Modelo.Fabrica;
import Modelo.Niño;

import Vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    Ventana v;
    Ventana2 v2;
    VentanaPrincipal vp;
    //ArrayList <Fabrica> f;
    Fabrica f;
    Niño niño;
    //ArrayList <Niño> niño;
    
    
    public Controlador(){
    v= new Ventana();
    v2= new Ventana2();
    vp = new VentanaPrincipal();
    f = new Fabrica();
    niño = new Niño();
 
    
    v.escucha(this);
    v2.escucha (this);
    vp.Escucha(this);
    }
    
    public void actionPerformed(java.awt.event.ActionEvent e){
        
        if(e.getSource()==v.b1){
            if(v.t1.getText().equals("") || v.t2.getText().equals("") || v.t3.getText().equals("") || v.t4.getText().equals("") ||
            v.t5.getText().equals("") || v.t6.getText().equals("") || v.t7.getText().equals("")|| v.t8.getText().equals("")){
                JOptionPane.showMessageDialog(null,"complete los datos");
        }else{
            niño.nn.add(new Niño(v.t1.getText(), v.t2.getText(),v.t3.getText(), v.t4.getText(),v.t5.getText(), v.t6.getText(),Integer.parseInt(v.t7.getText()),v.t8.getText()));
            v.t1.setText("");
            v.t2.setText("");
            v.t3.setText("");
            v.t4.setText("");
            v.t5.setText("");
            v.t6.setText("");
            v.t7.setText("");
            v.t8.setText("");
        }
    
    }
    
    if(e.getSource()==v.b2){
        v.dispose();
       
        vp.setVisible(true);
    }
    
    if(e.getSource()==v2.b3){
        if(v2.tt1.getText().equals("") || v2.tt2.getText().equals("") || v2.tt3.getText().equals("") || v2.tt4.getText().equals("") ||
            v2.tt5.getText().equals("") ){
                JOptionPane.showMessageDialog(null,"complete los datos");
        }else{
         f.fabrica.add(new Fabrica(v2.tt1.getText(),v2.tt2.getText(),v2.tt3.getText(),Integer.parseInt(v2.tt4.getText()),v2.tt5.getText()));   
         v2.tt1.setText("");
         v2.tt2.setText("");
         v2.tt3.setText("");
         v2.tt4.setText("");
         v2.tt5.setText("");
        }
    }
    
    if(e.getSource()==v2.b4){
        v2.dispose();
        
      
        vp.setVisible(true);
    }
    
    if(e.getSource()==vp.b5){
        vp.dispose();
        v.setVisible(true);
    }
    
    if(e.getSource()==vp.b6){
        vp.dispose();
        v2.setVisible(true);
    }
    
    if(e.getSource()==vp.b7){
        vp.dispose();
        
    }
    
  }
  
}
