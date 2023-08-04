package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana extends JFrame 
{
    public JPanel p1;
    public JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    public JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    public JButton b1,b2;
 
    
    public Ventana(){
        setTitle("Solicitud Navideña");
    setVisible(false);    
    setLocationRelativeTo(null);
    setSize(350,400);
    setLayout(new GridLayout(1,1));
    
    p1 = new JPanel();
    p1.setVisible(true);
    add(p1);
    p1.setLayout(new GridLayout(9,2));
    p1.setBorder(BorderFactory.createTitledBorder("Datos"));
    
    
    l1 = new JLabel("Nombre Y Apellido: ");
    l2 = new JLabel("Direccion: ");
    l3 = new JLabel("pais: ");
    l4 = new JLabel("Continente: ");
    l5 = new JLabel("Genero: ");
    l6 = new JLabel("Jugete: ");
    l7 = new JLabel("Edad: ");
    l8 = new JLabel("Estado: ");
    
    t1= new JTextField("");
    t2= new JTextField("");
    t3= new JTextField("");
    t4= new JTextField("");
    t5= new JTextField("");
    t6= new JTextField("");
    t7= new JTextField("");
    t8= new JTextField("");
    
    
    b1 = new JButton("Registrar");
   
    b2 = new JButton("Terminar");
   
    
    p1.add(l1);
    p1.add(t1);
    p1.add(l2);
    p1.add(t2);
    p1.add(l3);
    p1.add(t3);
    p1.add(l4);
    p1.add(t4);
    p1.add(l5);
    p1.add(t5);
    p1.add(l6);
    p1.add(t6);
    p1.add(l7);
    p1.add(t7);
    p1.add(l8);
    p1.add(t8);
    p1.add(b1);
    p1.add(b2);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public void escucha(ActionListener a){
    b1.addActionListener(a);
    b2.addActionListener(a);
    }
}
    
    
    
