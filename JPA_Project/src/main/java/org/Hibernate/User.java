package org.Hibernate;

import javax.persistence.*;
import javax.persistence.Table;
@Entity
@Table(name="User_Info")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(nullable=false)
private String name;
@Column (nullable=false,unique=true)
private long pohne;
@Column(nullable=false,unique=true)
private String email;
@Column (nullable=false)
private String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPohne() {
	return pohne;
}
public void setPohne(long pohne) {
	this.pohne = pohne;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", pohne=" + pohne + ", email=" + email + ", password=" + password
			+ "]";
}

}
