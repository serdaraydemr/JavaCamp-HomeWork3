package entity;

import java.util.Date;

public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private Date birthday;
	private String natioanlId;
	private String email;
	
	public Gamer() {
		
	}
	
	public Gamer (int id, String firstName, String lastName, Date birthday, String natioanlId, String email) {
		
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.natioanlId = natioanlId;
		this.email = email;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNatioanlId() {
		return natioanlId;
	}

	public void setNatioanlId(String natioanlId) {
		this.natioanlId = natioanlId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
