package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View extends JFrame {
    University university=new University();

    JLabel label1 = new JLabel("Добавить студента");
    JLabel label11 = new JLabel("Имя");
    JLabel label12 = new JLabel("Группа");
    JTextField textField11 = new JTextField("__________");
    JTextField textField12 = new JTextField("__________");
    JButton button1 = new JButton("Добавить");

    JLabel label2 = new JLabel("Найти студента");
    JLabel label21 = new JLabel("Имя");
    JTextField textField2 = new JTextField("__________");
    JButton button2 = new JButton("Найти");

    JLabel label3 = new JLabel("Удалить студента");
    JLabel label31 = new JLabel("Имя");
    JTextField textField3 = new JTextField("__________");
    JButton button3 = new JButton("Удалить");

    JTable table;
    JScrollPane scrollPane;
    MyTableModel myTableModel;
    boolean p=false;
    boolean p_=false;
    
    public View() {
        setSize(700,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Container p1=new Container();
        add(p1);
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));


        Container c1=new Container();
        p1.add(c1);
        c1.setLayout(new BorderLayout());
        c1.add(label1,BorderLayout.NORTH);
        Container c11=new Container();
        c11.setLayout(new BoxLayout(c11, BoxLayout.Y_AXIS));
        c1.add(c11,BorderLayout.WEST);
        c11.add(label11);
        c11.add(label12);
        Container c12=new Container();
        c12.setLayout(new BoxLayout(c12, BoxLayout.Y_AXIS));
        c1.add(c12,BorderLayout.EAST);
        c12.add(textField11);
        c12.add(textField12);
        c1.add(button1,BorderLayout.SOUTH);

        JPanel c2=new JPanel();
        p1.add(c2);
        c2.setLayout(new BorderLayout());
        c2.add(label2,BorderLayout.NORTH);
        c2.add(label21,BorderLayout.WEST);
        c2.add(textField2,BorderLayout.EAST);
        c2.add(button2,BorderLayout.SOUTH);

        JPanel c3=new JPanel();
        p1.add(c3);
        c3.setLayout(new BorderLayout());
        c3.add(label3,BorderLayout.NORTH);
        c3.add(label31,BorderLayout.WEST);
        c3.add(textField3,BorderLayout.EAST);
        c3.add(button3,BorderLayout.SOUTH);

        Container p2=new Container();
        p2.setLayout(new FlowLayout());
        add(p2);
        table=new JTable();
        table.setModel(myTableModel=new MyTableModel(university));
        scrollPane = new JScrollPane(table);
        p2.add(scrollPane);
        setVisible(true);

        textField11.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if(!p) {
                    textField11.setText("");
                    p=true;
                }

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                if(!p) {
                    textField11.setText("");
                    p=true;
                }
            }
        });

        textField12.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if(!p_) {
                    textField12.setText("");
                    p_=true;
                }

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                if(!p_) {
                    textField12.setText("");
                    p_=true;
                }
            }
        });
    }
}