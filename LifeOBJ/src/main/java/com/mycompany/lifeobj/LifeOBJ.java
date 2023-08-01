
package com.mycompany.lifeobj;
public class LifeOBJ
{

    public static void main(String[] args) 
    {
      NewPlayer1 p1=new NewPlayer1(1);
        p1.MoveUp();
        p1.MoveDown();
        p1.MoveLeft();
        p1.MoveLeft();
        System.out.println("");
        NewPlayer2 P2=new NewPlayer2(1);
        P2.MoveDown();
        P2.MoveUp();
        P2.MoveLeft();
        P2.MoveRight();
        System.out.println("");
        NewPlayer3 p3=new NewPlayer3(1);
        p3.CrouchedJump();
        p3.Jump();
        p3.MoveDown();
        p3.MoveLeft();
        p3.MoveRight();
        p3.MoveUp();
    }
}
