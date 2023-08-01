
package com.mycompany.lifeobj;
public class NewPlayer1 extends Movements
{
    public  NewPlayer1(int i)
    {
        this.sp=i;
    }
    @Override
    public void MoveUp()
    {
        System.out.println("Moved up");
    }
    @Override
     public void MoveDown()
    {
         System.out.println("Moved down");
    }
    @Override
      public void MoveLeft()
    {
        System.out.println("Moved left"); 
    }
    @Override
       public void MoveRight()
    {
        System.out.println("Moved right");
    }
}
