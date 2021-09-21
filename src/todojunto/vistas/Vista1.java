package todojunto.vistas;

import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Vista1 {


    //con esta clase los que haces es que creamos el esqueleto de la tabla que queremos crear
    //es decir si la tabla que nos devuelve el rs tiene 3 columnas y 4 filas cuando llamemos al contructor de esta clase establecera la estructura de la misma
    class VistaTabla extends AbstractTableModel {
        ResultSet _rs;
        ResultSetMetaData md; //contiene información sobre la estructura de un ResulSet,especialmente sobre sus nom campos
        int _numColumnas;
        int _numFilas;

        public VistaTabla(ResultSet rs){
            this._rs=rs;
            try{
                md=rs.getMetaData();
                _rs.last();
                _numFilas=_rs.getRow();
                _numColumnas=md.getColumnCount();

            }
            catch( SQLException ex){
            }
        }
        @Override
        public int getRowCount() {
            return _numFilas;

        }

        @Override
        public int getColumnCount() {
            return _numColumnas;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            try {
                _rs.absolute(rowIndex+1);
                Object o=_rs.getObject(columnIndex +1);
                return o;
            }
            catch (SQLException ex){
                return ex.toString();
            }

        }


    }
}
