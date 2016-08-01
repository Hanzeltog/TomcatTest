package backend.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import backend.DatabaseConnector;
import backend.Item;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.ws.rs.core.Response;

@Path("addItem")
public class AddItem {
    
	@POST
	@Produces("application/x-www-form-urlencoded")
	public Response addItem(
			@QueryParam("sender") String sender, 
			@QueryParam("receiver") String receiver,
			@QueryParam("subject") String subject,
			@QueryParam("message") String message){
		
		DatabaseConnector db = new DatabaseConnector();
		Date date = new Date(116, 10, 10);
		Calendar c = Calendar.getInstance(Locale.UK);
		date = c.getTime();
		
		db.addItem(new Item(sender, receiver, subject, date, message));
		
		return Response.status(200)
				.entity("email was successfully added!")
				.build();
	}
}