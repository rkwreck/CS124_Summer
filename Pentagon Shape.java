//working with exceptions practice 
//i have no idea what the instructions want tbh 
import java.awt.Shape; 

public class Pentagon extends Shape {
    private double sideLength; 

    public Pentagon (double side){
        sideLength = side; 
        if (sideLength <= 0) {
            throw new IllegalArgumentException("The side length must be greater than 0"); 
        }
        //do something with this to create a new pentagon 
        //and identify the shape as a pentagon
        Shape(sideLength);  
    }

    public double area(){
        double A = (1/4)*(Math.sqrt(5*(5 + 2*Math.sqrt(5))))*(Math.pow(sideLength, 2)); 
        return A; 
    }

    @Override
    public boolean equals(Object other){
        if (other instanceof Pentagon){
            if (other.sideLength == this.sideLength){
                return true; 
            }
        }
        return false; 
    }
}