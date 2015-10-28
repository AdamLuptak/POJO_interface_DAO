package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Group {
	@Id
	@GeneratedValue
	private long id;

	private String name;

	private String Description;

	public Group() {

	}

	public Group(String name, String description) {
		this.name = name;
		Description = description;
	}

	@OneToMany
	private List<Group> groups = new ArrayList<Group>();

	@ManyToMany(fetch = FetchType.LAZY)
	private List<User> members = new ArrayList<User>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public List<User> getMembers() {
		return members;
	}

	public void setMembers(List<User> members) {
		this.members = members;
	}

	public void setMemeber(User member) {
		members.add(member);
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", Description=" + Description + ", members=" + members + "]";
	}

}
