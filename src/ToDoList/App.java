package ToDoList;

import java.util.Scanner;

@SuppressWarnings("ReassignedVariable")
public class App {
    public static void main(String[] args) {
        // Variables
        int capacity = 1;
        DynamicArray todoList = new DynamicArray(capacity); // Not the best initialisation of a list as string = object.
        // User Input
        Scanner userInput = new Scanner(System.in);

        int choice = 3; // Default value
        do {
            System.out.println("\nTODO MENU:\n1. Add Item\n2. Show All\n3. Exit");
            choice = userInput.nextInt();
            if (choice == 1) {
                System.out.println("Enter New ToDo: ");
                userInput.nextLine(); // Buffer cleaning.
                todoList.add(userInput.nextLine());
            } else if (choice == 2) {
                System.out.println(todoList.toString());
            }
        } while (choice != 3);
    }
}
