package com.example.myapp.myapp;
public class App{
public int add(int a, int b){
   return a+b;
}
   public static void main(String args[]){
      App a=new App();
      int result = a.add(10,15);
      System.out.println(result);
   }
}
