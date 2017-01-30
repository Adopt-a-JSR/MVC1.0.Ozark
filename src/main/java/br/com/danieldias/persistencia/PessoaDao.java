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
public class PessoaDao implements MongoDAO<People> {

	MongoClient conexao;
	MongoCollection<Document> collectionPessoas;

	public PessoaDao() {
		conexao = MongoDBFactory.createConnection();
		collectionPessoas = 
				conexao.getDatabase(Constants.BANK_NAME)
				.getCollection(Constants.COLLECTION_NAME);
	}

	@Override
	public void inserir(People entidade) throws MongoException {

		List<Document> jugs = new ArrayList<>();
		jugs.add(new Document(Constants.NAME,entidade.getJugs())
				.append(Constants.DESCRIPTION, entidade.getdescription()));
		
		collectionPessoas.insertOne(new Document(Constants.NAME,entidade.getName())
				 .append(Constants.ADDRESS, 
							new Document(Constants.STATE,entidade.getAddress().getState())
							)
				 .append(Constants.AGE,entidade.getAge())
				 .append(Constants.JUGS, jugs)
				 );
	}

	@Override
	public void alterar(People entidade) throws MongoException {
		 
		collectionPessoas.updateOne(porId(entidade.get_id()),
				new Document("$set",
						new Document(Constants.AGE,entidade.getAge())
						.append(Constants.NAME, entidade.getName())
						.append(Constants.ADDRESS, 
								new Document(Constants.STATE,entidade.getAddress().getState()))
						)
				);
	}

	@Override
	public void deletar(ObjectId _id) throws MongoQueryException {
		collectionPessoas.findOneAndDelete(porId(_id));
	}

	@Override
	public MongoCursor<Document> listarTodos() throws MongoCursorNotFoundException, MongoQueryException {
		return collectionPessoas.find().iterator();
	}

	@Override
	public Document porId(ObjectId _id) throws MongoQueryException {
		return collectionPessoas.find(eq(Constants.ID,_id)).first();
	}
}