package rentalservice;
/**
 * Represents a single car object with properties such as brand, model, type of vehicle, year of manufacture,
 * number of seats, and color.
 */
public class Car {
    
    // Properties of the Car class
    private String id;
    private String brand;
    private String model;
    private String type;
    private int year;
    private int seats;
    private String color;
    private double rentalFee;
    private double insuranceFee;
    private double serviceFee;
    private double discount;
    
    /**
     * Constructor for the Car class.
     */
    public Car(String id, String brand, String model, String type, int year, int seats, String color, double rentalFee,
               double insuranceFee, double serviceFee, double discount) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.year = year;
        this.seats = seats;
        this.color = color;
        this.rentalFee = rentalFee;
        this.insuranceFee = insuranceFee;
        this.serviceFee = serviceFee;
        this.discount = discount;
    }
    
    // Getters for the properties of the Car class

    public String getId() {
        return id;
    }
    
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public double getServiceFee() {
        return serviceFee;
    }

    public double getDiscount() {
        return discount;
    }
    
    /**
     * Returns a string representation of the Car object.
     */
    @Override
    public String toString() {
        return "---------------------------------------------\n" +
               "Car ID: " + this.id + "\n" +
               "Brand: " + this.brand + "\n" +
               "Model: " + this.model + "\n" +
               "Type: " + this.type + "\n" +
               "Year: " + this.year + "\n" +
               "Seats: " + this.seats + "\n" +
               "Color: " + this.color + "\n" +
               "Rental Fee: $" + this.rentalFee + "/day" + "\n" +
               "Insurance Fee: $" + this.insuranceFee + "/day" + "\n" +
               "Service Fee: $" + this.serviceFee + "/day" + "\n" +
               "Discount: " + this.discount + "%" + "\n" +
               "---------------------------------------------";
    }
    
}
