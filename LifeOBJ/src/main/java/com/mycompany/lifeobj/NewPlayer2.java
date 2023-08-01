
package com.mycompany.lifeobj;
public class NewPlayer2 extends Movements
{
    public  NewPlayer2(int i)
    {
        this.sp=i;
    }
    @Override
    public void MoveUp()
    {
        System.out.println("Moved down");
    }
    @Override
     public void MoveDown()
    {
         System.out.println("Moved up");
    }
    @Override
     public void MoveRight()
    {
        System.out.println("Moved right"); 
    }
    @Override
       public void MoveLeft()
    {
        System.out.println("Moved left");
    }
}
