Lab Task 1:

Name : Hozefa Hassan Rizvi
Registration: FA20-BSE-019

GitHub Rpositry Link: 

https://github.com/HozefaRizvi/OOPConcepts_JAVA.git

Step 1: 

-I login to my subexpert account 

Step 2: 

-I subscribe to course "Design Pattern"

Step 3: 

-Lab Task One is to go the webiste the link is provided already where we have to study OOP Concepts

Step 4: 

-First concept i study is Abstraction 
   -Data Hiding
   -Suppose you have to drive car buit not to know its internal working
-Second concept i study is Interface 
  -Achieve abstraction
  -BluePrint of Class
-Third COncept i study is Encapsulation
  -protect the internal concept of of class 
  -to implement encapsulation we have to make variables private
-Fourth concept i study is inheritence
   -parentc-child relationship
   -Multiple inheritence is not allowd in JAVA so we use interface concept here 
-Fifth concept i study is polymorphisam 
   -Declare same method with same name with differant characterstics (Method Overloading)
   -You can use the methods of parent class in child class also (Method OverRiding)

Now I learn the Abstraction , Aggregation and composition :

=>Aggregation : 
	-Has-A Relationshoip
	-relation with two classes and association with their object 
=>Association:
	-establishing a relationship between two unrelated classes
	-Two separate classes are associated through their objects
=>Composition:
	-Composition is a stricter form of aggregation. 
	-It occurs when the two classes you associate are mutually dependent and can’t exist without each other.
---------------------------------------------------------------------------CODE--------------------------------------------------------------------------

									Main Class


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
						
										Abstraction class
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

//Abstraction Concept : Data Hiding | Suppose you have to drive car buit not to know its internal working
abstract class EngineeringDepartmentStudent
{
    abstract void student_department();
    abstract void student_name();
    
    void label_student_data()
    {
        System.out.print("Student Data : \n");
    }
}
class ComputerScience extends EngineeringDepartmentStudent
{
    @Override
    void student_name() {
        System.out.print("Name is :\t Hozefa Rizvi\n");
    }

    @Override
    void student_department() {
        System.out.print("Department is :\t ComputerScience\n");
    }
}
								ENcapsulation class
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

class EmployeData 
{
   private int employe_id;
   private String employe_name;

    public int getEmploye_id() {
        return employe_id;
    }

    public void setEmploye_id(int employe_id) {
        this.employe_id = employe_id;
    }

    public String getEmploye_name() {
        return employe_name;
    }

    public void setEmploye_name(String employe_name) {
        this.employe_name = employe_name;
    }

  
}
								INheritence class
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
class ParentClass 
{

    int input1;
    int input2;
    
    public ParentClass(int a , int b)
    {
        this.input1 = a;
        this.input2 = b;
    }
}
class ChildrenClass extends ParentClass
{

    int input3;
    public ChildrenClass(int a, int b , int c ) {
        super(a, b);
        this.input3 = c;
    }
    public void SumofThree()
    {
      System.out.println("Sum is :\t"+(input1+input2+input3));
    }
    
    

}



				


									interface class
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
//Interface Concept: BluePrint of Class | Achieve abstraction

interface Student
{
    public void stuent_department();
    public void student_reg();
}
interface Student_description
{
     int student_id = 1;
     String student_name = "Qazi Rizvi";
}
class StudentData implements Student, Student_description
{

    @Override
    public void stuent_department() {
         System.out.print("Department is :\t Electrical\n");
    }

    @Override
    public void student_reg() {
        System.out.print("Registration is :\t FA20-BSE-008\n");
    }
}
									polymorphisam class

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

//Method OverLoading
class Calculation 
{

    public int sum(int a , int b)
    {
        return a+b;
    }
    public int sum(int a , int b , int c)
    {
        return a+b+c;
    }
    public float sum(float a ,float b)
    {
        return a+b;
    }

}
//MethodOVerriding
class SuperClass
{
    public  int  subtract(int a , int b)  
    {     
        return a+b;
    }
}
 class newchild extends SuperClass
{
    public  int  subtract(int a , int b)  
    {     
        return a+b;
    }
}