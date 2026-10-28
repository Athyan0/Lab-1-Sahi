**/
 * Project: lab1_5Sahi
 * Purpose Details: Defines a complete motorcycle using an engine, fuel tank, and drivetrain
 * Course: CMPSC 221
 * Author: Aayan Sahi
 * Date Developed: Oct 22, 2026
 * Last Date Changed: Oct 25, 2026
 * Revision: 2
 */
public class Motorcycle {

    private String brand;
    private String model;
    private Engine engine;
    private FuelTank fuelTank;
    private Drivetrain drivetrain;

    public Motorcycle(String brand, String model, Engine engine, FuelTank fuelTank, Drivetrain drivetrain) {
        this.brand = brand; this.model = model;
        this.engine = engine; this.fuelTank = fuelTank;
        this.drivetrain = drivetrain;
    }

    // getters & setters
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public Engine getEngine() { return engine; }
    public void setEngine(Engine engine) { this.engine = engine; }

    public FuelTank getFuelTank() { return fuelTank; }
    public void setFuelTank(FuelTank fuelTank) { this.fuelTank = fuelTank; }

    public Drivetrain getDrivetrain() { return drivetrain; }
    public void setDrivetrain(Drivetrain drivetrain) { this.drivetrain = drivetrain; }
}
