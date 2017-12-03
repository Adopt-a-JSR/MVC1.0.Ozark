package br.com.danieldias.persistence;

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

	void insert(T entity) throws MongoException;
	void change(T entity) throws MongoException;
	void delete(ObjectId _id) throws MongoQueryException;
	MongoCursor<Document> listAll() throws MongoCursorNotFoundException,MongoQueryException;
	Document byId(ObjectId _id) throws MongoQueryException;
}