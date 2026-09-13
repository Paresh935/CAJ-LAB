package practice;

public class BoxDemo {
    public static void main(String args[]) {

        Box myBox1 = new Box();
        double volume;

        myBox1.setDim(10, 20, 15);
        System.out.println(myBox1.width);

        volume = myBox1.getVolume();

        System.out.println("Volume is: " + volume);
    }
}
