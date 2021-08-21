package co.edu.utp.misiontic2022.c2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;

// import co.edu.utp.misiontic2022.c2.Requerimiento_3;
// import co.edu.utp.misiontic2022.c2.JDBCUtilities;

public class RequerimientoDao_3 {

    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
            // Su código

                    
        ArrayList<Requerimiento_3> Registries = new ArrayList<Requerimiento_3>();
        Connection ConnectTo = JDBCUtilities.getConnection();
        
        try {
            String MyQuery = "SELECT SUBSTR(l.Nombre,1,3) || SUBSTR(l.Primer_Apellido,1,3) || " +
                              "SUBSTR(l.Segundo_Apellido,1,3) AS 'Abrev' " +
                              "FROM Lider l";
            
            PreparedStatement statement = ConnectTo.prepareStatement(MyQuery);
            ResultSet resQuerySet = statement.executeQuery();
            
            while(resQuerySet.next()){
                Requerimiento_3 requerimiento_3 = new Requerimiento_3(resQuerySet.getString("Abrev"));
                Registries.add(requerimiento_3);
            }
            
            resQuerySet.close();
            statement.close();
            
        } catch(SQLException Bad){
            System.err.println("Error consulta Requerimiento_3 " + Bad);
        } finally {
            ConnectTo.close();
        }
                
        return Registries;
    }  
    
}

