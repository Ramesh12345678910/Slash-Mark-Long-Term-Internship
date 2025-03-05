import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    private int id;
    private String name;
    private String ailment;

    public Patient(int id, String name, String ailment) {
        this.id = id;
        this.name = name;
        this.ailment = ailment;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Ailment: " + ailment;
    }
}

public class WebMedicalManagement {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWeb Medical Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Update Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addPatient(); break;
                case 2: viewPatients(); break;
                case 3: updatePatient(); break;
                case 4: deletePatient(); break;
                case 5: System.exit(0);
                default: System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void addPatient() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Ailment: ");
        String ailment = scanner.nextLine();
        patients.add(new Patient(id, name, ailment));
        System.out.println("Patient added successfully!");
    }

    private static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        }
    }

    private static void updatePatient() {
        System.out.print("Enter Patient ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                System.out.print("Enter New Ailment: ");
                patient.setAilment(scanner.nextLine());
                System.out.println("Patient updated successfully!");
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    private static void deletePatient() {
        System.out.print("Enter Patient ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        patients.removeIf(patient -> patient.getId() == id);
        System.out.println("Patient deleted successfully!");
    }
}
