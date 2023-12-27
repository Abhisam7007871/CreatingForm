package Src;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    private JLabel heading;
    Font font = new Font("", Font.BOLD, 30);

    private JPanel mainPanel;
    private JLabel nameLabel,passwordLabel;
    private JTextField nameTextField;
    private JPasswordField passwordField;
    private JButton button1, button2;

    //constructor
    public MyWindow(){
        super.setTitle("My First Form");
        super.setSize(500,500);
        super.setLocation(900,100);
        //super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createGUI();

        setVisible(true);
        System.out.println("This is Constructor");
    }

    public void createGUI(){
        // this method create our gui
        this.setLayout(new BorderLayout());

        heading = new JLabel("My First Form...");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);

        this.add(heading, BorderLayout.NORTH);

        //////----Working With JPanel---///////

        mainPanel = new JPanel();

        //////----Setiing Layout of main panel----///////


        mainPanel.setLayout(new GridLayout(3,2));

        nameLabel=new JLabel("Enter Name");
        nameLabel.setFont(font);

        passwordLabel=new   JLabel("Enter Password");
        passwordLabel.setFont(font);

        nameTextField=new JTextField();
        nameTextField.setFont(font);

        passwordField=new JPasswordField();
        passwordField.setFont(font);

        button1=new JButton("Submit");
        button1.setFont(font);

        button2=new JButton("Reset");
        button2.setFont(font);

        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);

        mainPanel.add(passwordLabel);
        mainPanel.add(passwordField);

        mainPanel.add(button1);
        mainPanel.add(button2);

        this.add(mainPanel, BorderLayout.CENTER);


    }



}
