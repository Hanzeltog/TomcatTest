package backend;

import java.util.Date;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.FIELD)

public class Item {
	private int id;
	private String sender;
	private String receiver;
	private String subject;
	private Date date;
	private String message;
	
	public Item(){
		
	}
	
	public Item(String sender, String receiver, String subject, Date date, String message){
		this.sender = sender;
		this.receiver = receiver;
		this.subject = subject;
		this.date = date;
		this.message = message;
	}
	
	public Item(int id, String sender, String receiver, String subject, Date date, String message){
		this.id = id;
		this.sender = sender;
		this.receiver = receiver;
		this.subject = subject;
		this.date = date;
		this.message = message;
	}
		
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}

	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return getId() + ", " + getSender() + ", " + getReceiver() + ", " + getDate() + ", " + getSubject() + "; ";
	}

	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}

	
	
}
