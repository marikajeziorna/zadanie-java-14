import java.util.Scanner;

public class TestNames {
    public static void main(String[] args) {
        String[] namesTable = new String[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        namesTable[0] = scanner.nextLine();
        System.out.println("Enter the second name: ");
        namesTable[1] = scanner.nextLine();
        System.out.println("Enter the third name: ");
        namesTable[2] = scanner.nextLine();
        System.out.println("Enter the fourth name: ");
        namesTable[3] = scanner.nextLine();
        System.out.println("Enter the fifth name: ");
        namesTable[4] = scanner.nextLine();

        NamesTable namesTableReturn = new NamesTable();
        namesTableReturn.printWelcome(namesTable);
    }
}