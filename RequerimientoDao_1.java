package co.edu.utp.misiontic2022.c2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;

// import co.edu.utp.misiontic2022.c2.Requerimiento_1;
// import co.edu.utp.misiontic2022.c2.JDBCUtilities;

public class RequerimientoDao_1 {

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código
        
        
        ArrayList<Requerimiento_1> Registries = new ArrayList<Requerimiento_1>();    // Array de Requerimiento_1

        Connection ConnectTo = JDBCUtilities.getConnection();

        try {
            String MyQuery = "SELECT Buy.Fecha, Buy.ID_Compra, Buy.Proveedor, Buy.Pagado "
                        +    "FROM Compra Buy ORDER BY Buy.ID_Compra DESC LIMIT 20";

            PreparedStatement Statement = ConnectTo.prepareStatement(MyQuery);
            ResultSet resQuerySet = Statement.executeQuery();

            
            while(resQuerySet.next()){
                Requerimiento_1 requerimiento_1 = new Requerimiento_1();
                requerimiento_1.setBuyDate(resQuerySet.getString("Fecha"));
                requerimiento_1.setBuyCode(resQuerySet.getInt("ID_Compra"));
                requerimiento_1.setSupplierName(resQuerySet.getString("Proveedor"));
                requerimiento_1.setPaid(resQuerySet.getString("Pagado"));

                Registries.add(requerimiento_1);
            }

            resQuerySet.close();
            Statement.close();
        } catch (SQLException Bad){
            System.err.println("Error conexion  para Requerimiento_1 " + Bad);
        } finally{
            if(ConnectTo != null){
                ConnectTo.close();
            }
        }

        return Registries;
    }
    
        
      
    
}
