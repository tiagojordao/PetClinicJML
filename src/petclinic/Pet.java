package petclinic;

public class Pet {
	private /*@ spec_public @*/ int id;
	private /*@ spec_public @*/ String name;
	private /*@ spec_public @*/ String birthday;
	private /*@ spec_public @*/ String owner;
	
	/*@
    @		requires n_id >= 0;
    @		requires n_name != "";
    @		requires n_birthday != "";
    @		requires n_owner != "";
    @		ensures id == n_id;
    @		ensures name == n_name;
    @		ensures birthday == n_birthday;
    @		ensures owner == n_owner;
    @*/
	public Pet(int n_id, String n_name, String n_birthday, String n_owner) {
		this.id = n_id;
		this.name = n_name;
		this.birthday = n_birthday;
		this.owner = n_owner;
	}
	public /*@ pure @*/ int getId() {
		return id;
	}
	public /*@ pure @*/ String getName() {
		return name;
	}
	/*@ also
	@	assignable name;
	@	ensures name == n_name;
	@*/
	public void setName(String n_name) {
		this.name = n_name;
	}
	public /*@ pure @*/ String getBirthday() {
		return birthday;
	}
	/*@ also
	@	assignable birthday;
	@	ensures birthday == n_birthday;
	@*/
	public void setBirthday(String n_birthday) {
		this.birthday = n_birthday;
	}
	public /*@ pure @*/ String getOwner() {
		return owner;
	}
	/*@ also
	@	assignable owner;
	@	ensures owner == n_owner;
	@*/
	public void setOwner(String n_owner) {
		this.owner = n_owner;
	}
	
	
}
