import java.util.Scanner;

public class online {

  private static Scanner sc = new Scanner(System.in);
  private static String[] trainNumber = {"T101", "T102", "T103", "T104", "T105"};
  private static String[] trainName = {"Train1", "Train2", "Train3", "Train4", "Train5"};

  private static String username = "ankit";
  private static String password = "1234";

  public static void main(String[] args) {
    
    int choice=0;
    do {
      System.out.println(" ");
      System.out.println("####################################");
      System.out.println("Welcome to Online Reservation System");
      System.out.println("####################################");
      System.out.println(" ");

      System.out.println("### Login Page ###");
      System.out.println("Press 1 to login");
      
      choice=sc.nextInt();

      if(choice==1)
      {
            login();
            break;
      }
      else
      {
        System.out.println("You are exited from system");
        break;
      }
      
    } while (choice!=1);
  }

  private static void login() {
    int option=0;
    System.out.println(" ");
    System.out.print("Enter username: ");
    String usernameInput = sc.next();
    System.out.println(" ");

    System.out.print("Enter password: ");
    String passwordInput = sc.next();
    System.out.println(" ");

    if (usernameInput.equals(username) && passwordInput.equals(password)) {
      System.out.println("Login successful");
      System.out.println(" ");
     do{
      System.out.println("1. Reservation");
      System.out.println("2. Cancellation");
      System.out.println("3. Exit");
      System.out.println(" ");

      System.out.print("Enter your choice: ");
      option=sc.nextInt();

    
      switch(option)
      {
        case 1:
         reservation();
         break;
        case 2:
         cancellation();
         break;
        case 3:
        System.out.println("Exited");
        break;
        default:
         System.out.println("Invalid Choice");

      }
     }while(option!=3);}
    
    
  }

  private static void reservation() {
    System.out.println(" ");
    System.out.println("Available trains:");
    for (int i = 0; i < trainNumber.length; i++) {
      System.out.println((i + 1) + ". " + trainNumber[i] + " - " + trainName[i]);
    }

    System.out.println(" ");
    System.out.print("Enter your choice of train number: ");
    int trainChoice = sc.nextInt();

    String selectedTrainNumber = trainNumber[trainChoice - 1];

    System.out.println(" ");
    System.out.print("Enter your class type (1. First Class, 2. Second Class): ");
    int classType = sc.nextInt();

    System.out.println(" ");
    System.out.print("Enter your date of journey (dd/mm/yyyy): ");
    String journeyDate = sc.next();

    System.out.println(" ");
    System.out.print("Enter your source: ");
    String source = sc.next();

    System.out.println(" ");
    System.out.print("Enter your destination: ");
    String destination = sc.next();

    System.out.println(" ");
    System.out.println("Reservation successful");
    System.out.println(" ");

    System.out.println("######### YOUR BOOKING DETAILS ########");
    System.out.println("Train Number: " + selectedTrainNumber);
    System.out.println("Train Name: " + trainName[trainChoice - 1]);
    System.out.println("Class Type: " + (classType == 1 ? "First Class" : "Second Class"));
    System.out.println("Date of Journey: " + journeyDate);
    System.out.println("Source: " + source);
    System.out.println("Destination: " + destination);
    System.out.println("#######################################");
    System.out.println(" ");

  }

  private static void cancellation() {
    System.out.println(" ");
    System.out.print("Enter your PNR number: ");
    int pnrNumber = sc.nextInt();
    System.out.println(" ");
    System.out.println("Ticket with PNR number " + pnrNumber + " has been cancelled");
    System.out.println(" ");
  }
}