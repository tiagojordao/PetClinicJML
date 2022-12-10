package petclinic;

public class Appointment {

    private int id;
    private String status;
    private String dia;
    private Pet pet;
    private Vet vet;
    
    public Appointment(int id, String status, String dia, Pet pet, Vet vet) {
    	this.id = id;
    	this.status = status;
    	this.dia = dia;
    	this.pet = pet;
    	this.vet = vet;
    }
	
    public int getId() {
    	return id;
    }
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public Vet getVet() {
		return vet;
	}
	public void setVet(Vet vet) {
		this.vet = vet;
	}
    
    
}
