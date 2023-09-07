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
