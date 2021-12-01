package edu.java.set03;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetMain03 {

	public static void main(String[] args) {
		
		//정수(Integer)를 저장할 수 있는 HashSet을 만들어라
		
		Set<Integer> set= new HashSet<>();
		
		//0 ~ 9 정수를 난수로 생성해서 set에 추가
		Random ran=new Random();
		
		
		while(true) {
			if(set.size()>=5) {
				break;
			}
			double random=(Math.random()*9)+1;
			
			set.add((int)random);
			
		}
		
		System.out.println(set);
	}
}
