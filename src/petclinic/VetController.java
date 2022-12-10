package petclinic;

import java.util.ArrayList;
import java.util.List;

public class VetController {
	private List<Vet> vets;
	
	public VetController() {
		this.vets = new ArrayList<>();
	}
	
	public List<Vet> getAllVets() {
		return vets;
	}
	

	public void addVet(int id, String name, String email, String registro) {
		Vet v = new Vet(id, name, email, registro);
		vets.add(v);
	}
	
	public Vet getVetByName(String name) {
		for(Vet v : vets) {
			if(v.getName().equalsIgnoreCase(name)) {
				return v;
			}
		}
		return null;
	}
	
	public void deleteVetByName(String name) {
		for(Vet v : vets) {
			if(v.getName().equalsIgnoreCase(name)) {
				vets.remove(v);
			}
		}
	}
}
