package br.com.danieldias.persistencia;

import static com.mongodb.client.model.Filters.eq;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoClient;
import com.mongodb.MongoCursorNotFoundException;
import com.mongodb.MongoException;
import com.mongodb.MongoQueryException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import br.com.danieldias.commons.Constants;
import br.com.danieldias.model.People;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class PeopleDao implements MongoDAO<People> {

	MongoClient connection;
	MongoCollection<Document> collectionPeople;

	public PeopleDao() {
		connection = MongoDBFactory.createConnection();
		collectionPeople = 
				connection.getDatabase(Constants.BANK_NAME)
				.getCollection(Constants.COLLECTION_NAME);
	}

	@Override
	public void insert(People entity) throws MongoException {

		List<Document> jugs = new ArrayList<>();
		jugs.add(new Document(Constants.NAME,entity.getJugs())
				.append(Constants.DESCRIPTION, entity.getdescription()));
		
		collectionPeople.insertOne(new Document(Constants.NAME,entity.getName())
				 .append(Constants.ADDRESS, 
							new Document(Constants.STATE,entity.getAddress().getState())
							.append(Constants.COUNTRY, entity.getAddress().getCountry())
							)
				 .append(Constants.AGE,entity.getAge())
				 .append(Constants.JUGS, jugs)
				 );
	}

	@Override
	public void change(People entity) throws MongoException {
		 
		collectionPeople.updateOne(byId(entity.get_id()),
				new Document("$set",
						new Document(Constants.AGE,entity.getAge())
						.append(Constants.NAME, entity.getName())
						.append(Constants.ADDRESS, 
								new Document(Constants.STATE,entity.getAddress().getState())
								.append(Constants.COUNTRY, entity.getAddress().getCountry())
								)
						)
				);
	}

	@Override
	public void delete(ObjectId _id) throws MongoQueryException {
		collectionPeople.findOneAndDelete(byId(_id));
	}

	@Override
	public MongoCursor<Document> listAll() throws MongoCursorNotFoundException, MongoQueryException {
		return collectionPeople.find().iterator();
	}

	@Override
	public Document byId(ObjectId _id) throws MongoQueryException {
		return collectionPeople.find(eq(Constants.ID,_id)).first();
	}
}