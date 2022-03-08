package domain;

import java.util.ArrayList;
import java.util.List;

public class Apartment {

    List<User> tenants = new ArrayList<>();
    private User owner;
    private String address;
    private int rentValue;
    private int roomsNumber;

    public List<User> getTenants() {
        return tenants;
    }

    public void setTenants(List<User> tenants) {
        this.tenants = tenants;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRentValue() {
        return rentValue;
    }

    public void setRentValue(int rentValue) {
        this.rentValue = rentValue;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public void addTenant(User tenant) {
        this.tenants.add(tenant);
    }

    public void removeTenant(User tenant) {
        this.tenants.remove(tenant);
    }

    @Override
    public String toString() {
        return "Apartment{" +
                " owner=" + owner +
                ", address='" + address + '\'' +
                ", rentValue=" + rentValue +
                ", roomsNumber=" + roomsNumber +
                ", tenants=" + tenants +
                '}';
    }
}
