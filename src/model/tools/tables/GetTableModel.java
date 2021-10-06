package model.tools.tables;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static server.querys.tools.GetColumnSize.getColumSize;
import static server.querys.tools.GetRowSize.getRowSize;

public class GetTableModel {

    private static PreparedStatement statement;
    private static ResultSet resultSet;
    private static int columnCount;
    private static int rowCount;
    private static DefaultTableModel tableModel;


    public static TableModel getTableModel(String tableNameFromDB){
//        TableModel tableModel = new AbstractTableModel() {
//            @Override
//            public int getRowCount() {
//
//                return getRowSize(tableNameFromDB);
//            }
//
//            @Override
//            public int getColumnCount() {
//
//                return getColumSize(tableNameFromDB);
//            }
//
//            @Override
//            public Object getValueAt(int rowIndex, int columnIndex) {
//
//                return rowIndex*columnIndex;
//            }
//
//        };


        return tableModel;

    }

}
