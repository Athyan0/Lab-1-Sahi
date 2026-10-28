/**
 * Project: lab15Sahi
 * Purpose Details: defines  a motorcycle drivetrain and its number of gears
 * Course: CMPSC 221
 * Author: Aayan Sahi
 * Date Developed: Oct 22, 2026
 * Last Date Changed: Oct 25, 2026
 * Revision: 3
 */
public class Drivetrain {
    private String shaft;
    private int gears;

    public Drivetrain(String shaft, int gears) {
        this.shaft = shaft;
        this.gears = gears;
    }

    public String getshaft() { return shaft; }
    public void setshaft(String shaft) { this.shaft = shaft; }

    public int getGears() { return gears; }
    public void setGears(int gears) { this.gears = gears; }
}
