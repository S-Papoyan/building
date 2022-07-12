package complex.service;

import complex.model.Building;
import java.util.Scanner;

public class ApartmentImpl implements Apartment {

    Building building = new Building();

    public void startMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean isActiveMenu = true;
        while (isActiveMenu) {
            System.out.println("1. Create new building" + "\n" + "2. Print count of apartments"
                    + "\n" + "3. Print count of apartments for sale" + "\n" + "4. Print all apartments for sale by number of rooms"
                    + "\n" + "5. Print all apartments for sale by price " + "\n" + "6. Exit");
            int menuNumber = scanner.nextInt();
            switch (menuNumber) {
                case 1:
                    createNewBuilding();
                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:
                    isActiveMenu = false;
                    break;
            }
        }
    }

    @Override
    public void createNewBuilding() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input parameters for new building" + "\n" + "Address: ");
        building.setAddress(s.nextLine());
        System.out.println("Count of floor: ");
        building.setCountOfFloors(s.nextInt());
        System.out.println("Count of apartments per floor: ");
        building.setCountOfApartmentsPerFloor(s.nextInt());
        System.out.println("Is monolithic: ");
        building.setMonolithic(s.nextLine());
        System.out.println("Please input parameters for apartment");
        building.printInfo();
    }

    public void createApartments(){
        Scanner s = new Scanner(System.in);

        complex.model.Apartment apartment = new complex.model.Apartment(s.nextInt(),
                s.nextDouble(), s.nextDouble(), s.nextInt(), s.nextBoolean());
    }


    @Override
    public void printCountOfApartments() {

    }

    @Override
    public void countOfApartmentsForSale() {

    }

    @Override
    public void sortingOfApartmentsForSaleByNumberOfRooms() {

    }

    @Override
    public void sortingOfSoldHousingByPrice() {

    }
}
