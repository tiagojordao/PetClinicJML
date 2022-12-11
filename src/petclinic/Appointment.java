package petclinic;

public class Appointment {

    private /*@ spec_public @*/ int id;
    private /*@ spec_public @*/ String status;
    private /*@ spec_public @*/ String dia;
    private /*@ spec_public @*/ Pet pet;
    private /*@ spec_public @*/ Vet vet;
    
    /*@
    @		requires n_id >= 0;
    @		requires n_status == "agendado";
    @		requires n_dia != "";
    @		ensures id == n_id;
    @		ensures status == n_status;
    @		ensures dia == n_dia;
    @*/
    public Appointment(int n_id, String n_status, String n_dia, Pet n_pet, Vet n_vet) {
    	this.id = n_id;
    	this.status = n_status;
    	this.dia = n_dia;
    	this.pet = n_pet;
    	this.vet = n_vet;
    }
	
    public /*@ pure @*/ int getId() {
    	return id;
    }
	public /*@ pure @*/ String getStatus() {
		return status;
	}
	/*@ also
	@	assignable status;
	@	ensures status == n_status;
	@*/
	public void setStatus(String n_status) {
		this.status = n_status;
	}
	public /*@ pure @*/ String getDia() {
		return dia;
	}
	/*@ also
	@	assignable dia;
	@	ensures dia == n_dia;
	@*/
	public void setDia(String n_dia) {
		this.dia = n_dia;
	}
	public /*@ pure @*/ Pet getPet() {
		return pet;
	}
	/*@ also
	@	assignable pet;
	@	ensures pet == n_pet;
	@*/
	public void setPet(Pet n_pet) {
		this.pet = n_pet;
	}
	public /*@ pure @*/ Vet getVet() {
		return vet;
	}
	/*@ also
	@	assignable vet;
	@	ensures vet == n_vet;
	@*/
	public void setVet(Vet n_vet) {
		this.vet = n_vet;
	}
    
    
}
