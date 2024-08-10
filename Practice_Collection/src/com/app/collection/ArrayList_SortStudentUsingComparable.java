package com.app.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Student implements Comparable<Student>{
	private String stdName;
	private int rollNo;
	private int stdAge;
	private String stdGen;
	
	Student(String stdName, int rollNo, int stdAge, String stdGen){
		this.stdName=stdName;
		this.rollNo=rollNo;
		this.stdAge=stdAge;
		this.stdGen=stdGen;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getStdAge() {
		return stdAge;
	}

	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}

	public String getStdGen() {
		return stdGen;
	}

	public void setStdGen(String stdGen) {
		this.stdGen = stdGen;
	}

	//sort by age
	@Override
	public int compareTo(Student stdObj) {
		int compareAge=stdObj.getStdAge();
		return this.getStdAge()-compareAge;		// Ascending Order
	//	return compareAge-this.getStdAge();		// Descending Order
		
	}

	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", rollNo=" + rollNo + ", stdAge=" + stdAge + ", stdGen=" + stdGen + "]";
	}
}

public class ArrayList_SortStudentUsingComparable {
	public static void main(String[] args) {
		ArrayList<Student> std=new ArrayList<Student>();
		std.addAll(Arrays.asList(
				new Student("ABC",101, 23,"Male"),
				new Student("XYZ",102, 11,"Male"),
				new Student("LMN",103, 22,"Female"),
				new Student("KLM",104, 28,"Male"),
				new Student("CAB",105, 14,"Female"),
				new Student("BCA",106, 33,"Female"),
				new Student("MCA",107, 26,"Male")
			));
		
	
			Collections.sort(std);
			for(Student st : std) {
				System.out.println(st);
			}
	}
}
