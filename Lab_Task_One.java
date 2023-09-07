/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_task_one;

/**
 *
 * @author fa20-bse-019
 */

//Main Class
public class Lab_Task_One {
    public static void main(String[] args) {
      System.out.println("\nAbstraction COncepts:\n");
      EngineeringDepartmentStudent std1 = new ComputerScience();
      std1.label_student_data();
      std1.student_name();
      std1.student_department();
      
      //Interface
      System.out.println("\nInterface COncepts:\n");
      StudentData std2 = new StudentData();
      std2.student_reg();;
      std2.stuent_department();
      System.out.println("Student Name : \t"+std2.student_id);
      System.out.println("Student Name : \t"+std2.student_name);
      
      //Encapsulation
      System.out.println("\nEncapsulation COncepts:\n");
      EmployeData ep1 = new EmployeData();
      ep1.setEmploye_id(1);
      ep1.setEmploye_name("Qazi Samii");
      System.out.println("Employe ID : \t"+ep1.getEmploye_id());
      System.out.println("Employe Name : \t"+ep1.getEmploye_name());   
      
      //Inheritence
      System.out.println("\nINheritence Concepts:\n");
      ChildrenClass cd1 = new ChildrenClass(5,5,5);
      cd1.SumofThree();
      
      //Polymorphisam
      
      //MethodOVerloading
       Calculation c1 = new Calculation();
       System.out.println("Sum with two paramater: \t"+c1.sum(10, 20));
       System.out.println("Sum with three paramater: \t"+c1.sum(10, 20,30));
       System.out.println("Sum with three paramater: \t"+c1.sum(11, 10));
      //MEthodOverriding
      
      SuperClass s1 = new SuperClass();
      System.out.println("Subtraction in parent \t"+s1.subtract(2,1));
      newchild s2 = new newchild();
      System.out.println("Subtraction in child \t"+s2.subtract(3,1));
      
      
    }

   
    
}
