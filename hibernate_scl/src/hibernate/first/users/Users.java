package hibernate.first.users;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Users {
	private Long id;
	private String name;
	private String pass;
	

	public Users(Long id, String name, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
	}

	public Users() {
		super();
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", pass=" + pass + "]";
	}
	
	

}
