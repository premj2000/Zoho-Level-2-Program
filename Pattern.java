//Pattern.java

import java.util.*;
import java.io.*;
class Pattern
{

  public static void display(String str,int n)
  {
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n-i;j++)
            System.out.print(" ");
         for(int k=0;k<i;k++)
            System.out.print(str.charAt(  ((n/2)+(k))%n) );
         System.out.println();
      }
  }
  public static void main(String []args)
  {
    Scanner in=new Scanner(System.in);
    String str;
    System.out.println("Enter the String");
    str=in.nextLine();
    int len=str.length();
    display(str,len);
    }
  }