/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentaide;

import java.awt.Toolkit;
import java.awt.event.*;  
import javax.swing.*;  
  
class B_ENGG1ques_2 extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    
    B_ENGG1ques_2(String s) {      
        super(s);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Project_Icon.png")));
        l=new JLabel();  
        add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }  
        b1=new JButton("Next");  
        b2=new JButton("Bookmark");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        add(b1);add(b2);  
        set();  
        l.setBounds(30,40,450,20);  
        jb[0].setBounds(50,80,100,20);  
        jb[1].setBounds(50,110,100,20);  
        jb[2].setBounds(50,140,100,20);  
        jb[3].setBounds(50,170,100,20);  
        b1.setBounds(100,240,100,30);  
        b2.setBounds(270,240,100,30);  
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350); //To change body of generated methods, choose Tools | Templates.
    }
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            set();    
            if(current==9)  
            {  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        }  
        if(e.getActionCommand().equals("Bookmark"))  
        {  
            JButton bk=new JButton("Bookmark"+x);  
            bk.setBounds(480,20+30*x,100,30);  
            add(bk);  
            bk.addActionListener(this);  
            m[x]=current;  
            x++;  
            current++;  
            set();    
            if(current==9)  
                b2.setText("Result");  
            setVisible(false);  
            setVisible(true);  
        }  
        for(int i=0,y=1;i<x;i++,y++)  
        {  
        if(e.getActionCommand().equals("Bookmark"+y))  
        {  
            if(check())  
                count=count+1;  
            now=current;  
            current=m[y];  
            set();  
            ((JButton)e.getSource()).setEnabled(false);  
            current=now;  
        }  
        }  
      
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;  
            //System.out.println("correct ans="+count);  
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            this.dispose();   
        }  
    }  
    void set()  
    {  
        jb[4].setSelected(true);  
        if(current==0)  
        {  
            l.setText("Que1: Select the Noun: I decided to catch the bus because I was late.");  
            jb[0].setText("catch");jb[1].setText("bus");jb[2].setText("late");jb[3].setText("the");   
        }  
        if(current==1)  
        {  
            l.setText("Que2: Select the Noun: The queue was very long I didn’t wait.");  
            jb[0].setText("queue");jb[1].setText("long");jb[2].setText("very");jb[3].setText("wait");  
        }  
        if(current==2)  
        {  
            l.setText("Que3: Select the Noun: There are no interesting programme no tonight.");  
            jb[0].setText("There");jb[1].setText("tonight");jb[2].setText("programme");jb[3].setText("interesting");  
        }  
        if(current==3)  
        {  
            l.setText("Que4: Select the noun: I need to find something that my brother will like.");  
            jb[0].setText("need");jb[1].setText("find");jb[2].setText("brother");jb[3].setText("tonight");  
        }  
        if(current==4)  
        {  
            l.setText("Que5: The plural of ‘child’ is");  
            jb[0].setText("Childs");jb[1].setText("Child");jb[2].setText("Childes");jb[3].setText("Children");  
        }  
        if(current==5)  
        {  
            l.setText("Que6: Select proper noun: " +
"Kieran was not performing impressive");  
            jb[0].setText("Kieran");jb[1].setText("impressive");jb[2].setText("was");jb[3].setText("performing");  
        }  
        if(current==6)  
        {  
            l.setText("Que7: 'My family support me.' Which word is a collective noun? ");  
            jb[0].setText("My");jb[1].setText("support");jb[2].setText("me");  
                        jb[3].setText("family");  
        }  
        if(current==7)  
        {  
            l.setText("Que8: 'My mother wears gold jewellery.' which word is a material noun ?");  
            jb[0].setText("jewellery");jb[1].setText("gold");jb[2].setText("mother");  
                        jb[3].setText("my");         
        }  
        if(current==8)  
        {  
            l.setText("Que9: The name of persons,place,animal and things are called_______.");  
            jb[0].setText("Adverb");jb[1].setText("Noun");jb[2].setText("Verb");jb[3].setText("Preposition");  
        }  
        if(current==9)  
        {  
            l.setText("Que10: Select the Noun: " +
"When are the window being replaced?");  
            jb[0].setText("When");jb[1].setText("are");jb[2].setText("window");  
                        jb[3].setText("replaced");  
        }  
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[1].isSelected());  
        if(current==1)  
            return(jb[0].isSelected());  
        if(current==2)  
            return(jb[2].isSelected());  
        if(current==3)  
            return(jb[2].isSelected());  
        if(current==4)  
            return(jb[3].isSelected());  
        if(current==5)  
            return(jb[0].isSelected());  
        if(current==6)  
            return(jb[3].isSelected());  
        if(current==7)  
            return(jb[0].isSelected());  
        if(current==8)  
            return(jb[1].isSelected());  
        if(current==9)  
            return(jb[2].isSelected());  
        return false;  
    }  
    public static void main(String s[])  
    {  
           
    }  
} 