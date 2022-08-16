package complex.service;

import complex.model.Apartment;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ApartmentServiceImpl implements ApartmentService {

    public void startMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean isActiveMenu = true;
        while (isActiveMenu) {
            System.out.println("1. Create new apartment" + "\n" + "2. Print info of apartments" + "\n" + "3. Print count of apartments"
                    + "\n" + "4. Print count of apartments for sale" + "\n" + "5. Print all apartments for sale by number of rooms (sorted)"
                    + "\n" + "6. Print all apartments for sale by price " + "\n" + "7. Exit");
            int menuNumber = scanner.nextInt();
            switch (menuNumber) {
                case 1:
                    createNewApartment();
                    break;
                case 2:
                    printInfoOfApartments();
                    break;
                case 3:
                    printCountOfApartments();
                    break;
                case 4:
                    countOfApartmentsForSale();
                    break;
                case 5:
                    sortingOfApartmentsForSaleByNumberOfRooms();
                    break;
                case 6:

                    break;
                case 7:
                    isActiveMenu = false;
                    break;
            }
        }
    }

    @Override
    public void createNewApartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input floor");
        int floor = scanner.nextInt();
        System.out.println("Input price");
        double price = scanner.nextDouble();
        System.out.println("Input area");
        double area = scanner.nextDouble();
        System.out.println("Input number of rooms");
        int numberOfRoom = scanner.nextInt();
        System.out.println("Is renovated? yes or no");
        Apartment apartment = new Apartment(floor, price, area, numberOfRoom);
        apartment.setRenovated(scanner.next());
        System.out.println("The apartment is sold? yes or no");
        apartment.setSold(scanner.next());
        writeInfoOfApartment(apartment);
    }

    @Override
    public void printCountOfApartments() {
        List<String> strings = readInfoOfApartment();
        int count = strings.size();
        System.out.println(count);
    }

    @Override
    public int countOfApartmentsForSale() {
        int count = 0;
        List<String> strings = readInfoOfApartment();
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            String[] split = s.split(",");
            String s1 = split[5];
            String[] split1 = s1.split(": ");
            String s2 = split1[1];
            if (s2.equals("no")) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    @Override
    public void sortingOfApartmentsForSaleByNumberOfRooms() {
        ArrayList<String> strings = (ArrayList<String>) readInfoOfApartment();
        ArrayList<Integer> intSort = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            String[] split = strings.get(i).split(",");
            System.out.println(Arrays.toString(split));
            System.out.println(split.length);
            String[] split1 = split[3].split(": ");
            intSort.add(Integer.parseInt(split1[1]));
            System.out.println(intSort);
            Collections.sort(intSort);
            System.out.println(intSort);
        }
    }

    @Override

    public void sortingOfSoldHousingByPrice() {

    }

    public void writeInfoOfApartment(Apartment apartment) {
        try {
            Files.write(Path.of("Apartment.txt"), apartment.toString().getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> readInfoOfApartment() {
        try {
            return Files.readAllLines(Path.of("Apartment.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void printInfoOfApartments() {
        List<String> strings = readInfoOfApartment();
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
