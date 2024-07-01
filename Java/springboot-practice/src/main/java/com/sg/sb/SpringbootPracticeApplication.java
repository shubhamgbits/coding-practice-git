package com.sg.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

@SpringBootApplication
public class SpringbootPracticeApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringbootPracticeApplication.class, args);

//		PriorityQueue<Integer> pq = new PriorityQueue<>(
//		);
//
//		pq.add(11);
//		pq.add(10);
//		pq.add(22);
//		pq.add(5);
//		pq.add(12);
//		pq.add(2);
//
//
//		while (!pq.isEmpty())
//			System.out.printf("%d",pq.remove());
//		System.out.printf("\n");
		char empty = '*';
		char star = ' ';
		int length = 51;
		char[] str = new char[length];

		Arrays.fill(str, empty);
//		System.out.println(Arrays.toString(str));
		int limit = length%2==0?length/2:length/2+1;
		for(int i=0;i<limit;i++){
			char[] strCopy = Arrays.copyOf(str,length);

			Arrays.fill(strCopy, i, length-i,star);

			System.out.println(String.copyValueOf(strCopy));
		}

	}

}
