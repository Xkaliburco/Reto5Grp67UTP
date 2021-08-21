package co.edu.utp.misiontic2022.c2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;

// import co.edu.utp.misiontic2022.c2.Requerimiento_2;
// import co.edu.utp.misiontic2022.c2.JDBCUtilities;

public class RequerimientoDao_2 {

    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        
    
        ArrayList<Requerimiento_2> Registries = new ArrayList<Requerimiento_2>();

        // Conexion a la base de datos sqlite
        Connection ConnectTo = JDBCUtilities.getConnection();

        try {
            String MyQuery = "SELECT Proy.Fecha_Inicio as \'Fec Inic\', Proy.Ciudad, "
                        +   "Proy.Constructora, "
                        +   "lead.Nombre || ' ' || lead.Segundo_Apellido AS 'nombreLider', " +
                            "Tp.Codigo_Tipo, Tp.Estrato " +
                            "FROM Proyecto Proy INNER JOIN Lider lead ON Proy.ID_Lider = lead.ID_Lider " +
                            "INNER JOIN Tipo Tp ON Proy.ID_Tipo = Tp.ID_Tipo " + 
                            "WHERE Proy.Fecha_Inicio >= '2021-01-01' " +
                            "AND Proy.Fecha_Inicio <= '2021-05-30' " +
                            "AND Proy.Ciudad = 'Armenia' ";
                            

            PreparedStatement Statement = ConnectTo.prepareStatement(MyQuery);
            // Almacenados los datos de la MyQuery.
            ResultSet resQuerySet = Statement.executeQuery();

            while (resQuerySet.next()) {
                Requerimiento_2 requerimiento_2 = new Requerimiento_2(
                    resQuerySet.getString("Fec Inic"),
                    resQuerySet.getString("Ciudad"),
                    resQuerySet.getString("Constructora"),
                    resQuerySet.getString("nombreLider"),
                    resQuerySet.getInt("Codigo_Tipo"),
                    resQuerySet.getInt("Estrato")
                );

                Registries.add(requerimiento_2);

            }
        
            resQuerySet.close();
            Statement.close();

        } catch (SQLException e) {
            System.err.println("Error en la MyQuery SQL Requerimiento_2 ->" + e);
        } finally {
            ConnectTo.close();
        }

        return Registries;
    }


/* public ArrayList<Requerimiento_2> requerimiento2(String fIni, String fFin, String ciu) throws SQLException{

    ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();

    // Conexion a la base de datos sqlite
    Connection ConnectTo = JDBCUtilities.getConnection();

    try {
        String MyQuery = "SELECT p.Fecha_Inicio, p.Ciudad, p.Constructora, " +
                          "l.Nombre || ' ' || l.Segundo_Apellido AS 'nombreLider', " +
                          "t.Codigo_Tipo, t.Estrato " +
                          "FROM Proyecto p INNER JOIN Lider l ON p.ID_Lider = l.ID_Lider " +
                          "INNER JOIN Tipo t ON p.ID_Tipo = t.ID_Tipo " + 
                          "WHERE p.Fecha_Inicio >= '" + fIni + "' " +
                          "AND p.Fecha_Inicio <= '" + fFin + "' " +
                          "AND p.Ciudad = '" + ciu + "' ";
                        

        PreparedStatement statement = ConnectTo.prepareStatement(MyQuery);
        // Almacenados los datos de la MyQuery.
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            Requerimiento_2 requerimiento_2 = new Requerimiento_2(
                    resultSet.getString("Fecha_Inicio"),
                    resultSet.getString("Ciudad"),
                    resultSet.getString("Constructora"),
                    resultSet.getString("nombreLider"),
                    resultSet.getInt("Codigo_Tipo"),
                    resultSet.getInt("Estrato")
            );

            respuesta.add(requerimiento_2);

        }
        
        resultSet.close();
        statement.close();

    } catch (SQLException e) {
        System.err.println("Error en la MyQuery SQL Requerimiento_2 ->" + e);
    } finally {
        ConnectTo.close();
    }

    return respuesta;

    } */
}

