import java.util.Scanner;

public class Praktikum1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("\n===Library System===");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option(1-3):");
            int option = Integer.parseInt(scanner.nextLine());
            
            switch (option) {
                case 1 -> loginStudent(scanner);
                case 2 -> loginAdmin(scanner);
                case 3 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("invalid option.");
                
            }
        }
    }
    private static void loginStudent(Scanner scanner) {
        System.out.print("Enter your NIM: ");
        String nim = scanner.nextLine();
        if (nim.length() == 15){
            System.out.println("Successful Login as Student");
        } else {
            System.out.println("User not found");   
        }
    }   

    private static void loginAdmin(Scanner scanner) {
        System.out.print("Enter your username (admin):");
        String username = scanner.nextLine();
        System.out.print("Enter your password (admin):");
        String password = scanner.nextLine();
        if ("admin".equals(username)&& "admin".equals(password)) {
            System.out.println("Successful login as Admin");
        } else {
            System.out.println("User not found");
        }
    }    
}
