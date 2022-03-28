package company.driver;

import company.department.*;

public class Main {
      
	public static void main(String[] args) {
		SuperDept admin=new AdminDept();
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
				
		SuperDept hr=new HrDept();
		HrDept hrd=new HrDept();
		System.out.println('\n'+hr.departmentName());
		System.out.println(hrd.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());	
		System.out.println(hr.isTodayAHoliday());
		
		SuperDept tech=new TechDept();
		TechDept td=new TechDept();
		System.out.println('\n'+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());		
	}

}
