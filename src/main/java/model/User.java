package model;

import java.util.Date;

public class User {
 
	public User(int user_id, String username, String password, String fullname, String address, String phone,
			String email, Date birthday) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.birthday = birthday;
	}
	
    private int user_id;
    private String username;
    private String password;
    private String fullname;
    private String address;
    private String phone;
    private String email;
    private Date birthday;
    
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
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
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	


}
