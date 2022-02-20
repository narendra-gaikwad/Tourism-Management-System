/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

/**
 *
 * @author Naren
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;




public class Signup extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1,t2,t3,t4;
    Choice c1;
    Signup(){
        setBounds(225,225,900,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1 = new JLabel("UserName");
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        l1.setBounds(50,50,125,25);
        p1.add(l1);
         
         t1 = new JTextField();
        t1.setBounds(190,50,180,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        add(t1);
        
        
             
        JLabel l2 = new JLabel("Name");
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setBounds(50,100,125,25);
        p1.add(l2);
        
         t2 = new JTextField();
        t2.setBounds(190,100,180,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        add(t2);
        
             
        JLabel l3 = new JLabel("Password");
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setBounds(50,150,125,25);
        p1.add(l3);
        
         t3 = new JTextField();
        t3.setBounds(190,150,180,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        add(t3);
        
        JLabel l4 = new JLabel("Security question");
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        l4.setBounds(50,200,125,25);
        p1.add(l4);
        
        
        c1 = new Choice();
        c1.add("Choice Your Questions");
        c1.add("Your Fathers Name");
        c1.add("Your lucky place");
        c1.add("Your hobbie");
        c1.add("Your playing game");
        c1.setBounds(190,200,180,25);
        p1.add(c1);
        
        JLabel l5 = new JLabel("Answer");
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setBounds(50,250,125,25);
        p1.add(l5);
        
         t4 = new JTextField();
        t4.setBounds(190,250,180,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        add(t4);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(580,50,250,250);
        add(l6);
        
         b1 = new JButton("Create");
        b1.setFont(new Font("Tahoma",Font.BOLD,14)); 
        b1.setForeground(new Color(133,193,233));
        b1.setBackground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(80,300,100,30);
        p1.add(b1);
        
         b2 = new JButton("Back");
         b2.setFont(new Font("Tahoma",Font.BOLD,14)); 
          b2.setForeground(new Color(133,193,233));
        b2.setBackground(Color.WHITE);
          b2.addActionListener(this);
        b2.setBounds(200,300,100,30);
        p1.add(b2);
        
    }
   
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            String username =t1.getText();
            String name = t2.getText();
            String password = t3.getText();
            String security = c1.getSelectedItem();
            String answer = t4.getText();
            
            
            String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
             
            try
            {
               Conn p = new Conn();
               p.s.executeUpdate(query);
              
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                   
                 this.setVisible(false);
                new Login().setVisible(true);
                
              
              

            }catch(Exception e)
            {
              e.printStackTrace();
               System.out.println(e.getMessage());
            }
            
            
            
        }else if(ae.getSource()== b2){
            new Login().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] arg) 
    {
        new Signup().setVisible(true);
    }
    
}
