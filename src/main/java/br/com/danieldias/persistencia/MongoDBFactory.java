package br.com.danieldias.persistencia;

import com.mongodb.MongoClient;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class MongoDBFactory {

	public static MongoClient createConnection() {
		MongoClient conexao = null;
		if(conexao == null) {
			conexao = new MongoClient();
		}
		return conexao;
	}
}