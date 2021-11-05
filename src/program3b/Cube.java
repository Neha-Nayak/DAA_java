package program3b;

import java.util.*;
class Cube implements Runnable
{
 public int x;
 public Cube (int x){
 this.x=x;
 }
 public void run(){
 System.out.println("From third thread-Cube of" + x + " is: " +x*x*x);
 }
}