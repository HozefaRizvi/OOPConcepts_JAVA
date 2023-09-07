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
