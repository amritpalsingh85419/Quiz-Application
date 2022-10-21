package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start, back;
    
    
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel heading =  new JLabel("Welcome " + name + " to Game Of Knowledge");
        heading.setBounds(50, 20, 700, 50);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules =  new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
           "<html>" +
                    "1 : You can attempt the Quiz only once. " + "<br><br>" +
                    "2 : Each Question carries 10 marks. " +  "<br><br>" +
                    "3 : Questions are of Multiple Choice. " +  "<br><br>" +
                    "4 : You will get 15 seconds to answer the question. " + " <br><br>" +
                    "5 : There is no negative marking for wrong answer. " + " <br><br>" +
            "<html>"
        );
        add(rules);
        
        
        back = new JButton("BACK");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        
        start = new JButton("START");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
     
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }else{
             setVisible(false);
             new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}