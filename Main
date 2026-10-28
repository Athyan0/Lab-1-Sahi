/**
 * Project: lab1_5Sahi
 * Purpose Details: Main driver class to instantiate three motorcycle objects and print details using getters
 * Course: CMPSC 221
 * Author: Aayan Sahi
 * Date Developed: Oct 21, 2026
 * Last Date Changed: Oct 25, 2026
 * Revision: 4
 */
public class Main {
    public static void main(String[] args) {
                Motorcycle bike1 = new Motorcycle(
                "Yamaha", "MT07",
                new Engine(689, "ParallelTwin"),
                new FuelTank(14, "Gas"),
                new Drivetrain("Chain", 6)
        );

        Motorcycle bike2 = new Motorcycle(
                "Harley-Davidson", "Iron 883",
                new Engine(883, "VTwin"),
                new FuelTank(12.5, "Gas"),
                new Drivetrain("Belt", 5)
        );

        Motorcycle bike3 = new Motorcycle(
                "BMW", "R125g0S",
                new Engine(1254, "Boxer"),
                new FuelTank(20, "Gas"),
                new Drivetrain("Shaft", 6)
        );

        Motorcycle[] motorcycles = {bike1, bike2, bike3};


        for (int i = 0; i < motorcycles.length; i++) {
            Motorcycle m = motorcycles[i];
            System.out.println("Motorciycle" + (i + 1));
            System.out.println("Brand:" + m.getBrand());
            System.out.println("Model " + m.getModel());
            System.out.println("Engnie " + m.getEngine().getCc() + "cc (" + m.getEngine().getType() + ")");
            System.out.println("Fueltnk " + m.getFuelTank().getFuel() + "Gallons (" + m.getFuelTank().getFuelType() + ")");
            System.out.println("Drvietrian:" + m.getDrivetrain().getshaft() + " with " + m.getDrivetrain().getGears() + " gears");
            System.out.println();
        }
    }
}
