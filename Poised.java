import java.util.Scanner;

/*
I just cant seem to get my set methods for the attributes in my custom classes working.
I'm at a los to be honest. Please help.
 */


public class Poised {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // Calling scanner class to enter user input.
        String finProject = "No";

        // Declaring 4 boolean values to use in while loops.

        boolean firstLoop = true;
        boolean secondLoop = true;
        boolean thirdLoop = true;
        boolean endLoop = true;

        // Using user input I declare a new Architect class.

        System.out.println("Enter name of new Architect: ");
        String architectName = s.nextLine();

        System.out.println("Enter number of new Architect: ");
        String architectNumber = s.nextLine();

        System.out.println("Enter email address of new Architect: ");
        String architectEmail = s.nextLine();

        System.out.println("Enter the physical address for the new Architect: ");
        String architectAddress = s.nextLine();

        // Creating an Architect class.

        Architect tempArchitect = new Architect(architectName, architectNumber, architectEmail, architectAddress);

        // Using a while loop and if/ else if statements to edit the created Architect class.

        while (firstLoop == true)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Would you like to change the contact details of this architect?" +
                    "\n1    -   New number" +
                    "\n2    -   New email address" +
                    "\n3    -   If you don't want to edit");
            int user = input.nextInt();

            if(user == 1)
            {
                System.out.println("Please enter the new number: ");
                String newNumber = input.nextLine();    // Taking a new value from the user.
                tempArchitect.number = newNumber;       // Assigning that value to a specific attribute.
            }
            else if(user == 2)
            {
                System.out.println("Please enter a new email address: ");
                String newEmail = input.nextLine();
                tempArchitect.email = newEmail;
            }
            else if(user == 3)
            {
                firstLoop = false;
            }
        }
        // Taking in attributes to create a new Contractor object.

        System.out.println("Enter name of new Contractor: ");
        String contractorName = s.nextLine();

        System.out.println("Enter number of new Contractor: ");
        String contractorNumber = s.nextLine();

        System.out.println("Enter email address of new Contractor: ");
        String contractorEmail = s.nextLine();

        System.out.println("Enter the physical address for the new Contractor: ");
        String contractorAddress = s.nextLine();
        Contractor tempContractor = new Contractor(contractorName, contractorNumber, contractorEmail, contractorAddress);

        // Using a while loop and if/ else if statements to edit the created Contractor class.

        while (secondLoop == true)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Would you like to change the contact details of this contractor?" +
                    "\n1    -   New number" +
                    "\n2    -   New email address" +
                    "\n3    -   If you don't want to edit");
            int user = input.nextInt();

            if(user == 1)
            {
                System.out.println("Please enter the new number: ");
                String newNumber = input.nextLine();        // Taking a new value from the user.
                tempContractor.number = newNumber;          // Assigning that value to a specific attribute.
            }
            else if(user == 2)
            {
                System.out.println("Please enter a new email address: ");
                String newEmail = input.nextLine();
                tempContractor.email = newEmail;
            }
            else if(user == 3)
            {
                secondLoop = false;
            }
        }

        // Taking in attributes to create a new Customer object.

        System.out.println("Enter name of new Customer: ");
        String customerName = s.nextLine();

        System.out.println("Enter number of new Customer: ");
        String customerNumber = s.nextLine();

        System.out.println("Enter email address of new Customer: ");
        String customerEmail = s.nextLine();

        System.out.println("Enter the physical address for the new Customer: ");
        String customerAddress = s.nextLine();
        Customer tempCustomer = new Customer(customerName, customerNumber, customerEmail, customerAddress);

        // Using a while loop and if/ else if statements to edit the created Customer class.

        while (thirdLoop == true)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Would you like to change the contact details of this customer?" +
                    "\n1    -   New number" +
                    "\n2    -   New email address" +
                    "\n3    -   If you don't want to edit");
            int user = input.nextInt();

            if(user == 1)
            {
                System.out.println("Please enter the new number: ");
                String newNumber = input.nextLine();
                tempCustomer.number = newNumber;
            }
            else if(user == 2)
            {
                System.out.println("Please enter a new email address: ");
                String newEmail = input.nextLine();
                tempCustomer.email = newEmail;
            }
            else if(user == 3)
            {
                thirdLoop = false;
            }
        }

        // Taking in input to create a new Project class.

        System.out.println("Enter the name of the new project: ");
        String projectName = s.nextLine();

        System.out.println("Enter the number you wish to assign this project: ");
        int projectNumber = s.nextInt();
        s.nextLine();

        System.out.println("Enter the type of building for this project: ");
        String buildingType = s.nextLine();

        System.out.println("Enter the address for this project: ");
        String projectAddress = s.nextLine();

        System.out.println("Enter the ERF number for this building: ");
        String numberPlot = s.nextLine();

        System.out.println("Enter the total cost of this project: ");
        float feeTotal = s.nextFloat();

        System.out.println("Enter amount of cost paid up front: ");
        float feeToDate = s.nextFloat();
        s.nextLine();

        System.out.println("Enter the end date for the project: ");
        String projectDeadline = s.nextLine();

        // Using user input to create a new Project class.

        Project tempProject = new Project(projectName, projectNumber, buildingType, projectAddress, numberPlot, feeTotal, feeToDate,
                projectDeadline, tempArchitect, tempContractor, tempCustomer, finProject);

        // Using a while loop and if/ else if statements to edit the created Project class.

        while (endLoop == true)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Would you like to change the details of this project?" +
                    "\n1    -   Set a new deadline" +
                    "\n2    -   New email address" +
                    "\n3    -   Mark project as finalized");
            int user = input.nextInt();

            if(user == 1)
            {
                System.out.println("Please enter the new deadline for this project: ");
                String newDeadLine = input.nextLine();
                tempProject.deadLine = newDeadLine;
            }
            else if(user == 2)
            {
                System.out.println("Please enter a new email address: ");
                float newFee = input.nextFloat();
                tempProject.feeToDate = newFee;
            }
            else if(user == 3)
            {
                String newFinal = "Yes";
                tempProject.fin = newFinal;
            }
        }
    }
}
