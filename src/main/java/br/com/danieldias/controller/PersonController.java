package br.com.danieldias.controller;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.Viewable;
import javax.mvc.annotation.Controller;
import javax.mvc.annotation.View;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.bson.types.ObjectId;

import br.com.danieldias.model.Person;
import br.com.danieldias.persistence.MongoDAO;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@Controller
@Path("mvc")
public class PersonController {

	@Inject
	Models models;

	@Inject
	MongoDAO<Person> peopleDao;

	@GET
	@Path("new")
	public Viewable novo() {
		return new Viewable("insert.jsp");
	}

	@GET
	@Path("show")
	@View("list.jsp")
	public void list() {
	  this.models.put("list", peopleDao.listAll());
	}

	@POST
	@Path("add")
	public String adicionar(@BeanParam Person person) {
		peopleDao.insert(person);
		return "redirect:mvc/show";		
	}

	@POST
	@Path("update")
	public String update(@BeanParam Person person) {
		peopleDao.change(person);
		return "redirect:mvc/show";
	}

	@GET
	@Path("update/{_id}")
	public Viewable update(@PathParam("_id") ObjectId _id) {
		this.models.put("update",peopleDao.byId(_id));
		return new Viewable("change.jsp",models);
	}

	@GET
	@Path("remove/{_id}")
	public String delete(@PathParam("_id") ObjectId _id) {
	    peopleDao.delete(_id);
		return "redirect:mvc/show";
	}
}