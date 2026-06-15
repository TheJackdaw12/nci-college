package test.controller;
import controller.BookingManager;
import model.Appointment;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class TestBookingManager {
    @Test
    public void testAddAppointment() {
        BookingManager bm = new BookingManager();
        Appointment a = new Appointment("Tom", "Facial", LocalDateTime.of(2025, 5, 11, 12, 0));
        
        bm.addAppointment(a);
        assertEquals(1, bm.getAppointments().size());
    }

    @Test
    public void testConflict() {
        BookingManager bm = new BookingManager();
        Appointment a1 = new Appointment("Ann", "Massage", LocalDateTime.of(2025, 5, 11, 10, 0));

        Appointment a2 = new Appointment("Ben", "Massage", LocalDateTime.of(2025, 5, 11, 10, 0));
        bm.addAppointment(a1);
        assertTrue(bm.hasConflict(a2));
    }
}

