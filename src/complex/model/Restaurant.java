package complex.model;

public class Restaurant{

    private String name;
    private int countOfClients;
    private boolean isRestaurant;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfClients() {
        return countOfClients;
    }

    public void setCountOfClients(int countOfClients) {
        this.countOfClients = countOfClients;
    }

    public boolean isRestaurant() {
        return isRestaurant;
    }

    public void setRestaurant(boolean restaurant) {
        isRestaurant = restaurant;
    }

    public void printInfo() {
        System.out.println("Name = " + name + '\n' + "Count of clients = " + countOfClients + '\n' +
                "Is restaurant = " + isRestaurant + '\n');
    }
}
