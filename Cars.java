public class Cars {

    // Class attributes (instance variables)
    private String make;
    private String model;
    private int year;
  
    // Constructor
    public Cars(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
  
    // Methods
    public String getMake() {
        return make;
    }
  
    public void setMake(String make) {
        this.make = make;
    }
  
    public String getModel() {
        return model;
    }
  
    public void setModel(String model) {
        this.model = model;
    }
  
    public int getYear() {
        return year;
    }
  
    public void setYear(int year) {
        this.year = year;
    }
  
    public void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
        public static void main(String[] args) {
            // Create a new Cars object
            Cars myCar = new Cars("Toyota", "Corolla", 2015);
    
            // Display the car's information
            System.out.println("Initial car information:");
            myCar.displayCarInfo();
    
            // Update the car's information
            myCar.setMake("Honda");
            myCar.setModel("Civic");
            myCar.setYear(2020);
    
            // Display the updated car's information
            System.out.println("\nUpdated car information:");
            myCar.displayCarInfo();
        }
  }