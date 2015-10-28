package foo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Message {
	@Id
	@GeneratedValue
	private int id;
	@Basic
	private String message;

	public Message() {
	}

	public Message(String message) {
		this.message = message;
	}

	public String toString() {
		return "Greeting id=" + id + ", message=" + message;
	}
}
