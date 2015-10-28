package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ACL {

	@Id
	@GeneratedValue
	private long id;

	private String name;

	private String premission;

	public ACL() {

	}

	public ACL(String name, String premission) {
		super();
		this.name = name;
		this.premission = premission;
	}

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

	public String getPremission() {
		return premission;
	}

	public void setPremission(String premission) {
		this.premission = premission;
	}

}
