import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Choose from the following:");
        System.out.println("Option 1");
        System.out.println("Option 2");
        System.out.println("Option 3");
        System.out.println("Option 4 to quit program");

        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();

        switch(x){
            case 1 : System.out.println("The sum of these integers is: " + func1());
                break;
            case 2 : System.out.println("The sum of these integers is: " + func2());
                break;
            case 3 : System.out.println("Does this parameter pass?: " + func3());
                break;
            //case 4 : func4();
                //break;
        }


    }
    public static int func1(){

            int x = 1;
            int y = 2;
            return x + y;

    }

    public static int func2(){
        Scanner case2 = new Scanner(System.in);
        System.out.println("Enter integer 1: ");
        int obj2 = case2.nextInt();
        Scanner case2_1 = new Scanner(System.in);
        System.out.println("Enter integer 2: ");
        int obj2_1 = case2_1.nextInt();
        return obj2 + obj2_1;
    }

    public static boolean func3(){
        int x = 4;
        if (x > 5){
            return true;
        } else {
            return false;
        }
    }
}

