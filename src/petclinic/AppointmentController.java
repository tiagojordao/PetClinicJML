package petclinic;

import java.util.ArrayList;
import java.util.List;

public class AppointmentController {
	private /*@ spec_public @*/ List<Appointment> appointments = new ArrayList<>();
	//@ public initially appointments.length() == 0;
	
	public AppointmentController() {
		
	}
	
	//@ requires app != null;
	public void addAppointment(Appointment app) {
		appointments.add(app);
	}
	
	//@ ensures \result != null;
	public List<Appointment> getAllAppointments() {
		return appointments;
	}
	
	//@ requires id >= 0;
	public void cancelAppointment(int id) {
		for(Appointment app : appointments) {
			if(app.getId() == id) {
				app.setStatus("cancelado");
			}
		}
	}
}
