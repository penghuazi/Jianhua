package com.test;

import java.util.Random;

public class Singleton{
	  private Singleton(){
	    generator = new Random();
	  }
	  public void setSeed(int seed){
	    generator.setSeed(seed);
	  }
	  public int nextInt(){
	    return generator.nextInt();
	  }
	  public static synchronized Singleton getInstance(){
	    if (instance == null) {
	      instance = new Singleton();
	    }
	    return instance;
	  }
	  private Random generator;
	  private static Singleton instance;
	}
	