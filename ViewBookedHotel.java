
package travel.management.system;



import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class ViewBookedHotel  extends JFrame implements ActionListener {
    
    JButton b1;
        public ViewBookedHotel(String username){
        setBounds(230,175,1000,580);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookedDetails.jpg"));
           Image i2 = i1.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
           ImageIcon i3 = new ImageIcon(i2);
           JLabel l30 = new JLabel(i3);
           l30.setBounds(450,20,600,400);
           add(l30);
        
        JLabel heading = new JLabel("VIEW BOOKED HOTEL DETAILS");
        heading.setBounds(60,0,300,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(heading);
        
        JLabel l1 = new JLabel("Username:");
        l1.setBounds(30,70,100,30);
        add(l1);
        JLabel l11 = new JLabel();
        l11.setBounds(250,70,200,30);
        add(l11);
        
        
        JLabel l2 = new JLabel("Hotel Name:");
        l2.setBounds(30,110,100,30);
        add(l2);
         JLabel l12 = new JLabel();
        l12.setBounds(250,110,200,30);
        add(l12);
        
        
          JLabel l3 = new JLabel("Total Person:");
        l3.setBounds(30,150,100,30);
        add(l3);
         JLabel l13 = new JLabel();
        l13.setBounds(250,150,200,30);
        add(l13);
        
        
         JLabel l4 = new JLabel("Total Days");
        l4.setBounds(30,190,100,30);
        add(l4);
         JLabel l14 = new JLabel();
        l14.setBounds(250,190,200,30);
        add(l14);
        
        JLabel l5 = new JLabel("Ac included:");
        l5.setBounds(30,240,100,30);
        add(l5);
         JLabel l15 = new JLabel();
        l15.setBounds(250,240,200,30);
        add(l15);
        
        JLabel l6 = new JLabel("Food Included");
        l6.setBounds(30,280,100,30);
        add(l6);
         JLabel l16= new JLabel();
        l16.setBounds(250,280,200,30);
        add(l16);
        
        JLabel l7= new JLabel("Id");
        l7.setBounds(30,320,100,30);
        add(l7);
         JLabel l17 = new JLabel();
        l17.setBounds(250,320,200,30);
        add(l17);
        
         JLabel l8= new JLabel("Number");
        l8.setBounds(30,360,100,30);
        add(l8);
         JLabel l18 = new JLabel();
        l18.setBounds(250,360,200,30);
        add(l18);
        
         JLabel l9= new JLabel("Phone");
        l9.setBounds(30,400,100,30);
        add(l9);
         JLabel l19 = new JLabel();
        l19.setBounds(250,400,200,30);
        add(l19);
        
         JLabel l10= new JLabel("Phone");
        l10.setBounds(30,440,100,30);
        add(l10);
         JLabel l20 = new JLabel();
        l20.setBounds(250,440,200,30);
        add(l20);
        
        
        try{
           Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bookhotell where username = '"+username+"'");
            while(rs.next())
                    {
                    l11.setText(rs.getString(1));
                     l12.setText(rs.getString(2));
                      l13.setText(rs.getString(3));
                       l14.setText(rs.getString(4));
                        l15.setText(rs.getString(5));
                         l16.setText(rs.getString(6));
                          l17.setText(rs.getString(7));
                          l18.setText(rs.getString(8));
                           l19.setText(rs.getString(9));
                            l20.setText(rs.getString(10));
                    }
        }catch(Exception e)
        {
            
        }
        
        b1 = new JButton("Back");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150,480,150,25);
        b1.addActionListener(this);
        add(b1);
        
    }
        
        public void actionPerformed(ActionEvent ae)
        {
            this.setVisible(false);
        }
        
        
        public static void main(String[] args)
        {
            new ViewBookedHotel("").setVisible(true);
        }
    
}