package com.simple.exam3;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 배열의 최댓값·최솟값 찾기
		// 난수로 채운 배열에서 최댓값과 최솟값을 찾아 출력하시오.
		int array[] = new int[10];
		
		System.out.println("난수");
		
		for (int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(array));
		
		int max = array[0];
		int min = array[0];
		
		for (int x : array) {
			if (x > max) {
				max = x;
			}
			if (x < min) {
				min = x;
			}
		
		}
		
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);

		
			
		}
		

		
	}


