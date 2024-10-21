package org.example;

public class Booking {
    private User user;
    private String bookingId;
    private String address;
    private double weight;
    private double maxWeight = 200;

    public Booking(User user, String bookingId, String address, double weight) {
        this.user = user;
        this.bookingId = bookingId;
        this.address = address;
        this.weight = weight;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
