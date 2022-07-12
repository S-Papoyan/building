package complex.model;

public class Parking{

    private int floor;
    private int countOfCar;
    private boolean haveACarWash;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCountOfCar() {
        return countOfCar;
    }

    public void setCountOfCar(int countOfCar) {
        this.countOfCar = countOfCar;
    }

    public boolean isHaveACarWash() {
        return haveACarWash;
    }

    public void setHaveACarWash(boolean haveACarWash) {
        this.haveACarWash = haveACarWash;
    }

    public void printInfo() {
        System.out.println("Floor = " + floor + '\n' + "Count of car = " + countOfCar + '\n' +
                "Have a car wash" + haveACarWash + '\n');
    }
}
