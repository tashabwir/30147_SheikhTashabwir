package design;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo E1 = new EmployeeInfo("Adam", 111, "QA", 100000);
		EmployeeInfo E2 = new EmployeeInfo("Tasha",222,"Dev",80000.00);

		System.out.println(E1.getName() );
		System.out.println(E1.getEmployeeId());
		System.out.println(E1.getSalary());
		System.out.println();

		E2.setSalary(120000);
		System.out.println( E2.getName() );
		System.out.println(E2.getEmployeeId());
		System.out.println(E2.getSalary());

		System.out.println(EmployeeInfo.calculateEmployeeBonus(3, (int) E2.getSalary()));

		E1.calculateEmployeePension();



	}

}
