package br.com.danieldias.persistencia;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoCursorNotFoundException;
import com.mongodb.MongoException;
import com.mongodb.MongoQueryException;
import com.mongodb.client.MongoCursor;

/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public interface MongoDAO<T> {

	void inserir(T entidade) throws MongoException;
	void alterar(T entidade) throws MongoException;
	void deletar(ObjectId _id) throws MongoQueryException;
	MongoCursor<Document> listarTodos() throws MongoCursorNotFoundException,MongoQueryException;
	Document porId(ObjectId _id) throws MongoQueryException;
}