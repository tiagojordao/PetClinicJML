package petclinic;

public class Vet {
	
	    private int id;
	    private String name;
	    private String email;
	    private String registro;
	    
	
	    public Vet(int id, String name, String email, String registro) {
	    	this.id = id;
	    	this.name = name;
	    	this.email = email;
	    	this.registro = registro;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getRegistro() {
			return registro;
		}
	    
	    
}
