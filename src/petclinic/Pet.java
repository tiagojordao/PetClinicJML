package petclinic;

public class Pet {
	
	private int id;
	private String name;
	private String birthday;
	private String owner;
	
	public Pet(int id, String name, String birthday, String owner) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.owner = owner;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
