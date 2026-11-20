//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Nigerian state: ");
//        String state = input.nextLine();

        for (GeopoliticalZone zone : GeopoliticalZone.values()){
            System.out.println(zone);
            System.out.println(zone + " Position " + zone.ordinal());
        }


    }
}