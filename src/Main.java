import java.util.Random;
import java.util.Scanner;

public class Main {
    District[] districtMap;

    static Random random = new Random();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option\n1:");
        String input = scanner.next();
        System.out.println("selected: "+input);
        switch (input){
            case "1":
                break;
            case "2":
                break;
        }
    }

    public static int rolld20(){
        return Main.random.nextInt(21);
    }
}