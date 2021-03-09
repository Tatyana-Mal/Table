package com.company;

import com.sun.nio.sctp.MessageInfo;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Controller {
    View view;
    MyTableModel myTableModel;
    Student student;
    Frame frame;
    public Controller(View view) {
        this.view = view;

        view.button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                student=new Student(view.textField11.getText(),view.textField12.getText());
                view.myTableModel.addStudent(student);
            }
        });

        view.button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean b=false;
                try {
                    for (int i=0;i<view.myTableModel.getRowCount();i++){
                        if (view.textField2.getText().equals(Integer.toString(i))){
                            view.table.setRowSelectionInterval(i,i);
                            b=true;
                            break;
                        }
                    }
                    if (!b){
                        frame = new JFrame ("Test Message");
                        JOptionPane.showMessageDialog(frame, "Студента с таким номером не существует");
                    }
                }catch (NumberFormatException exception){
                    frame = new JFrame ("Test Message");
                    JOptionPane.showMessageDialog(frame, "Для поиска введите корректно номер студента");
                }

            }
        });

        view.button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    view.myTableModel.delStudent(Integer.parseInt(view.textField3.getText())-1);
                }catch (NumberFormatException exception){
                    frame = new JFrame ("Test Message");
                    JOptionPane.showMessageDialog(frame, "Для удаления введите корректно номер студента");
                }

            }
        });

    }

}
