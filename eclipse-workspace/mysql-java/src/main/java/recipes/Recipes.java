package recipes;

import java.sql.Connection;
import recipes.dao.DbConnection;

/**
 * @author emmak
 *
 */	
public class Recipes {

/**
 * @param args
 */	

	public static void main(String[] args) {
		DbConnection.getConnection();
	}

}
