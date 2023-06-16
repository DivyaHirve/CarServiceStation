import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to car service station");
        while (true) {
            System.out.println("Select the options below to do particular Tasks : ");
            System.out.println("1:To select the car : ");
            System.out.println("2:Exit");
            System.out.print("Enter your choice : ");
            int caseNo = sc.nextInt();
            sc.nextLine();
            switch (caseNo) {
                case 1: {
                    System.out.println("Select the type of car for servicing");
                    System.out.println("1:Hatchback");
                    System.out.println("2:SUV");
                    System.out.println("3:Sedan");
                    int carType = sc.nextInt();
                    switch (carType) {
                        case 1 : {
                            CarService car = new Hatchback();
                            ArrayList<String> arr = new ArrayList<>();

                        }
                        case 2 : {
                            CarService car = new Sedan();
                        }
                        case 3 : {
                            CarService car = new SUV();
                        }
                    }
                    break;
                }
                case 2: {
                    return;
                }
                default:{
                    System.out.println("Select the suitable option");
                    break;
                }
            }
        }
    }
}