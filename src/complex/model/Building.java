package complex.model;
import java.util.Objects;
import java.util.Scanner;

public class Building {
    static Scanner s = new Scanner(System.in);

    private String address;
    private int countOfFloors;
    private int countOfApartmentsPerFloor;
    private boolean isMonolithic;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCountOfFloors(int countOfFloors) {
        if (countOfFloors > 0) {
            this.countOfFloors = countOfFloors;
        }
        if (countOfFloors <= 0) {
            System.out.println("Can't be less than 1");
            setCountOfFloors(s.nextInt());
        }
    }

    public void setCountOfApartmentsPerFloor(int countOfApartmentsPerFloor) {
        if (countOfApartmentsPerFloor >= 6 && countOfApartmentsPerFloor <= 8) {
            this.countOfApartmentsPerFloor = countOfApartmentsPerFloor;
        } else {
            System.out.println("The number should be from 6 to 8");
            setCountOfApartmentsPerFloor(s.nextInt());
        }
    }

    public void setMonolithic(String monolithic) {
        if (Objects.equals(monolithic, "yes")) {
            isMonolithic = !Boolean.parseBoolean(monolithic);
        }
        if (Objects.equals(monolithic, "no")) {
            isMonolithic = Boolean.parseBoolean(monolithic);
        } else if (!Objects.equals(monolithic, "yes")) {
            System.out.println("Please input yes or no");
            setMonolithic(s.next());
        }
    }

    public void printInfo() {
        System.out.println("Address: " + address + '\n' + "Count of floors = " + countOfFloors + '\n' +
                "Count of apartments per floor = " + countOfApartmentsPerFloor + '\n' + "Is monolithic = "
                + (isMonolithic ? "yes" : "no") + '\n');
    }
}
