package data;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserDAO {

	private static final String INSERT_USERS_SQL = "INSERT INTO user (nome, email, citta) VALUES (? , ? , ?) ";

	private static final String SELECT_USER_BY_ID = "select id,nome,email,citta from jdbcweb.user where id =?";
	private static final String SELECT_ALL_USERS = "select id,nome,email,citta from user ";
	private static final String DELETE_USERS_SQL = "delete from jdbcweb.user where id = ?;";
	private static final String UPDATE_USERS_SQL = "update jdbcweb.user set nome = ?,email= ?, citta =? where id = ?;";

	public void insertUser(User user) throws SQLException {
		
		// try-with-resource statement will auto close the connection.
		try {
			
			ConnessioneDB.connect();
			Connection connection = ConnessioneDB.getCon();
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
			preparedStatement.setString(1, user.getNome());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getCitta());
			preparedStatement.executeUpdate();
	
		} catch (SQLException e) {
			
			System.out.println("Errore di connessione");
		
		}

	}

	public User selectUser(int id) {
		User user = null;
		// Step 1: Establishing a Connection
		try {
			ConnessioneDB.connect();
			Connection connection = ConnessioneDB.getCon();
			// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String name = rs.getString("nome");
				String email = rs.getString("email");
				String country = rs.getString("citta");
				user = new User(id, name, email, country);
			}
		} catch (SQLException e) {

		}
		return user;
	}

	public static List < User > selectAllUsers() {

            // using try-with-resources to avoid closing resources (boiler plate code)
            List < User > users = new ArrayList < > ();
            // Step 1: Establishing a Connection
            try {
            	ConnessioneDB.connect();
                Connection connection = ConnessioneDB.getCon();
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
                System.out.println(preparedStatement);
                // Step 3: Execute the query or update query
                ResultSet rs = preparedStatement.executeQuery();
             // Step 4: Process the ResultSet object.
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("nome");
                    String email = rs.getString("email");
                    String country = rs.getString("citta");
                    User utenti = new User(id,name, email, country);
                    users.add(utenti);
                }
            } catch (SQLException e) {
               e.printStackTrace();
            }
            return users;

            }
	
	public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated = true;
        try {
        	ConnessioneDB.connect();
        	Connection connection = ConnessioneDB.getCon();
        	PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);
            statement.setString(1, user.getNome());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getCitta());
            statement.setInt(4, user.getId());

            rowUpdated = statement.executeUpdate() > 0;
        }catch (SQLException e) {
           
        }
        return rowUpdated;
    }

	
	public boolean deleteUser(int id) throws SQLException {
        boolean rowDeleted = true;
        try {
        	ConnessioneDB.connect();
        	Connection connection = ConnessioneDB.getCon();
        	PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }catch (SQLException e) {
           
        }
        return rowDeleted;
    }

	
	
	
	
	
}
