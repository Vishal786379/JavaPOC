package com.citiustech.my;

import java.util.Scanner;

public class MyScan {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mainChoice;

        do {
            System.out.println("-----------------Please Select Your Role-----------");
            System.out.println("1. Admin");
            System.out.println("2. Student");
            System.out.println("0. Exit");
            System.out.println("------------------------------------------------------------");
            System.out.print("Enter Your choice: ");
            mainChoice = scanner.nextInt();
            System.out.println("------------------------------------------------------------");

            switch (mainChoice) {
                case 1:
                    int adminChoice;
                    do {
                        System.out.println("----------------Admin Operation------------");
                        System.out.println("1. Create Exam");
                        System.out.println("2. Delete Exam");
                        System.out.println("3. Update Exam");
                        System.out.println("4. Get all Exam");
                        System.out.println("5. Get Exam by ID");
                        System.out.println("6. Add student");
                        System.out.println("7. Delete Student");
                        System.out.println("8. Update student");
                        System.out.println("9. Get All students List");
                        System.out.println("10. Get student by Roll Number");
                        System.out.println("11. Get Consolidated Students Report card");
                        System.out.println("12. Get Single student report card by ID");
                        System.out.println("13. Add Question in Exam");
                        System.out.println("14. Update Question in Exam");
                        System.out.println("15. Delete Question from exam");
                        System.out.println("16. Display all Questions from Exam.");
                        System.out.println("0. Exit");
                        System.out.println("------------------------------------------------------------");
                        System.out.print("Enter Your choice: ");
                        adminChoice = scanner.nextInt();
                        System.out.println("------------------------------------------------------------");

                        // Perform admin operations based on the choice

                        switch (adminChoice) {
                            case 1:
                                System.out.println("Creating Exam...");
                                // Perform create exam operation
                                break;
                            case 2:
                                System.out.println("Deleting Exam...");
                                // Perform delete exam operation
                                break;
                            case 3:
                                System.out.println("Updating Exam...");
                                // Perform update exam operation
                                break;
                            case 4:
                                System.out.println("Getting all Exams...");
                                // Perform get all exams operation
                                break;
                            case 5:
                                System.out.println("Getting Exam by ID...");
                                // Perform get exam by ID operation
                                break;
                            case 6:
                                System.out.println("Adding Student...");
                                // Perform add student operation
                                break;
                            case 7:
                                System.out.println("Deleting Student...");
                                // Perform delete student operation
                                break;
                            case 8:
                                System.out.println("Updating Student...");
                                // Perform update student operation
                                break;
                            case 9:
                                System.out.println("Getting all Students List...");
                                // Perform get all students list operation
                                break;
                            case 10:
                                System.out.println("Getting Student by Roll Number...");
                                // Perform get student by roll number operation
                                break;
                            case 11:
                                System.out.println("Getting Consolidated Students Report card...");
                                // Perform get consolidated students report card operation
                                break;
                            case 12:
                                System.out.println("Getting Single Student Report card by ID...");
                                // Perform get single student report card by ID operation
                                break;
                            case 13:
                                System.out.println("Adding Question in Exam...");
                                // Perform add question in exam operation
                                break;
                            case 14:
                                System.out.println("Updating Question in Exam...");
                                // Perform update question in exam operation
                                break;
                            case 15:
                                System.out.println("Deleting Question from Exam...");
                                // Perform delete question from exam operation
                                break;
                            case 16:
                                System.out.println("Displaying all Questions from Exam...");
                                // Perform display all questions from exam operation
                                break;
                            case 0:
                                System.out.println("Exiting...");
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                                break;
                        }
                    } while (adminChoice != 0);
                    break;
                case 2:
                    System.out.println("-----------------------Student----------------");
                    System.out.println("Please enter your registered email:");
                    String email = scanner.next();
                    System.out.println("Please enter password provided by admin:");
                    String password = scanner.next();
                    
                    // Perform student operations based on the email and password
                    
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (mainChoice != 0);

        scanner.close();
    }

}
