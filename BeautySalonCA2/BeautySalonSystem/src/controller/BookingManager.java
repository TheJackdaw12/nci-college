package controller;

import model.Appointment;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Appointment> appointments = new ArrayList<>();

    public void addAppointment(Appointment a) {
        appointments.add(a);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public boolean hasConflict(Appointment a) {
        return appointments.stream().anyMatch(existing ->
            existing.getDateTime().equals(a.getDateTime()));
    }
}
