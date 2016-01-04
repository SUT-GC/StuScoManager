package entity;

import javax.persistence.*;

@Entity
@Table(name="MANAGER")
public class Admin {
	@Id
	@Column(name="M_ID")
	private String id;
	@Column(name="M_NAME")
	private String name;
	@Column(name="M_PASSWORD")
	private String password;

	public Admin() {
	}

	public Admin(String id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password
				+ "]";
	}

}
