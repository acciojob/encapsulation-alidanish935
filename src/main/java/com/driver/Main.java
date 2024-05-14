package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly r = new RWOnly();
    //r.name ="danish";
    r.setName("danish");
    System.out.println(r.getName());
  }
}