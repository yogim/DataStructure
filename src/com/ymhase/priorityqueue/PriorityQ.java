package com.ymhase.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class StudentComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		if (s1.cgpa < s2.cgpa)
			return -1;
		else if (s1.cgpa > s2.cgpa)
			return 1;
		return 0;
	}
}

class Student {
	public String name;
	public double cgpa;

	public Student(String name, double cgpa) {
		this.name = name;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return this.name + "---" + this.cgpa;
	}

}

public class PriorityQ {

	public static void main(String[] args) {

		PriorityQueue<Student> p = new PriorityQueue<>(10, new StudentComparator());

		p.add(new Student("abcd", 3));
		p.add(new Student("xyz", 2));

		while (!p.isEmpty()) {

			System.out.println(p.poll().toString());
		}

	}

}
