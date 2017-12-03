package br.com.danieldias.persistence;

import com.mongodb.MongoClient;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class MongoDBFactory {

	public static MongoClient createConnection() {
		MongoClient connection = null;
		if(connection == null) {
		    connection = new MongoClient();
		}
		return connection;
	}
}