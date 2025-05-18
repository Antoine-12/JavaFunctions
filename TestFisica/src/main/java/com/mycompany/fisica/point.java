
package com.mycompany.fisica;

/**
 *
 * @author osmar
 */
public class point {
    
    private double x;
    private double y;
    private double comX;
    private double comY;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getComX() {
        return this.x * Math.cos(Math.toRadians(this.y));
    }

    public void setComX(double comX) {
        this.comX = comX;
    }

    public double getComY() {
        return this.x * Math.sin(Math.toRadians(this.y));
    }

    public void setComY(double comY) {
        this.comY = comY;
    }

   
    
}
