package com.sun.jna.examples;

import com.sun.jna.Library;
import com.sun.jna.Native;

public class CPPLibtest {
    public interface CLibrary extends Library{
      CLibrary instance =
          Native.load("jnalsw", CLibrary.class);
      int add(int a, int b);
      int minus(int a, int b);
    }
   public static void main(String[] args) {
        Integer i=CLibrary.instance.add(1,2);
        Integer j=CLibrary.instance.minus(10,1);
	System.out.println(i);
    System.out.println(j);
    }
}

