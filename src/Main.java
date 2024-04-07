import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Automobile auto = new Automobile("Volkswagen", "Jetta GLI", "Silver", 2015 ,  120000);
            System.out.println("Listing Vehicle Information...");
            String[] vehicleInfo = auto.vehicleInformation();
            for (String info : vehicleInfo) {
                System.out.print(info + "\n");
            }

            System.out.println("\nRemoving Vehicle.");
            System.out.print(auto.removeVehicle());

            System.out.println("\n\nAdding New Vehicle.");
            System.out.print(auto.addVehicle("Volkswagen", "Golf R", "Blue", 2021, 83000));

            System.out.println("\n\nListing New Vehicle Information...");
            vehicleInfo = auto.vehicleInformation();
            for (String info : vehicleInfo) {
                System.out.print(info + "\n");
            }

            System.out.println("\nUpdating Vehicle Information.");
            System.out.print(auto.updateVehicle("Audi", "RS6", "Grey", 2024, 1200));

            System.out.println("\n\nListing Updated Vehicle Information...");
            vehicleInfo = auto.vehicleInformation();
            for (String info : vehicleInfo) {
                System.out.print(info + "\n");
            }

            System.out.println("\nDo you want to print the information to a file? (Y/N)");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if(response.equalsIgnoreCase("Y")) {
                printToFile(vehicleInfo);
                System.out.println("\nVehicle information printed to file.");
            } else if(response.equalsIgnoreCase("N")) {
                System.out.println("\nVehicle information will not be printed to file.");
            } else {
                System.out.println("\nInvalid Input. Information will not be printed to file.");
            }


        } catch (Exception e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }
    public static void printToFile(String[] vehicleInfo) {
        try {
            FileWriter writer = new FileWriter("C:\\Temp\\Autos.txt");
            for(String info : vehicleInfo) {
                writer.write(info + "\n");
            }
            writer.close();
        } catch(IOException e) {
            System.out.println("\nAn error occurred while printing to file: " + e.getMessage());
        }
    }
}