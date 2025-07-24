package com.example.template.postgresDAO;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.template.dao.DAOexample;
import com.example.template.database.ConnessioneDatabase;

public class PostgresDAO implements DAOexample {

    private Connection connection;

    public PostgresDAO() {
		try {
			connection = ConnessioneDatabase.getInstance().connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void exampleQuery() {
		
	}

}
