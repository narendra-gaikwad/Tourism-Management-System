/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener{
    JButton b1,b2;
    Payment(){ 
        setBounds(300,125,800,600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/paytm.jpeg"));
           Image i2 = i1.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
           ImageIcon i3 = new ImageIcon(i2);
           JLabel l1= new JLabel(i3);
           l1.setBounds(0,0,800,600);
           add(l1);
           
            b1 =  new JButton("Pay");
           b1.setBounds(420,10,80,40);
           b1.addActionListener(this);
           l1.add(b1);
           
             b2 =  new JButton("Back");
           b2.setBounds(520,10,80,40);
            b2.addActionListener(this);
           l1.add(b2);
           
           
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1)
        {
            this.setVisible(false);
            new Paytm().setVisible(true);
        }else if(ae.getSource()==b2)
        {
            this.setVisible(false);
        }
    }
    
    public static void main(String arg[])
    {
        new Payment().setVisible(true);
    }
}
