package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		try {
			Student A = new Student("Yiqian", "Charlie", "Du", new Date(1997, 02, 02), eMajor.COMPSI, "17 Yale Drive, Newark, DE","3026688988", "yiqian@udel.edu");
			
			Student B = new Student("Youwei", "Ryan", "Cai", new Date(1997, 03, 03), eMajor.COMPSI, "250 south main ST, DE", "3025091223", "cai@udel.edu");			

			Student C = new Student("Zimo", "Osmond", "Zuo", new Date(1996, 11, 05), eMajor.BUSINESS, "250 south main St, Newark, DE","3026699321", "carina.christenbury@gmail.com");
			
			Student D = new Student("Changcheng", "CC", "Liu", new Date(1995, 10, 02), eMajor.PHYSICS, "250 south main St, Newark, DE", "3026683221", "ccliu@udel.edu" );
			
			Student E = new Student("Haoqi", "Heidi", "Feng", new Date(1998, 9, 23), eMajor.BUSINESS, "250 south main St, Newark, DE", "3025091890", "Heidi777@udel.edu");
			
			
			ArrayList<Student> TestStudent = new ArrayList<Student>();
			TestStudent.add(A);
			TestStudent.add(B);
			TestStudent.add(C);
			TestStudent.add(D);
			TestStudent.add(E);
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}