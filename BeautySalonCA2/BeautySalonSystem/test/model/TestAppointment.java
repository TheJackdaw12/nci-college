package test.model;
import model.Appointment;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class TestAppointment {
    @Test
    public void testAppointmentCreation() {
        Appointment a = new Appointment("Sarah", "Haircut", LocalDateTime.of(2025, 5, 10, 14, 0));
        assertEquals("Sarah", a.getCustomerName());
        assertEquals("Haircut", a.getServiceType());
    }
}
