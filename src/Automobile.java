public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    public Automobile() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
    }

    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }
    public String addVehicle(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        return "Vehicle added successfully!";
    }
    public String[] vehicleInformation() {
        return new String[]{make, model, color, String.valueOf(year), String.valueOf(mileage)};
    }
    public String removeVehicle() {
        this.make = null;
        this.model = null;
        this.color = null;
        this.year = 0;
        this.mileage = 0;
        return "Vehicle removed successfully!";
    }
    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        return "Vehicle updated successfully!";
    }
}
