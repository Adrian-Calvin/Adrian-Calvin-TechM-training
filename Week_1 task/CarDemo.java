// Base class - Car
class Car {
    private String make;
    private String model;
    private int year;

    // Constructor to intialize car variables
    Car(String make,String model,int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    // Getters and Setters methods
    public String getMake() 
    { 
        return make; 
    }
    public void setMake(String make) 
    { 
        this.make = make; 
    }
    public String getModel() 
    {
         return model; 
    }
    public void setModel(String model) 
    { 
        this.model = model;
    }

    public int getYear() 
    { 
        return year; 
    }
    public void setYear(int year) 
    { 
        this.year = year;
    }
    // Method to start engine
    public void startEngine() {
        System.out.println("The car's engine has started.....");
    }
}

// Subclass - ElectricCar
class ElectricCar extends Car {

    // Constructor to initialize child and parent class variables
    ElectricCar(String make, String model, int year, int batteryRange) {
        super(make, model, year);
        //this.batteryRange=batteryRange;
    }

    // Method to charge battery
    public void chargeBattery() {
        System.out.println("The battery is being charged......");
    }

    // Overriding startEngine method
    @Override
    public void startEngine() {
        System.out.println("The electric car's engine is silent but started......");
    }
}
// Main class to demonstrate polymorphism
public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new ElectricCar("Tesla", "Model S", 2023, 400);
        car1.startEngine();
        car2.startEngine();
    }
}

