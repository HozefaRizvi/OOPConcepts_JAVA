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