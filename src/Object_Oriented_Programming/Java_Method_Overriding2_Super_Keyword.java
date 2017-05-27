package Object_Oriented_Programming;
import java.util.*;
import java.io.*;

/**
 * Created by bvpham on 5/27/2017.
 */

class BiCycle{
    String define_me(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am " + define_me());

        String temp=super.define_me();


        System.out.println("My ancestor is a cycle who is " + temp);
    }

}
public class Java_Method_Overriding2_Super_Keyword {
    public static void main(String[] args){
        MotorCycle M = new MotorCycle();
    }
}
