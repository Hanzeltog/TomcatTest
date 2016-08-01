package backend.rest;

import javax.ws.rs.Path;

import backend.DatabaseConnector;
import backend.Item;

import java.util.ArrayList;

import javax.ws.rs.GET;

@Path("add")
public class Add {
    
	@GET
	public String getString() {
		DatabaseConnector db = new DatabaseConnector();
		System.out.println("De db connector: " + db);
		ArrayList<Item> list = db.getItems();
		System.out.println("dit is het: "+list);
		return list.toString();
	}
}

