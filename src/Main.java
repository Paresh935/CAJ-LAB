//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}

//package lab3_2;
//
//public class Stack {
//    int[] stack;
//    int top;
//
//    void createNew(int n){
//        stack = new int[n];
//        top = -1;
//    }
//
//    boolean empty(){
//        return top == -1;
//    }
//
//    void push(int value){
//        if(top == stack.length - 1){
//            System.out.println("stack Overflow");
//        }
//        else {
//            top++;
//            stack[top] = value;
//        }
//    }
//
//    int pop(){
//        if(top == -1){
//            System.out.println("stack is empty");
//            return -1;
//        }
//        else{
//            int value = stack[top];
//            top--;
//            return value;
//        }
//    }
//
//    void display(){
//        for(int i = top; i >=0; i--){
//            System.out.println(stack[i]);
//        }
//    }
//}
//
//
//
//package lab3_3;
//
//public class Author {
//
//    private String name;
//    private String email;
//    private char gender;
//
//    public Author(String name, String email, char gender) {
//        this.name = name;
//        this.email = email;
//        this.gender = gender;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public char getGender() {
//        return gender;
//    }
//
//    @Override
//    public String toString() {
//        return "Author[name=" + name +
//                ",email=" + email +
//                ",gender=" + gender + "]";
//    }
//}



//public class Book {
//
//    private String name;
//    private Author author;
//    private double price;
//    private int qty;
//
//    public Book(String name, Author author, double price) {
//        this.name = name;
//        this.author = author;
//        this.price = price;
//        this.qty = 0;
//    }
//
//    public Book(String name, Author author, double price, int qty) {
//        this.name = name;
//        this.author = author;
//        this.price = price;
//        this.qty = qty;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Author getAuthor() {
//        return author;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public int getQty() {
//        return qty;
//    }
//
//    public void setQty(int qty) {
//        this.qty = qty;
//    }
//
//    @Override
//    public String toString() {
//        return "Book[name=" + name +
//                ", " + author +
//                ", price=" + price +
//                ", qty=" + qty + "]";
//    }
//}