package model.tools.tables;

import server.querys.tools.GetColumnsNames;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSet;
import java.sql.SQLException;

import static model.tools.tables.GetInfoFromTable.getInfoFromTable;
import static server.querys.tools.GetColumnSize.*;
import static server.querys.tools.GetColumnsNames.getColumnNames;

public class MakeTable {

    private static DefaultTableModel tableModel;
//    private static ResultSet resultSet;


    public static DefaultTableModel makeTable(String tableNameFromDB) throws SQLException {

    tableModel = new DefaultTableModel(getInfoFromTable("alumnos"),getColumnNames("alumnos"));

    return tableModel;

    }


}
