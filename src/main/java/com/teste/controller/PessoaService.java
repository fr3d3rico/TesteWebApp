package com.teste.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class PessoaService {

	@GET
	@Path("/pessoa")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPessoas() {
		return "fred";
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPessoa(@PathParam("id") String id) {
		return id;
	}
}
