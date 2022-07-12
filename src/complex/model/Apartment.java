package complex.model;

public class Apartment {

    private int floor;
    private double price;
    private double area;
    private int numberOfRooms;
    private boolean isRenovated;


    public Apartment(int floor, double price, double area, int numberOfRooms, boolean isRenovated) {
        this.floor = floor;
        this.price = price;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.isRenovated = isRenovated;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean isRenovated() {
        return isRenovated;
    }

    public void setRenovated(boolean renovated) {
        isRenovated = renovated;
    }

    public void printInfo() {
        System.out.println("Floor: " + floor + '\n' + "Price = " + price + '\n' + "Area = " + area +
                '\n' + "Number of rooms = " + numberOfRooms + '\n' + "Is renovated" + isRenovated);
    }
}
