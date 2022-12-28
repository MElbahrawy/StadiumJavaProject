package MohamedElbahrawy;

import java.util.ArrayList;
import java.util.Scanner;

public class AlAhlyStadium {

    public static void main(String[] args) {

        // Variables
        Scanner input = new Scanner(System.in);
        int choice, Sec1Counter = 0, Sec2Counter = 0, Sec3Counter = 0, NoOfTickets;
        String FindID, answer;
        boolean exist = false, repeat = true;
        Sec1Booking[] sec1 = new Sec1Booking[100];
        Sec2Booking[] sec2 = new Sec2Booking[250];
        Sec3Booking[] sec3 = new Sec3Booking[650];
        ArrayList<Manger> Match = new ArrayList<Manger>(10);

        // Program User Interface
        System.out.println("-----------------------------------");
        System.out.println("Welcome to Mokhtar El Tetsh Stadium");
        while (repeat) {
            System.out.println("-----------------------------------");
            System.out.println("Choose which Program to start :-");
            System.out.println("[1] Add Match to the list");
            System.out.println("[2] List All Upcoming Matches");
            System.out.println("[3] List All My Tickets");
            System.out.println("[4] List My Info");
            System.out.println("[5] Book Seats");
            System.out.println("[6] Cancel a Booked Seat");
            System.out.println("[7] Exit");

            do { // Choosing the Program
                System.out.print("Your choose : ");
                choice = input.nextInt();
                if (0 > choice || choice > 7)
                    System.out.println("Invalid Input");
                if (choice == 7) {
                    break;
                }
            } while (0 > choice || choice > 7);

            if (choice == 7)
                break;

            switch (choice) {

                case 1: // Add Matches
                    String AdminUser, Adminpass;
                    System.out.println("\nLogin As An admin");
                    do {
                        System.out.print("Username : ");
                        AdminUser = input.next();
                        if (!AdminUser.equals("Mohamed"))
                            System.out.println("Wrong username!");
                    } while (!AdminUser.equals("Mohamed"));
                    do {
                        System.out.print("Password : ");
                        Adminpass = input.next();
                        if (!Adminpass.equals("1234"))
                            System.out.println("Wrong password!");
                    } while (!Adminpass.equals("1234"));
                    System.out.println("Welcome back Mohamed :)");
                    String SecondTeam, Tournment, day, month, year, Matchdate, MatchAt;
                    System.out.print("\nSecond team :");
                    SecondTeam = input.next();
                    System.out.print("\nTournment :");
                    Tournment = input.next();
                    System.out.print("\nMatch Day : ");
                    day = input.next();
                    System.out.print("\nMatch Month : ");
                    month = input.next();
                    System.out.print("\nMatch Year : ");
                    year = input.next();
                    Matchdate = day + " " + month + " " + year;
                    System.out.print("Match At : ");
                    MatchAt = input.next();
                    Match.add(new Manger("Al Ahly", SecondTeam, Tournment, Matchdate, MatchAt));
                    System.out.println("Match Added Succesfully");
                    break;
                case 2: // List All Upcoming Matches
                    Match.add(
                            new Manger("Al Ahly", "Real Madrid", "FIFA Club World Cup Final", "11 FEB 2023", "09:00"));
                    Match.add(new Manger("Al Ahly", "Mamelodi Sundowns", "CAF Champions League Final", "2 JUN 2023",
                            "10:00"));
                    Match.add(new Manger("Al Ahly", "Zamalek", "Egyptian Premier League", "27 NOV 2023", "09:00"));
                    Match.add(new Manger("Al Ahly", "Pyramids", "Egypt Cup Semi-Final", "21 MAR 2023", "07:00"));
                    System.out.print(Match.toString().replace("[", "").replace("]", "").replace(",", ""));
                    break;

                case 3: // List All My Tickets
                    if (Sec1Counter == 0 && Sec2Counter == 0 && Sec3Counter == 0)
                        System.out.println("\nNo Booked Tickets yet.");
                    for (int i = 0; i < Sec1Counter; i++) {
                        System.out.println(sec1[i].toString());
                    }
                    for (int i = 0; i < Sec2Counter; i++) {
                        System.out.println(sec2[i].toString());
                    }
                    for (int i = 0; i < Sec3Counter; i++) {
                        System.out.println(sec3[i].toString());
                    }
                    break;

                case 4: // List My Info
                    if (Sec1Counter == 0 && Sec2Counter == 0 && Sec3Counter == 0)
                        System.out.println("\nThere is no Information To Show");
                    else {
                        System.out.println("Enter the Id to Cancel the ticket ");
                        System.out.print("The ID : ");
                        FindID = input.next();
                        for (int i = 0; i < Sec1Counter; i++) {
                            // Search if the Entered Id is exist in Sec 1
                            if (FindID.equals(sec1[i].GetID())) {
                                exist = true;
                                System.out.println("\n[" + sec1[i].GetID() + "]" + sec1[i].PersonInfo());
                            }
                        }
                        for (int i = 0; i < Sec2Counter; i++) {
                            // Search if the Entered Id is exist in Sec 2
                            if (FindID.equals(sec2[i].GetID())) {
                                exist = true;
                                System.out.println("\n[" + sec2[i].GetID() + "]" + sec2[i].PersonInfo());
                            }
                        }
                        for (int i = 0; i < Sec3Counter; i++) {
                            // Search if the Entered Id is exist Sec 3
                            if (FindID.equals(sec3[i].GetID())) {
                                exist = true;
                                System.out.println("\n[" + sec3[i].GetID() + "]" + sec3[i].PersonInfo());
                            }
                        }
                        if (!exist) {
                            System.out.println("There is no information for this id");
                        }
                    }
                    break;

                case 5: // Book Seats
                    System.out.print("\nhow many Tickets you want to book : ");
                    NoOfTickets = input.nextInt();
                    int TotalPrice = 0;
                    for (int i = 0; i < NoOfTickets; i++) {
                        System.out.println("Ticket[" + (i + 1) + "]");
                        System.out.print("Enter your Name : ");
                        String name = input.next();
                        System.out.print("\nEnter your ID : ");
                        String id = input.next();
                        System.out.println("Which Section do you want? :- ");
                        System.out.println("[1] Section A");
                        System.out.println("[2] Section B");
                        System.out.println("[3] Section C");
                        System.out.print("Your choose : ");
                        int section = input.nextInt();
                        if (section == 1) {
                            if (Sec1Counter < 100) {
                                sec1[Sec1Counter] = new Sec1Booking(name, id);
                                TotalPrice += sec1[Sec1Counter].getPrice();
                                Sec1Counter++;
                            } else if (Sec1Counter == 100)
                                System.out.println("All Seats in this section are taken");
                        } else if (section == 2) {
                            if (Sec2Counter < 250) {
                                sec2[Sec2Counter] = new Sec2Booking(name, id);
                                TotalPrice += sec2[Sec2Counter].getPrice();
                                Sec2Counter++;
                            } else if (Sec2Counter == 250)
                                System.out.println("All Seats in this section are taken");
                        } else if (section == 3) {
                            if (Sec3Counter < 650) {
                                sec3[Sec3Counter] = new Sec3Booking(name, id);
                                TotalPrice += sec3[Sec3Counter].getPrice();
                                Sec3Counter++;
                            } else if (Sec3Counter == 650)
                                System.out.println("All Seats in this section are taken");
                        }
                        System.out.println("Ticket Booked");
                        System.out.println("---------------------");
                    }
                    System.out.println("Total Price is $" + TotalPrice);
                    break;
                case 6: // Cancel a Booked Seat
                    if (Sec1Counter == 0 && Sec2Counter == 0 && Sec3Counter == 0)
                        System.out.println("\nThere is no Booked Ticket");
                    else {
                        System.out.println("Enter the Id to Cancel the ticket ");
                        System.out.print("The ID : ");
                        FindID = input.next();
                        for (int i = 0; i < Sec1Counter; i++) {
                            // Search if the Entered Id is exist in Sec 1 then delete it
                            if (FindID.equals(sec1[i].GetID())) {
                                sec1[i] = null;
                                Sec1Counter--;
                                System.out.println("Canceled Successfuly");
                            }
                        }
                        for (int i = 0; i < Sec2Counter; i++) {
                            // Search if the Entered Id is exist in Sec 2 then delete it
                            if (FindID.equals(sec2[i].GetID())) {
                                sec2[i] = null;
                                Sec2Counter--;
                                System.out.println("Canceled Successfuly");
                            }
                        }
                        for (int i = 0; i < Sec3Counter; i++) {
                            // Search if the Entered Id is exist Sec 3 then delete it
                            if (FindID.equals(sec3[i].GetID())) {
                                sec3[i] = null;
                                Sec3Counter--;
                                System.out.println("Canceled Successfuly");
                            }
                        }
                    }
                    break;
            }

            System.out.print("\nDo You want to repeat this program ? (Y/N) : ");
            answer = input.next();
            if (answer.equalsIgnoreCase("n"))
                repeat = false;
        }
        System.out.println("Thank for using my Program :)");
    }
}