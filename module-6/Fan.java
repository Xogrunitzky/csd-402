/*
Xavier Grunitzky
Module 6.2 Assignment
2/8/26

This program defines a Fan object,

Creates two fan objects,

Changes their values,

Prints their current state to the screen,
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
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
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
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON\nSpeed: " + speed +
                    "\nColor: " + color +
                    "\nRadius: " + radius;
        } else {
            return "Fan is OFF\nColor: " + color +
                    "\nRadius: " + radius;
        }
    }
}

