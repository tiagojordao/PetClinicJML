package petclinic;

import java.util.ArrayList;
import java.util.List;

public class AppointmentController {
	private List<Appointment> appointments;
	
	public AppointmentController() {
		appointments = new ArrayList<>();
	}
	
	public void addAppointment(Appointment app) {
		appointments.add(app);
	}
	
	public List<Appointment> getAllAppointments() {
		return appointments;
	}
	
	public void cancelAppointment(int id) {
		for(Appointment app : appointments) {
			if(app.getId() == id) {
				app.setStatus("cancelado");
			}
		}
	}
}
