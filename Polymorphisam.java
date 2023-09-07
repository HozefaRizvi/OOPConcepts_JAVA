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