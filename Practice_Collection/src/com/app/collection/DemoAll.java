package com.app.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class DemoAll {

	public static void main(String[] args) {
		
		Set<Integer> s1=new HashSet<Integer>();
//		s1.add(12);
//		s1.add(10);
//		s1.add(20);
//		s1.add(9);
//		s1.add(11);
		for(int i=12;i<=17;i++) {
			s1.add(i);
		}
		System.err.println("============SET============");
		System.out.println("=======HashSet=======");
		s1.iterator().forEachRemaining(k -> System.out.print(k+" "));
//		s1.spliterator().forEachRemaining(ch -> System.out.print(ch+" "));
//		s1.forEach(k-> System.out.print(k+" "));
	
		Set<Integer> s2=new LinkedHashSet<Integer>();
		s2.add(12);
		s2.add(10);
		s2.add(20);
		s2.add(9);
		s2.add(11);
		System.out.println("\n=======LinkedHashSet=======");
		s2.iterator().forEachRemaining(k -> System.out.print(k+" "));
//		s2.spliterator().forEachRemaining(ch -> System.out.print(ch+" "));
//		s2.forEach(k-> System.out.print(k+" "));
		
		Set<Integer> s3=new TreeSet<Integer>();
		s3.add(12);
		s3.add(10);
		s3.add(20);
		s3.add(9);
		s3.add(11);
		System.out.println("\n=================TreeSet===================");
		s3.iterator().forEachRemaining(k -> System.out.print(k+" "));
//		s3.spliterator().forEachRemaining(ch -> System.out.print(ch+" "));
//		s3.forEach(ch -> System.out.print(ch+" "));
		
		System.err.println("\n==============LIST==============");
		System.out.println("\n================ARRAYLIST================");
		List<Integer> a1=new ArrayList<Integer>();
		a1.add(12);
		a1.add(10);
		a1.add(20);
		a1.add(9);
		a1.add(11);
		a1.iterator().forEachRemaining(k-> System.out.print(k+" "));
//		a1.spliterator().forEachRemaining(k-> System.out.print(k+" "));
//		a1.listIterator().forEachRemaining(k->System.out.print(k+" "));
		
		System.out.println("\n================LINKEDLIST================");
		List<Integer> a2=new LinkedList<Integer>();
		a2.add(12);
		a2.add(10);
		a2.add(20);
		a2.add(9);
		a2.add(11);
		a2.iterator().forEachRemaining(k-> System.out.print(k+" "));
//		a2.spliterator().forEachRemaining(k-> System.out.print(k+" "));
//		a2.listIterator().forEachRemaining(k->System.out.print(k+" "));
		
		System.out.println("\n================VECTOR================");
		List<Integer> a3=new Vector<Integer>();
		a3.add(12);
		a3.add(10);
		a3.add(20);
		a3.add(9);
		a3.add(11);
		a3.iterator().forEachRemaining(k-> System.out.print(k+" "));
//		a3.spliterator().forEachRemaining(k-> System.out.print(k+" "));
//		a3.listIterator().forEachRemaining(k->System.out.print(k+" "));
		
		System.err.println("\n================QUEUE================");
		System.out.println("\n================PRIORITYQUEUE================");
		Queue<Integer> q1=new PriorityQueue<Integer>();
		q1.add(4);
		q1.add(5);
		q1.add(3);
		q1.add(1);
		q1.add(2);
		q1.iterator().forEachRemaining(k->System.out.print(k+" "));
		q1.spliterator().forEachRemaining(k -> System.out.print(k+" "));
		q1.forEach(k-> System.out.print(k+" "));
		
		System.out.println("\n================ARRAYDEQUEUE================");
		Queue<Integer> q2=new ArrayDeque<Integer>();
		q2.add(12);
		q2.add(10);
		q2.add(20);
		q2.add(9);
		q2.add(11);
		q2.iterator().forEachRemaining(k->System.out.print(k+" "));
		q2.spliterator().forEachRemaining(k -> System.out.print(k+" "));
		q2.forEach(k-> System.out.print(k+" "));
	}

}
