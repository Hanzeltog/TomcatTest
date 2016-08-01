package backend.rest;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import backend.DatabaseConnector;
import backend.Item;

import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;

@Path("list")
public class List {
    
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Item> getItems() {
		DatabaseConnector db = new DatabaseConnector();
		System.out.println("De db connector: " + db);
		ArrayList<Item> list = db.getItems();
		System.out.println("dit is het: "+list);
		return list;
	}
}