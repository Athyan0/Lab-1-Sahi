/**
 * Project: lab15Sahi
 * Purpose Details: Describes a motorcycle engine
 * Course: CMPSC 221
 * Author: Aayan Sahi
 * Date Developed: Oct 24, 2026
 * Last Date Changed: Oct 25, 2026
 * Revision: 2
 */
public class Engine {

    private int cc;
    private String type;

    public Engine(int cc, String type) {
        this.cc = cc;
        this.type = type;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
