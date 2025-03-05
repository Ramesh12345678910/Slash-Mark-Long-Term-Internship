import java.util.ArrayList;
import java.util.Scanner;

public class TaskListApp {
    private static ArrayList<String> taskList = new ArrayList<>();
    private static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nTask List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int userChoice = inputScanner.nextInt();
            inputScanner.nextLine(); // Consume newline

            switch (userChoice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    displayTasks();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter task: ");
        String newTask = inputScanner.nextLine();
        taskList.add(newTask);
        System.out.println("Task added successfully!");
    }

    private static void removeTask() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks to remove.");
            return;
        }
        displayTasks();
        System.out.print("Enter task number to remove: ");
        int taskIndex = inputScanner.nextInt();
        inputScanner.nextLine(); // Consume newline
        if (taskIndex > 0 && taskIndex <= taskList.size()) {
            taskList.remove(taskIndex - 1);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void displayTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Your Tasks:");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println((i + 1) + ". " + taskList.get(i));
            }
        }
    }
}