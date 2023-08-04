package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class VentanaPrincipal extends JFrame
{
   public JPanel p1,p2;
   public JButton b5,b6,b7,b8;
   public JTextArea a1;
    public VentanaPrincipal(){
    setTitle("Navidad");
    setVisible(true);    
    setLocationRelativeTo(null);
    setSize(230,300);
    setLayout(new GridLayout(2,1));
    
    p1 = new JPanel();
    p1.setVisible(true);
    add(p1);
    p1.setLayout(null);
    
    p1.setBorder(BorderFactory.createTitledBorder("Registro"));
    
    p2 = new JPanel();
    p2.setVisible(true);
    add(p2);
    p2.setLayout(null);
    p2.setBorder(BorderFactory.createTitledBorder("Consulta"));
    
    b5 = new JButton("Registrar Niño");
    b5.setBounds(5,15,200,30);
    b6 = new JButton("Registrar Regalo");
    b6.setBounds(5,50,200,30);
    b7= new JButton("Listo");
    b7.setBounds(5,85,200,30);
    b8 = new JButton("Consulta Por Contienente");
    b8.setBounds(5,15,200,30);
    a1 = new JTextArea("");
    a1.setBounds(5,50,200,50);
    p1.add(b5);
    p1.add(b6);
    p1.add(b7);
    p2.add(b8);
    p2.add(a1);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public void Escucha(ActionListener a){
    b5.addActionListener(a);
    b6.addActionListener(a);
    b7.addActionListener(a);
    b8.addActionListener(a);
  }
}
