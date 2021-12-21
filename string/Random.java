package com.string;

public class Random {
public static void main(String[]args) {
int min=1;
int max=100;


System.out.println("Random value in int from "+min+" to "+max+ ":");
int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
System.out.println(random_int);

}
}
