package br.com.danieldias.controller;

import br.com.danieldias.model.Person;
import br.com.danieldias.persistence.PersonRepository;
import org.jnosql.artemis.Database;
import org.jnosql.artemis.DatabaseType;

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
    private Models models;

    @Inject
    @Database(DatabaseType.DOCUMENT)
    private PersonRepository repository;

    @GET
    @Path("new")
    public Viewable novo() {
        return new Viewable("insert.jsp");
    }

    @GET
    @Path("show")
    @View("list.jsp")
    public void list() {
        this.models.put("list", repository.findAll());
    }

    @POST
    @Path("add")
    public String adicionar(@BeanParam Person person) {
        repository.save(person);
        return "redirect:mvc/show";
    }

    @POST
    @Path("update")
    public String update(@BeanParam Person person) {
        repository.save(person);
        return "redirect:mvc/show";
    }

    @GET
    @Path("update/{_id}")
    public Viewable update(@PathParam("_id") String id) {
        this.models.put("update", repository.findById(id));
        return new Viewable("change.jsp", models);
    }

    @GET
    @Path("remove/{_id}")
    public String delete(@PathParam("_id") String id) {
        repository.deleteById(id);
        return "redirect:mvc/show";
    }
}