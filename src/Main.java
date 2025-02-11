import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();

        switch(x){
            case 1 : System.out.println("Hello");
                break;
            case 2: System.out.println("world");
                break;
            case 3: System.out.println("ONE MORE TIME");
                break;
        }
    }
}