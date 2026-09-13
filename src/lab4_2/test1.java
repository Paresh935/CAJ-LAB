package lab4_2;

public class test1 {
    public static void main(String[] args){

            Stack s = new Stack();

            s.createNew(10);

            s.push(10);
            s.push(20);
            s.push(30);

            s.display();

            System.out.println("Popped :"+ s.pop());

            s.display();

            if(s.empty()) {
                System.out.println("Stack is empty");
            }
            else{
                System.out.println("Stack is not empty");
            }

        }
    }

//class Shape {
//    private String color;
//    private boolean filled;
//
//    // Default constructor
//    public Shape() {
//        color = "green";
//        filled = true;
//    }
//
//    // Parameterized constructor
//    public Shape(String color, boolean filled) {
//        this.color = color;
//        this.filled = filled;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public boolean isFilled() {
//        return filled;
//    }
//
//    public void setFilled(boolean filled) {
//        this.filled = filled;
//    }
//
//    @Override
//    public String toString() {
//        if (filled)
//            return "A Shape with color of " + color + " and filled";
//        else
//            return "A Shape with color of " + color + " and Not filled";
//    }
//}