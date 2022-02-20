/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

/**
 *
 * @author Narenf
 */


import javax.swing.*;
import java.awt.*;
public class Splash {
    public static void main(String arg[])
    {
       SplashFrame frame = new SplashFrame();
       frame.setVisible(true);
       int x=1;
       
       for(int i=1; i<= 700;i+=6,x+=7)
       {
         frame.setLocation(700-(x+i)/2,350-(i/2));
         frame.setSize(x+i,i);
         try{
             Thread.sleep(10);
         }catch(Exception e){}
       }
        Login l = new Login();
            l.setVisible(true);
       
       frame.setVisible(true);
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class SplashFrame extends JFrame implements Runnable{
    Thread t1;
  
    SplashFrame(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1600,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
       add(l1);
       

       
       setBounds(200,200,1600,700);//location , size
       setUndecorated(true);
       t1 = new Thread(this);
       t1.start();
    }
    
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
          
        }catch(Exception e){
    }
         
    }
    
}

