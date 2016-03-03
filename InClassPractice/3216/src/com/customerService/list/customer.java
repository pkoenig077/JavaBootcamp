package com.customerService.list;

import java.io.Serializable;


import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;
@XmlRootElement(name = "customer")
public class customer implements Serializable{

	private static final long serialVersionUID = 1L;
	private String Name;
	private String ID;

	public String getName() {
		return Name;
	}
	 @XmlElement
	public void setName(String name) {
		Name = name;
	}

	public String getID() {
		return ID;
	}
	 @XmlElement
	public void setID(String iD) {
		ID = iD;
	}
}
