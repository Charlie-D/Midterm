package com.cisc181.core;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public void testStaffAverageSalery() throws PersonException {
		ArrayList<Staff> TestStaff = new ArrayList<Staff>();
		Staff A = new Staff("Yiqian", "Charlie", "Du", new Date(1997, 2, 02), "17 Yale Drive, Newark, DE",
				"3026688988", "yiqian@udel.edu", "None", 1, 5000.00, new Date(2012, 1, 3), eTitle.MS);
		TestStaff.add(A);

		Staff B = new Staff("Youwei", "Ryan", "Cai", new Date(1997, 3, 03),
				"250 south main ST, DE", "3025091223", "cai@udel.edu", "None", 2, 4000.00,
				new Date(2010, 1, 1), eTitle.MS);
		TestStaff.add(B);

		Staff C = new Staff("Zimo", "Osmond", "Zuo", new Date(1996, 11, 05), "250 south main St, Newark, DE",
				"3026699321", "carina.christenbury@gmail.com", "None", 3, 3000.00, new Date(2000, 1, 1), eTitle.MS);
		TestStaff.add(C);

		Staff D = new Staff("Changcheng", "CC", "Liu", new Date(1995, 10, 02),
				"250 south main St, Newark, DE", "3026683221", "ccliu@udel.edu", "None", 4, 2000.00,
				new Date(2010, 1, 1), eTitle.MS);
		TestStaff.add(D);

		@SuppressWarnings("deprecation")
		Staff E = new Staff("Haoqi", "Heidi", "Feng", new Date(1998, 9, 23),
				"250 south main St, Newark, DE", "3025091890", "Heidi777@udel.edu", "None", 5, 1000.00,
				new Date(2011, 1, 1), eTitle.MS);
		TestStaff.add(E);

			double totalSalary = 0;
			for (Staff s : TestStaff) {
				totalSalary += s.getSalary();
			}
			totalSalary /= 5;

			int t = (int) totalSalary;

			assertEquals(t, 3000);
		}
	
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	

}
