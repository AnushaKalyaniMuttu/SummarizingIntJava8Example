package com.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Anagram {
	public static void main (String [] args) {
		int arr[]= {1,1,2,2,5,6,9,12,12,13};
	List<Integer> list= IntStream.of(arr).boxed().map(i->Integer.valueOf(i)).collect(Collectors.toList());
list=	list.stream().distinct().filter(i->i<10).collect(Collectors.toList());

 double average=list.stream().map(i->i*i).collect(Collectors.summarizingInt(Integer::intValue)).getAverage();
 double count=list.stream().map(i->i*i).collect(Collectors.summarizingInt(Integer::intValue)).getCount();
 double max=list.stream().map(i->i*i).collect(Collectors.summarizingInt(Integer::intValue)).getMax();
 double min=list.stream().map(i->i*i).collect(Collectors.summarizingInt(Integer::intValue)).getMin();
 double sum=list.stream().map(i->i*i).collect(Collectors.summarizingInt(Integer::intValue)).getSum();

 System.out.println(average);
 System.out.println(count);
 System.out.println(max);
 System.out.println(min);
 System.out.println(sum);

	}
	

}
