package Vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana2 extends JFrame implements ActionListener
{
    public JPanel p1;
    public JLabel ll1,ll2,ll3,ll4,ll5;
    public JTextField tt1,tt2,tt3,tt4,tt5;
    public JButton b3,b4;
    public JTextArea a1;
    
    public Ventana2(){
        setTitle("Jugetes");
    setVisible(false);    
    setLocationRelativeTo(null);
    setSize(350,300);
    setLayout(new GridLayout(1,1));
    
    p1 = new JPanel();
    
    p1.setVisible(true);
    add(p1);
    p1.setLayout(new GridLayout(6,2));
    p1.setBorder(BorderFactory.createTitledBorder("Datos"));
    
    ll1 = new JLabel("Codigo: ");
    ll2 = new JLabel("Nombre: ");
    ll3 = new JLabel("para: ");
    ll4 = new JLabel("Edad: ");
    ll5 = new JLabel("Estado");
    
    tt1= new JTextField("");
    tt2= new JTextField("");
    tt3= new JTextField("");
    tt4= new JTextField("");
    tt5= new JTextField("");

    
    
    b3 = new JButton("Registrar");
   
    b4 = new JButton("Terminar");
  
 
    
    p1.add(ll1);
    p1.add(tt1);
    p1.add(ll2);
    p1.add(tt2);
    p1.add(ll3);
    p1.add(tt3);
    p1.add(ll4);
    p1.add(tt4);
    p1.add(ll5);
    p1.add(tt5);
    p1.add(b3);
    p1.add(b4);
    
    
    
   
    b3.addActionListener(this);
    b4.addActionListener(this);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
    public void escucha(ActionListener a){
    b3.addActionListener(a);
    b4.addActionListener(a);
    }
    
    public void actionPerformed(java.awt.event.ActionEvent e){
        
    }
    
}

