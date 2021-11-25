package com.his.resources;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="User")
public class User {
	
	
	private int userId;
	private String userName;
	private String emailId;

}
