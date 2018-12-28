package edu.springboot.mongodbex.springbootmongodbexample.document;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Bookings {

    private int bookingId;
    private String passengerName;
    private String source;
    private String destination;
    private Date doj;
public Bookings(){}
    public Bookings(int bookingId, String passengerName, String source, String destination, Date doj) {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.doj = doj;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }
}
