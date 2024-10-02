
public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Method to display car information
    public void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2022);

        // Accessing attributes
        System.out.println(myCar.getMake()); // Output: Toyota

        // Modifying attributes
        myCar.setYear(2023);

        // Using a method
        myCar.displayCarInfo();
        // Output:
        // Make: Toyota
        // Model: Corolla
        // Year: 2023
    }
}