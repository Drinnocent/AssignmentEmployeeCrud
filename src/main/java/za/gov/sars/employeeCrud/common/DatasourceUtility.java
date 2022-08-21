/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.gov.sars.employeeCrud.common;

import com.zaxxer.hikari.HikariDataSource;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author S2028389
 */
public class DatasourceUtility {
    
    public static DataSource getDatasource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setInitializationFailTimeout(0);
        dataSource.setMaximumPoolSize(10);
        dataSource.setDataSourceClassName("com.microsoft.sqlserver.jdbc.SQLServerDataSource");


        dataSource.addDataSourceProperty("url", "jdbc:sqlserver://LPTAXR60\\SQLE:2010;databaseName=EmployeeDB");
        dataSource.addDataSourceProperty("user", "doctor");
        dataSource.addDataSourceProperty("password", "@@@@Drkinnocent11");

        return dataSource;
    }

    public static DataSource getDatasourceLookup() {
        try {
            InitialContext initialContext = new InitialContext();
            //DataSource dataSource = (DataSource) initialContext.lookup("jdbc/amakhweziDS");
            DataSource dataSource = (DataSource) initialContext.lookup("java:/empDS");
            return dataSource;
        } catch (NamingException ex) {
            Logger.getLogger(DatasourceUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
