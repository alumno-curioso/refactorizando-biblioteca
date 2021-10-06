package model.tools.tables;

import server.querys.tools.GetColumnsNames;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSet;

import static server.querys.tools.GetColumnSize.*;
import static server.querys.tools.GetColumnsNames.getColumnNames;

public class MakeTable {

    private static DefaultTableModel tableModel;
    private static ResultSet resultSet;


    public static void MakeTable(JTable createTable,String tableNameFromDB){

    tableModel.setColumnIdentifiers(getColumnNames(tableNameFromDB));





    }


}
