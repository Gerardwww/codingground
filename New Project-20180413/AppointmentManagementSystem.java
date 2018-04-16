import java.util.Scanner;

public class AppointmentManagementSystem
{

   // declare AntiqueSales array and object count
   private static Appointment[] appointments = new Appointment[20];
   private static int appointmentCount = 0;

   // shared Scanner which can be used by all helper methods below
   private static Scanner input = new Scanner(System.in);

   public static void main(String[] args)
   {

      String selection;

      do
      {

         // display menu options
         System.out.println("   ***** Appointment Management System Menu *****");
         System.out.println();
         System.out.println("A. Add New Appointment");
         System.out.println("B. List Appointments");
         System.out.println("C. View Appointment Summary");
         System.out.println("D. Check In Patient");
         System.out.println("E. Call Patient");
         System.out.println("F. Record Consultation");
         System.out.println("X. Exit the program");
         System.out.println();

         // prompt user to enter selection
         System.out.print("Enter selection: ");
         selection = input.nextLine();

         System.out.println();

         // validate selection input length
         if (selection.length() != 1)
         {
            System.out.println("Error - invalid selection!");
         }
         else
         {

            // process user's selection
            switch (selection.toUpperCase())
            {
               case "A":
                  addNewAppointment();
                  break;

               case "B":
                  displayAllAppointments();
                  break;

               case "C":
                  viewAppointmentSummary();
                  break;

               case "D":
                  checkInPatient();
                  break;

               case "E":
                  callPatient();
                  break;

               case "F":
                  recordConsultation();
                  break;

               case "X":
                  System.out.println("Exiting the program...");
                  break;

               default:
                  System.out.println("Error - invalid selection!");
            }
         }
         System.out.println();

      } while (!selection.equalsIgnoreCase("X"));
   }
   
   
   /*
    * void addNewAppointment() helper method which implements the functionality
    * for adding a new Appointment to this AppointmentManagementSystem.
    * 
    * (implements Stage 2 Requirement A)
    */
   private static void addNewAppointment()
   {
      System.out.println("*** Add New Appointment Feature ***");
      System.out.println();

      // code for Stage 2 Requirement A) should go in here
      // ...

      String appointmentID, appointmentTime, patientName;
      boolean bulkBilling;


      
      

   }

   /*
    * void displayAllAppointments() helper method which implements the 
    * functionality for displaying all Appointment details stored in this 
    * AppointmentManagementSystem.
    * 
    * (implements Stage 2 Requirement B)
    */
   private static void displayAllAppointments()
   {
      System.out.println("*** Display All Appointments Feature ***");
      System.out.println();
      
      // code for Stage 2 Requirement B) should go in here
      // ...



   }

   
   /*
    * TIP: You may want to consider implementing a helper method at this point
    *      which handles locating and returning the Application object with the 
    *      specified appointment ID from the applications array, as this will 
    *      avoid having to repeat your search code for every feature which 
    *      incorporates a search below.
    *       
    *      Note that this is not a strict requirement and repeating search code
    *      in each of the features below that require it is also perfectly 
    *      acceptable. 
    */
   
   
   
   /*
    * void viewAppointmentSummary() helper method which implements the 
    * functionality for viewing the information for a specified Appointment in
    * this AppointmentManagementSystem.
    * 
    * (implements Stage 2 Requirement C)
    */
   private static void viewAppointmentSummary()
   {
      System.out.println("*** View Appointment Summary Feature ***");
      System.out.println();

      // code for Stage 2 Requirement C) should go in here
      // ...
      
      String appointmentID;



   }

   /*
    * void checkInPatient() helper method which implements the functionality 
    * for checking in a patient who has a pending Appointment in this
    * AppointmentManagementSystem.
    * 
    * (implements Stage 2 Requirement D)
    */
   private static void checkInPatient()
   {
      
      System.out.println("*** Check In Patient Feature ***");
      System.out.println();

      // code for Stage 2 Requirement D) should go in here
      // ...

      String appointmentID;


   }

   /*
    * void updateTrackingHistory() helper method which implements the functionality
    * for adding a new tracking entry for a Appointment in this
    * AppointmentManagementSystem.
    * 
    * (implements Stage 2 Requirement E)
    */
   private static void callPatient()
   {
      System.out.println("*** Call Patient Feature ***");
      System.out.println();

      // code for Stage 2 Requirement E) should go in here
      // ...
      
      String appointmentID;

      
      

   }

   /*
    * void completeDelivery() helper method which implements the functionality for
    * completing the delivery of a Appointment in this AppointmentManagementSystem.
    * 
    * (implements Stage 2 Requirement E)
    */
   private static void recordConsultation()
   {
      
      System.out.println("*** Record Consultation Feature ***");
      System.out.println();

      // code for Stage 2 Requirement F) should go in here
      // ...
      
      String appointmentID;

      
      
      
   }

 
}
