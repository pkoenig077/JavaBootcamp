package com.customerService.list;

import java.io.Serializable;

public class customer implements Serializable{

	private static final long serialVersionUID = 1L;
	private String Name;
	private String ID;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
}
