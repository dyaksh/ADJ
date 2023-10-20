import java.util.Scanner;
import java.util.Vector;

public class Exp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> names = new Vector<String>();

        System.out.println("Please enter 10 initial names:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

        System.out.println("\nYou entered the following names:");

        for (int i = 0; i < names.size(); i++) {
            System.out.println("Name " + (i + 1) + ": " + names.get(i));
        }
// Prompt for removal
        System.out.print("\nEnter the index of the name to remove: ");
        int removeIndex = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (removeIndex >= 1 && removeIndex <= names.size()) {
            names.remove(removeIndex - 1);
            System.out.println("Name at index " + removeIndex + " has been removed.");
        } else {
            System.out.println("Invalid index. No name removed.");
        }
        System.out.print("\nEnter the number of names to add: ");
        int numberOfNamesToAdd = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numberOfNamesToAdd; i++) {
            System.out.print("Enter name to add: ");
            String newName = scanner.nextLine();
            names.add(newName);
            System.out.println(newName + " has been added.");
        }

        // Display the updated list of names
        System.out.println("\nUpdated Array of Names:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("copy vector");
        Vector v2= new Vector<>(names);
        System.out.print(names);
        System.out.println(names.size());

        scanner.close();
    }
}
