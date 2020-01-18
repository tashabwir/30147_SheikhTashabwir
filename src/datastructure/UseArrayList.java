package datastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static databases.ConnectToSqlDB.connect;
import static databases.ConnectToSqlDB.statement;

public class UseArrayList {

	public static void main(String[] args) throws SQLException {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 */

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(45);
		arr.add(78);
		arr.add(96);
		arr.add(31);
		arr.add(65);
		System.out.println(arr.get(2));
		for(int i : arr) {
				System.out.println(i);
		}
		while (!arr.isEmpty()){
			System.out.println(arr);
			arr.remove(0);
		}


		String url = "jdbc:mysql://localhost/midterm?serverTimezone=UTC";
		String user = "root";
		String pass = "niloy007";

		Connection connect = null;
		Statement statement = null;
		//connect = null;
		try {
			connect = DriverManager.getConnection(url,user,pass);
			statement = connect.createStatement();

			String query = "insert into t1 (id,name) values (3,'larry');";
			statement.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			statement.close();
			connect.close();

		}

	}

}
