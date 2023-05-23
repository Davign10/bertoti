package org.park;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.google.gson.Gson;



@Path("/celular")
public class Controller {

	
	Model model = new Model();
	
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{marca}/{modelo}/{cor}/")
    public Response celular2(@PathParam String marca, @PathParam String modelo, @PathParam String cor) {	
		List<Celular> celularesEncontrados = model.buscarEspecificacao(new Especificacao(marca, modelo, cor));	
		String json = new Gson().toJson(celularesEncontrados);
    	return Response.status(200).entity(json).build();	
    }
	
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasymmmmmmm";
    }
}