package task2;


import java.util.Scanner;

public class lab2 {
    private static Scanner sc = null;
    public static int[] constructArray() {
        System.out.println("Enter the number of elements");
        int  size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i< size;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void duplicate(int[] args) {     //method
        System.out.println("Duplicate values are:");

        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (args[i] == args[j]) {
                    System.out.println(args[i]);
                    break;
                }
            }
        }
    }
    public static void kth(int[] args){  //method

        for (int i = 0; i < args.length - 1; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (args[i] > args[j]) {
                    int temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }

        System.out.println("enter the value of k");
        int k = sc.nextInt();

        System.out.println("the kth min is " + args[k - 1]);
        System.out.println("the kth max is " + args[args.length - k]);
    }
    //    public static void pattern() {
//        int num = 1;
//
//        for (int i = 1; i <= 13; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num + " ");
//                num++;
//            }
//            System.out.println();
//        }
//    }
    public static void positiveNegative(int[] args) {   // method

        for (int i = 0; i < args.length - 1; i++) {
            for (int j = i + 1; j < args.length; j++) {

                if (args[i] > 0 && args[j] < 0) {
                    int temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }

        System.out.println("Array after moving negative and positive numbers:");

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

        System.out.println();
    }

    public static void pattern() {

        int num = 1;

        for (int i = 1; i <= 13; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }

    public static void mainApp() {
        int choice=0;
        do {
            System.out.println("********************Main App************************");
            System.out.println("1. Find duplicate values");
            System.out.println("2. Find the kth smallest and largest");
            System.out.println("3. Find positive and negative number");
            System.out.println("4. Q4");
            System.out.println("5. Q5");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    int[] arr = constructArray();
                    duplicate(arr);
                    break;
                }
                case 2: {
                    {
                        int[] arr = constructArray();
                        kth(arr);
                        break;
                    }

                }
                case 3:{
                    int[] arr=constructArray();
                    positiveNegative(arr);
                    break;
                }
                case 4: {
                    pattern();
                    break;
                }
//                case 3:{
//                    int[] arr=constructArray();
//                    pattern();
//                    break;
//                }



            }
        }
        while(choice>0);

    }
    public static void main(String[] args) {
//        int[] i;
//        i = new int[5];
        String[] user = {"admin","user"};
        String[] password = {"abc","xyz"};
        sc = new Scanner(System.in);
        System.out.println("Enter username & password");
        String username =sc.next();
        String pass = sc.next();
        boolean checked = false;
        for(int i=0;i<user.length;i++){
            if((user[i].equals(username)) && (password[i].equals(pass))){
                checked = true;
                break;
            }
        }
        if(checked){
            mainApp();
        }
        else{
            System.out.println("Unauthorized user");
        }



    }
}
