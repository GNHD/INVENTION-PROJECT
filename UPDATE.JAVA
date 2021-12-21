import javax.swing.JFrame;
import javax.swing.*;



import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MK2 {

    MK2() 
    {
        
        JFrame frame = new JFrame();
        frame.setSize(800,500);

  
        
        JPanel p = new JPanel();
        p.setBackground(new Color(30, 102, 80));
        p.setBounds(0, 80, 400, 450);
        p.setLayout(null);
        frame.add(p); 
        
        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 800, 70);
        p1.setBackground(Color.BLACK);
        frame.getContentPane().add(p1,BorderLayout.NORTH);
        
        JLabel l = new JLabel("UPDATE INVENTION");
        l.setForeground(Color.WHITE);
        l.setBounds(220,10,400,40);
        l.setFont(new Font("Times New Roman", Font.PLAIN, 50));
        p1.add(l);
          
          JLabel name= new JLabel("Invention ID");
          name.setBounds(190,30, 180, 25);
          name.setFont(new Font("Times New Roman", Font.PLAIN, 20));
          p.add(name);
          
          JTextField n = new JTextField("");
          n.setBounds(360, 30, 190, 25);
          p.add(n);
          
          JLabel pin= new JLabel("Invention Name:");
          pin.setBounds(190,70, 180, 25);
          pin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
          p.add(pin);
          
          JTextField pcode = new JTextField("");
          pcode.setBounds(360, 70, 190, 25);
          p.add(pcode);
          
          JLabel district= new JLabel("Invention year :");
          district.setBounds(190,120, 180, 25);
          district.setFont(new Font("Times New Roman", Font.PLAIN, 20));
          p.add(district);
          
          JTextField dt = new JTextField("");
          dt.setBounds(360, 120, 190, 25);
          p.add(dt);
          
          

          JButton reg = new JButton("Update");
             reg.setBounds(360,190,100,40);
            reg.setBackground(new Color(25, 102, 80));
            reg.setForeground(Color.BLACK);
            p.add(reg);

          
          
          frame.setResizable(false);
          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         
}

                    private void dispose() {
                        // TODO Auto-generated method stub
                        
                    }


                    public void setVisible(boolean b) {
                        // TODO Auto-generated method stub
                        
                    }
                     public static void main(String[] args) {
                            
                           new MK2();
                              
                        }
    }
