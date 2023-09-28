/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * Esta clase representa la implementación de la interface Model para obtener un saludo desde una base de datos.
 * Utiliza una conexión a una base de datos.
 * 
 * @author Eneko Vazquez
 */
public class ImplementationDB implements Model {

    private Connection con = null;
    private PreparedStatement stmt;
    private ResultSet rs;

    private final String GET_GREETING = "SELECT * from greeting";

    /**
     * Abre una conexión a la base de datos utilizando la información de conexión especificada en el archivo "ConexionBD".
     */
    
    private void openConnection() {

        try {
            final String URL = ResourceBundle.getBundle("model.ConexionBD").getString("URL");
            final String USER = ResourceBundle.getBundle("model.ConexionBD").getString("USER");
            final String PASSWORD = ResourceBundle.getBundle("model.ConexionBD").getString("PASSWORD");

            con = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Cierra la conexión a la base de datos y libera los recursos asociados.
     */
    private void closeConnection() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }

        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Obtiene un saludo desde la base de datos y lo devuelve como un String.
     *
     * @return El saludo obtenido desde la base de datos.
     */
    @Override
    public String getGreeting() {
        this.openConnection();
        String greeting = null;

        try {
            stmt = (PreparedStatement) con.prepareStatement(GET_GREETING);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                greeting = rs.getString("greeting");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.closeConnection();
        return greeting;
    }
}
