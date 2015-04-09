package model;

import java.util.List;

public class Player {
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String description;
	private Address address;
	private Sponsor sponsor;
	private List<Player> opponents;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Sponsor getSponsor() {
		return sponsor;
	}
	public void setSponsor(Sponsor sponsor) {
		this.sponsor = sponsor;
	}
	public List<Player> getOpponents() {
		return opponents;
	}
	public void setOpponents(List<Player> opponents) {
		this.opponents = opponents;
	}
	
	
}
