import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Officer officer1 = new Officer("John", "Powells", 1035, "District99", 4);
        Officer officer2 = new Officer("Jim", "Burns", 10121, "District99", 25);
        Officer officer3 = new Officer("Susie", "Comodo", 643434, "District99", 43);

        ArrayList<Officer> district99 = new ArrayList<>();
        district99.add(officer1);
        district99.add(officer2);
        district99.add(officer3);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Officer's name:");
        String name = input.nextLine();
        System.out.println("Enter Officer's surname:");
        String surname = input.nextLine();
        System.out.println("Enter Officer's ID:");
        int officerID = Integer.parseInt(input.nextLine());
        System.out.println("Enter Officer's District:");
        String workingDistrict = input.nextLine();
        System.out.println("Enter how many crimes officer hase solved:");
        int crimesSolved = Integer.parseInt(input.nextLine());

        district99.add(new Officer(name, surname, officerID, workingDistrict, crimesSolved));

        int countLevelOne = 0;
        int countLevelMoreThanOne = 0;
        int countJohn = 0;

        for (Officer officer : district99) {
            if (officer.calculatedLevel() == 1) {
                countLevelOne++;
            }
            if (officer.calculatedLevel() > 1) {
                countLevelMoreThanOne++;
            }
            if (officer.getName().equals("John")) {
                countJohn++;
            }
        }

        System.out.printf("There are %d Officer(-s) with level 1 in the District99.\n" +
                        "There are %d Officer(-s) with level larger than 1 in Disctrict99.\n" +
                        "There are %d John(-s) in District99\n\n",
                countLevelOne, countLevelMoreThanOne, countJohn);

        System.out.println("All the District99 officers: " + district99);

    }
}
