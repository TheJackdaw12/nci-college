package model;

import java.time.LocalDateTime;

public class Appointment {
    private String customerName;
    private String serviceType;
    private LocalDateTime dateTime;

    public Appointment(String customerName, String serviceType, LocalDateTime dateTime) {
        this.customerName = customerName;
        this.serviceType = serviceType;
        this.dateTime = dateTime;
    }

    public String getCustomerName() { return customerName; }
    public String getServiceType() { return serviceType; }
    public LocalDateTime getDateTime() { return dateTime; }
}
