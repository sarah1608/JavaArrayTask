
import java.io.*;
//squares and rectangles
public class shape{

    int l;
    int b;
    int area;
    String name;

    public void area() {// This method calculates the area of a rectangle

        this.area = this.l*this.b;
         //calculating the area
    }

    public void display() { // This method displays the area of the rectangle
        System.out.println("Area of "+ this.name +" is:  "+ this.area);

    }
    public static void main(String[] args) {
        shape square = new shape(); //creating an object
        shape rectangle = new shape();

        square.name = "Square"; //setting the name of the square
        square.l = 5; //setting the length of the square
        square.b = square.l; //setting the breadth of the square equal to its length

        rectangle.name = "Rectangle"; //setting the name of the rectangle
        rectangle.l = 10; //setting the length of the rectangle
        rectangle.b = 5; //setting the breadth of the rectangle

        square.display(); //displaying the area of the square
        rectangle.display();

        square.area(); 
        rectangle.area(); 

        square.display(); //displaying the area of the square
        rectangle.display(); //displaying the area of the rectangle

    }
}