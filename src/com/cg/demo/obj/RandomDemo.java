package com.cg.demo.obj;
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
		Random ran = new Random();
		 int num = ran.nextInt(10001);
		 System.out.println(num);
		}
	}

}
 