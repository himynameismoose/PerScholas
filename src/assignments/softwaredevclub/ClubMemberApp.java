package assignments.softwaredevclub;

import java.util.Scanner;

public class ClubMemberApp {

    static SoftwareDeveloperClub sdc = new SoftwareDeveloperClub();

    public static void main(String[] args) {

        int choice = -1;

        while (choice != 4) {
            // Display menu
            menu();
            // Get user input
            choice = getUserInput();
            menuFunction(choice);
        }

    }

    public static void menu() {
        System.out.println("Select from the following menu:");
        System.out.println("1: Display Members");
        System.out.println("2: Remove Member");
        System.out.println("3: Add Member");
        System.out.println("4: Quit");
        System.out.println();
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        return choice;
    }

    public static void menuFunction(int choice) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        switch (choice) {
            case 1:
                System.out.println();
                sdc.displayMembers();
                break;
            case 2:
                System.out.print("Which member would you like to remove? ");
                name = scanner.next();
                sdc.removeMember(name);
                break;
            case 3:
                System.out.print("Enter member name: ");
                name = scanner.next();
                System.out.print("\nEnter city: ");
                String city = scanner.next();
                System.out.println("\nEnter state: ");
                String state = scanner.next();
                System.out.println("\nEnter favorite programming language: ");
                String language = scanner.next();
                sdc.addMember(name, city, state, language);
                break;
            case 4:
                System.out.println("Goodbye");
                break;
        }
    }
}
