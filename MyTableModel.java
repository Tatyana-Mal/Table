package com.company;

import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {
    University university;

    public MyTableModel(University university) {
        this.university = university;
    }

    @Override
    public int getRowCount() {
        return university.listStudent.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }


    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
            return "№";
            case 1:
                return "Имя";
            case 2:
                return "Группа";
            default:return "";
        }
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex) {
            case 0:
                return rowIndex+1;
            case 1:
                return university.listStudent.get(rowIndex).getName();
            case 2:
                return university.listStudent.get(rowIndex).getGroup();
            default:
                return "";
        }
    }

    public void addStudent(Student student) {
        this.university.listStudent.add(student);
        this.fireTableDataChanged();
    }

    public void delStudent(int numStud) {
        this.university.listStudent.remove(numStud);
        this.fireTableDataChanged();
    }
}
