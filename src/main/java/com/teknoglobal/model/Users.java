package com.teknoglobal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	private long id;
	private String firstName;
	private String lastName;
    private String email;
	private String password;
	private String role;
	private String alamat;
	private String telp;
	private String jeniskelamin;
	
	public Users() {
		
	}
	
	public Users(String firstName, String lastName, String email, String password, String alamat, String telp, String jeniskelamin, String role) {
		this.firstName = firstName;
		this.lastName = lastName;
        this.email = email;
		this.password = password;
		this.alamat = alamat;
		this.telp = telp;
		this.jeniskelamin = jeniskelamin;
		this.role=role;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
    }

    @Column(name = "password", nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "alamat", nullable = false)
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	@Column(name = "telp", nullable = false)
	public String getTelp() {
		return telp;
	}
	public void setTelp(String telp) {
		this.telp = telp;
	}
	
	@Column(name = "jeniskelamin", nullable = false)
	public String getJeniskelamin() {
		return jeniskelamin;
	}
	public void setjeniskelamin(String jeniskelamin) {
		this.jeniskelamin = jeniskelamin;
	}
	@Column(name = "role", nullable = false)
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
	return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", alamat=" + alamat + ", telp=" + telp + ", jeniskelamin=" + jeniskelamin + ",role="+role+"]";
	}
	
}
