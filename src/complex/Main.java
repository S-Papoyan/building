package complex;
import complex.service.ApartmentServiceImpl;

public class Main {
    public static void main(String[] args) {

        ApartmentServiceImpl apartment = new ApartmentServiceImpl();
        apartment.startMenu();
    }
}