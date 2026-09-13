package lab4_3;

public class test {
    public static void main(String[] args){
        Author a1 = new Author("Paresh", "kamath@gmail.com", 'm');
        Author a2 = new Author("Manish", "manish@gmail.com", 'm');
        Author a3 = new Author("Pranam", "pranam@gmail.com", 'm');
        Book b1 = new Book("Java Program", a1, 400, 10);

        assert(b1.getAuthor().getname().equals("Paresh"));
        assert(b1.getPrice() ==400);
        assert(b1.getQty()==10);
        assert(b1.getName().equals("Java Program"));




    }
}
