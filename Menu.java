import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class Menu implements ActionListener {

    

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(null);
  
        JPanel panel1 = new JPanel();
        JPanel panel2= new JPanel(setLayout(null));
     
       
       
        //Creation of object to draw border
        Border br=BorderFactory.createLineBorder(Color.white);
        Border brd=BorderFactory.createLineBorder(Color.black);
              
        panel1.setBounds(00, 0, 800, 70);
        panel1.setBorder(br);
        panel1.setBackground(Color.WHITE);
        frame.getContentPane().add(panel1,BorderLayout.NORTH);
        
        panel2.setBounds(0,70,800,700);
        panel2.setBorder(br);
        frame.getContentPane().add(panel2,BorderLayout.WEST);
        panel2.setBackground(Color.GRAY);
        
        JButton science = new JButton("SCIENCE");
        science.setBounds(0,50,200,50);
        science.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                new MK2();
            }
          } );
        panel2.add(science);
        
        JButton med = new JButton("Medicine");
        med.setBounds(300,50,200,50);
        med.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                new MK2();
            }
          } );
        panel2.add(med);
        
        JLabel label= new JLabel("WELCOME");
        label.setForeground(Color.BLACK);
        label.setPreferredSize(new Dimension(780,50));
        label.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        panel1.add(label);
        
        JLabel lab= new JLabel("SELECT A CATEGORY");
        lab.setPreferredSize(new Dimension(200,500));
        lab.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        lab.setBounds(110,80,300,100);
        panel2.add(lab);
        
        JButton s= new JButton("Scientific/Technological");
        s.setBounds(0,150,200,50);
        s.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                new MK2();
            }
          } );
        
        panel2.add(s);
        
        JButton c = new JButton("Cultural");
        c.setBounds(300,150,200,50);
        c.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                new MK2();
            }
          } );
        panel2.add(c);
        
        JButton i1 = new JButton("Invention under patentionship");
        i1.setBounds(0,250,200,50);
        i1.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                new MK2();
            }
          } );
        panel2.add(i1);
        
        JButton i2 = new JButton("Invention under nomination");
        i2.setBounds(300,250,200,50);
        i2.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                new MK2();
            }
          } );
        panel2.add(i2);
        
        JButton a = new JButton("Awards");
        a.setBounds(300,350,200,50);
        a.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                new MK2();
            }
          } );
        panel2.add(a);
        
        JButton l = new JButton("Logout");
        l.setBounds(0,350,200,50);
        panel2.add(l);
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(true);
        frame.setSize(500,500);
        frame.setVisible(true) ;
        
     
        
    }

    private static LayoutManager setLayout(Object object) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

}
