package complex.model;

import java.util.List;

public class Apartment implements Comparable<Apartment> {

    private final int floor;
    private final double price;
    private final double area;
    private final int numberOfRooms;
    private boolean isRenovated;
    private boolean isSold;

    public Apartment(int floor, double price, double area, int numberOfRooms) {
        this.floor = floor;
        this.price = price;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setRenovated(String renovated) {
        String s1 = renovated.toLowerCase();
        this.isRenovated = s1.equals("yes");
    }

    public void setSold(String sold) {
        String s1 = sold.toLowerCase();
        this.isSold = s1.equals("yes");
    }

    public boolean isSold() {
        return isSold;
    }

    @Override
    public String toString() {
        return "Floor: " + floor + ", " + "Price: " + price + ", " +
                "Area: " + area + ", " + "Number of rooms: " + numberOfRooms +
                ", " + "Is renovated: " + (isRenovated ? "yes" : "no") + ", " +
                "Is sold: " + (isSold ? "yes" : "no") + "\n";
    }

    @Override
    public int compareTo(Apartment o) {
        return this.numberOfRooms - o.numberOfRooms;
    }
}

