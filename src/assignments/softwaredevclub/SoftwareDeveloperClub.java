package assignments.softwaredevclub;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareDeveloperClub {
    private File membersFile;
    ArrayList<ClubMember> memberList;

    public SoftwareDeveloperClub() {
        membersFile = new File("src/assignments/softwaredevclub/members.txt");
        memberList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(membersFile);

            // Skip the first line -- Headers
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split("\\*\\*");
                createClubMembers(line);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);
        }
    }

    private void createClubMembers(String[] memberDetails) {
        ClubMember member = new ClubMember(memberDetails[0], memberDetails[1], memberDetails[2], memberDetails[3]);
        memberList.add(member);
    }

    public void displayMembers() {
//        Member Name: Joan
//        Location: New York, NY
//        Favorite Language: JavaScript

        for (ClubMember cm : memberList) {
            System.out.println("Member Name: " + cm.getName());
            System.out.println("Location: " + cm.getCity() + ", " + cm.getState());
            System.out.println("Favorite Language: " + cm.getFaveProgrammingLang());
            System.out.println();
        }
    }

    public void removeMember(String name) {
        boolean removed = false;

        for (int i = 0; i < memberList.size(); i++) {
            if (memberList.get(i).getName().equals(name)) {
                memberList.remove(i);
                removed = true;
            }
        }

        if (removed) {
            System.out.println(name + " has been removed.");
        } else {
            System.out.println(name + " was not found.");
        }
    }

    public void addMember(String name, String city, String state, String language) {
        ClubMember cm = new ClubMember(name, city, state, language);
        memberList.add(cm);
    }
}
