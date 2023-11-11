package javaapplication1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exp10ii extends JFrame 
    {  
    public static void main(String args[]){
        JFrame j = new JFrame("COUNTER"); 
        j.setSize(500,500);
        j.setVisible(true);
        JButton jb = new JButton("START");
        jb.setBounds(110,50,100,30);
        JButton jb2 = new JButton("STOP");
        jb2.setBounds(270,50,100,30);
        j.add(jb);
        j.add(jb2); 
        
        jb.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {   

        class startfunc extends Thread{
                
        public void run(){
            int i=0;

            while(true){
                try{
                    Thread.sleep(600);
                }
                catch(InterruptedException e){
                    System.out.print(e);
                    
                }
                JLabel text = new JLabel(String.valueOf(i));
                JPanel panel = new JPanel();
                j.getContentPane();
                text.setFont(new Font("Arial", Font.PLAIN, 30)); 
                text.setBounds(230, 150, 50,50);
                panel.setLayout(null);
                panel.add(text);
                j.add(panel);
                
                j.setSize(500, 500);
                j.setVisible(true);
                i++;      
        }
        }}     
         startfunc sf = new startfunc();
                sf.start();
        }});
            
        jb2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
        
        System.exit(0);
        }
    });   
        
    }
}
