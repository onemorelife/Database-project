package database;

import java.util.*;
import java.sql.*;

/**
 *
 * @author Badruddoza Khan
 */
public class PublisherDB 
{
    private Connection getConnection()
    {
        Connection connection = null;
        try
        {
            // set the home directory for Derby
            String dbDirectory = "/Database/src/database"; //NOTE:Will probably need adjusting                                                                    
            System.setProperty("derby.system.home", dbDirectory);

            // set the db url, username, and password
            String url = "jdbc:derby:PublisherDB";
            String username = "";
            String password = "";

            connection = DriverManager.getConnection(url, username, password);
			return connection;
        }
        catch(SQLException e)
        {
            System.err.println(e);
			return null;
        }
    }
    //TODO: methods for getting, adding, deleting 
    
}
