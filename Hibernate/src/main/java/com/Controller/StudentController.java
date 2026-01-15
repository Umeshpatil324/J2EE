package com.Controller;

import java.util.Scanner;

import com.Service.StudentService;


public class StudentController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n1.Insert  2.Update  3.Delete  4.Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter City: ");
                    String city = sc.next();
                    service.insertData(name, city);
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int uid = sc.nextInt();
                    System.out.print("Enter New Name: ");
                    String uname = sc.next();
                    System.out.print("Enter New City: ");
                    String ucity = sc.next();
                    service.updateData(uid, uname, ucity);
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();
                    service.deleteData(did);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}































































































