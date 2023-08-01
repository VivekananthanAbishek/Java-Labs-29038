
package com.mycompany.lifeobj;
public class NewPlayer3 extends Movements
{
    public  NewPlayer3(int i)
    {
        this.sp=i;
    }
      public void Jump()
   {
       System.out.println("Jumped 5 spaces");
   }
    public void CrouchedJump()
   {
       System.out.println("Jumped 2 spaces");
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
