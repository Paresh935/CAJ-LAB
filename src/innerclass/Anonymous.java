package innerclass;

public class Anonymous {

    abstract class Base {
        abstract void method();
    }

    public interface Arthematic {
        int add(int a, int b);
        int mul(int a,int b);
        int sub(int a, int b);
    }
    public static void  main(String[] args){
        Arthematic a=new Arthematic() {
            @Override
            public int add(int a, int b) {
                return 0;
            }

            @Override
            public int mul(int a, int b) {
                return 0;
            }

            @Override
            public int sub(int a, int b) {
                return 0;
            }
        };


    }
}
