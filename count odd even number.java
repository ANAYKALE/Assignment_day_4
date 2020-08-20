/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.Scanner;


/**
 *
 * @author Asus
 */
public class Question {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
      long  num=0,odd=0,even=0,num1 = 0;
      Scanner sc=new Scanner(System.in);
      num=sc.nextLong();
      while(num!=0)
      {
          num1=num%10;
          num/=10;
          if(num1%2==0)
          {
              even++;
          }
          else
          {
              odd++;
          }
      }
      
      System.out.println("Odd digit:"+odd);
      System.out.println("Even digit"+even);
}
    
}
