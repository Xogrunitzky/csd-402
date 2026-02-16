/*
Xavier Grunitzky
Module 6.2 Assignment
2/8/26
*/

public class Fan {

    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed = STOPPED;
    private boolean on = false;
    private double radius = 6;
    private String color = "white";

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Argument constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        if (this.on) {
            return "Fan is ON\nSpeed: " + this.speed +
                    "\nColor: " + this.color +
                    "\nRadius: " + this.radius;
        } else {
            return "Fan is OFF\nColor: " + this.color +
                    "\nRadius: " + this.radius;
        }
    }
}


