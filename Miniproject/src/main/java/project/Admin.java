package project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//created by kuberan 02/03/2022
@JsonIgnoreProperties(ignoreUnknown = true)
public class Admin{
	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}