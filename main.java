/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bvnbuoi5;

import java.util.*;
public class main {
    public static void menu() {
        System.out.println("========================");
        System.out.println("Menu manage class");
        System.out.println("1. Input student");
        System.out.println("2. Show student");
        System.out.println("3. Sort by GPA");
        System.out.println("4. Delete student by ID");
        System.out.println("5. Exit");
        System.out.print("Enter your choose: ");
    }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        classroom classroom= new classroom();
        boolean bd=true;
        while(bd) {
            menu();
            int choose=sc.nextInt();sc.nextLine();
            if(choose==1) {
                classroom.input();
            }
            else if(choose==2) {
                classroom.output();
            }
            else if(choose==3) {
                classroom.sortbyGPA();
            }
            else if(choose==4) {
                System.out.print("Input student ID need remove: ");
                int id=sc.nextInt();
                if(classroom.removeByID(id)) 
                    System.out.println("Remove success!");
                else System.out.println("remove failure");
            }
            else if(choose==5) {
                System.out.println("Exit!");
                bd=false;
            }
        }
    }
}
