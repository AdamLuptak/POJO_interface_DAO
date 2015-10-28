package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String loginName;
	@Column(nullable = false)
	private String password;
	@Column(columnDefinition = "tinyint(1) default 1")
	private boolean active;
	@Column(columnDefinition = "tinyint(1) default 1")
	private boolean locked;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private int phone;

	public User() {
	}

	public User(String title, String firstName, String lastName, String loginName, String password, boolean active,
			boolean locked, String email, int phone) {
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.loginName = loginName;
		this.password = password;
		this.active = active;
		this.locked = locked;
		this.email = email;
		this.phone = phone;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	private Organization organization;

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganizations(Organization organization) {
		this.organization = organization;
	}

	@ManyToMany(mappedBy = "members")
	private List<Group> groups = new ArrayList<Group>(); 

	public List<Group> getGroups() {
		return this.groups;
	}

	public void setGroup(Group group) {
		groups.add(group);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", title=" + title + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", loginName=" + loginName + ", password=" + password + ", active=" + active + ", locked=" + locked
				+ ", email=" + email + ", phone=" + phone + "]";
	}

}
