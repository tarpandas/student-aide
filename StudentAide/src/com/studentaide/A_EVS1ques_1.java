
package com.studentaide;

import java.awt.Toolkit;
import java.awt.event.*;  
import javax.swing.*;  
  
class A_EVS1ques_1 extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10]; 
    A_EVS1ques_1(String s)  
    {  
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
        setSize(600,350);  
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
            l.setText("Que1: Which of the following means of transport moves on land only?");  
            jb[0].setText("boat");jb[1].setText("rocket");jb[2].setText("autorikshaw");jb[3].setText("submarine");   
        }  
        if(current==1)  
        {  
            l.setText("Que2: Which of the following is not a means of air transport?");  
            jb[0].setText("Helicopter");jb[1].setText("boat");jb[2].setText("aeroplane");jb[3].setText("rocket");  
        }  
        if(current==2)  
        {  
            l.setText("Que3: Which of the following is means of water transport?");  
            jb[0].setText("ship");jb[1].setText("bus");jb[2].setText("hot-air balloon");jb[3].setText("bicycle");  
        }  
        if(current==3)  
        {  
            l.setText("Que4: Which of the following cannot be used by people to travel from one place to another place?");  
            jb[0].setText("train");jb[1].setText("autorikshaw");jb[2].setText("scooter");jb[3].setText("police van");  
        }  
        if(current==4)  
        {  
            l.setText("Que5: Which of the following is the fastest means of transport?");  
            jb[0].setText("bicycle");jb[1].setText("bullock cart");jb[2].setText("aeroplane");jb[3].setText("bus");  
        }  
        if(current==5)  
        {  
            l.setText("Que6: Helicopter and rockets : ______ transport");  
            jb[0].setText("grass");jb[1].setText("water");jb[2].setText("air");jb[3].setText("land");  
        }  
        if(current==6)  
        {  
            l.setText("Que7: Which of the following means of transport runs by man? ");  
            jb[0].setText("cycle");jb[1].setText("autorikshaw");jb[2].setText("car");  
                        jb[3].setText("Both 1 and 2");  
        }  
        if(current==7)  
        {  
            l.setText("Que8: Which of the following means of transport does not produce smoke?");  
            jb[0].setText("bus");jb[1].setText("bicycle");jb[2].setText("car");  
                        jb[3].setText("train");         
        }  
        if(current==8)  
        {  
            l.setText("Que9: Which of the following is used to carry sick people to the hospital?");  
            jb[0].setText("police van");jb[1].setText("bullock cart");jb[2].setText("ambulance");jb[3].setText("cycle");  
        }  
        if(current==9)  
        {  
            l.setText("Que10: Where is submarine used?");  
            jb[0].setText("land");jb[1].setText("water");jb[2].setText("air");  
                        jb[3].setText("space");  
        }  
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[2].isSelected());  
        if(current==1)  
            return(jb[1].isSelected());  
        if(current==2)  
            return(jb[0].isSelected());  
        if(current==3)  
            return(jb[3].isSelected());  
        if(current==4)  
            return(jb[2].isSelected());  
        if(current==5)  
            return(jb[2].isSelected());  
        if(current==6)  
            return(jb[0].isSelected());  
        if(current==7)  
            return(jb[1].isSelected());  
        if(current==8)  
            return(jb[2].isSelected());  
        if(current==9)  
            return(jb[1].isSelected());  
        return false;  
    }  
    public static void main(String s[])  
    {  

    }  
}