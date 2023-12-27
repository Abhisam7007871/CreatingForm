package Src;

import javax.swing.*;

public class MyWindow extends JFrame {
    //constructor
    public MyWindow(){
        super.setTitle("My First Form");
        super.setSize(400,400);
        super.setLocation(900,100);
        //super.setVisible(true);
        setVisible(true);
        System.out.println("This is Constructor");
    }

}
