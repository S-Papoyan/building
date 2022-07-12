package complex.model;

public class BusinessCenter{

    private String name;
    private int floor;
    private double area;
    private double rentalPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void printInfo() {
        System.out.println("Name = " + name + '\n' + "Floor = " + floor + '\n' +
                "Area = " + area + '\n' + "Rental price = " + rentalPrice + '\n');
    }
}
