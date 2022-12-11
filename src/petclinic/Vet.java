package petclinic;

public class Vet {
	
	    private /*@ spec_public @*/ int id;
	    private /*@ spec_public @*/ String name;
	    private /*@ spec_public @*/ String email;
	    private /*@ spec_public @*/ String registro;
	    
	    /*@
	    @		requires n_id >= 0;
	    @		requires n_name != "";
	    @		requires n_email != "";
	    @		requires n_registro != "";
	    @		ensures id == n_id;
	    @		ensures name == n_name;
	    @		ensures email == n_email;
	    @		ensures registro == n_registro;
	    @*/
	    public Vet(int n_id, String n_name, String n_email, String n_registro) {
	    	this.id = n_id;
	    	this.name = n_name;
	    	this.email = n_email;
	    	this.registro = n_registro;
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
		public /*@ pure @*/ String getEmail() {
			return email;
		}
		/*@ also
		@	assignable email;
		@	ensures email == n_email;
		@*/
		public void setEmail(String n_email) {
			this.email = n_email;
		}
		public /*@ pure @*/ String getRegistro() {
			return registro;
		}
	    
	    
}
