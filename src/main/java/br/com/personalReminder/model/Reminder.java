package br.com.personalReminder.model;

import java.util.Date;

public class Reminder {

	private int id;
	private String name;
	private Date date;
	private String local;
	
	public Reminder() {	
	}

	public Reminder(int id, String name, Date date, String local) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.local = local;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getId() {
		return id;
	}
	
}
