package com.org.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Data
@Entity
public class User {
	@Id
	private int id;
	
	private String name;
	
	private int age;
	
	private long mobile;
	
	private String email;
	
	private String password;
	
	@OneToMany(mappedBy = "user",cascade =CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Notes> notesList;

}
