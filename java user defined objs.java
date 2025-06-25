package com.practise.eight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

//rev ls of stngs
public class CommonInvt {

	private int empId;
	private String empName;
	private double salary;
	private String city;
	private String dept;

	public CommonInvt(int empId, String empName, double salary, String city, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.city = city;
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, dept, empId, empName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommonInvt other = (CommonInvt) obj;
		return Objects.equals(city, other.city) && Objects.equals(dept, other.dept) && empId == other.empId
				&& Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "CommonInvt [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", city=" + city
				+ ", dept=" + dept + "]";
	}

	public static void main(String[] args) {

		List<CommonInvt> emp = Arrays.asList(new CommonInvt(14521, "mamasrirama", 90000, "ayodhya", "HR"),
				new CommonInvt(145219, "attaseetamma", 99000, "ayodhya", "TESTING"),
				new CommonInvt(14221, "hanuma", 89000, "tirumala", "ACCOUNTS"),
				new CommonInvt(142021, "mamalaxamanudu", 8000, "tirupathi", "ACCOUNTS"),
				new CommonInvt(124521, "mamabharatudu", 18000, "tirupathi", "HR"),
				new CommonInvt(145121, "mamasathrugnudu", 12000, "ayodhya", "ACCOUNTS"),
				new CommonInvt(145214, "valmikimaharshigaru", 22000, "karnataka", "TESTING"),
				new CommonInvt(14251, "rushyasrungamaharshigaru", 7000, "srungeri", "ACCOUNTS"));


		//find all the emp from spec city get count
//		emp
//		.stream()
//		.filter(f->f.getCity().equals("ayodhya"))
//		.forEach(System.out::println);
//	
//	
//		long count = emp
//		.stream()
//		.filter(f->f.getCity().equals("ayodhya"))
//		.count();
//		System.out.println(count);
//	
	
	
		//find all the emp where sal > particlr val
//		emp
//		.stream()
//		.filter(f->f.getSalary()>=7000)
//		.forEach(System.out::println);
		
		//print all emp name in upper case and alphabetical order
//		emp
//		.stream()
//		.map(m->m.getEmpName().toUpperCase())
//		.sorted()
//		.forEach(System.out::println);
		
		
		//get 1st emp where dept is hr and of nt ava throw ex
		
//		  CommonInvt elseThrow = emp
//		.stream()
//		.filter(f->f.getDept().equals("HR"))
//		.findFirst()
//		.orElseThrow(()->new NoSuchElementException("not fnd"));
//		  System.out.println(elseThrow);
		
		//get total sal of emp in spec dept
//		Double collect = emp
//		.stream()
//		.filter(f->f.getDept().equals("HR"))
//		.collect(Collectors.summingDouble(CommonInvt::getSalary));
//		System.out.println(collect);
		
		//check if all the emp have a sal > spec val retunr booln
//		boolean allMatch = emp
//		.stream()
//		 .allMatch(f->f.getSalary()>=7000);
//		System.out.println(allMatch);
		
		//get sum of salaries of all emps and avaerga salary
//		Double sum = emp
//		.stream()
//		.collect(Collectors.summingDouble(CommonInvt::getSalary));
//		System.out.println(sum);
//		
//		Double avg = emp
//				.stream()
//				.collect(Collectors.averagingDouble(CommonInvt::getSalary));
//	
//		System.out.println(avg);
	
		//get map of ep names and their sala
//		Map<String, Double> collect = emp
//		.stream()
//		.collect(Collectors.toMap(m->m.getEmpName(), m->m.getSalary()));
//		
//		collect.forEach((key,value) ->{
//			System.out.println(key +"\t" +value);
//		});
		
		//print emp det from hig to low sal
//		emp
//		.stream()
//	    .sorted(Comparator.comparing(CommonInvt::getSalary).reversed())
//	    .forEach(System.out::println);
		
		//get empees with highes salary
		//this method retunrs only one higehes sal which is not recommended
		
//		Optional<CommonInvt> max = emp
//		.stream()
//		.max(Comparator.comparing(CommonInvt::getSalary));
//		
//		if (max.isPresent()) {
//			System.out.println(max);
//		}
//		
		//this is recomeded
		//get highest sal
//	double max = emp.stream()
//	.mapToDouble(CommonInvt::getSalary)
//	.max()
//	.getAsDouble();
//	
//	//filter emp with that sal
//	
//	emp.stream()
//	.filter(f->f.getSalary()==max)
//	.forEach(System.out::println);
	
	
	//Q) get 2nd hishes sal
//		Double double1 = emp.stream()
//		.map(CommonInvt::getSalary)
//		.sorted((sal1,sal2)->sal2.compareTo(sal1))//desc order
//		.skip(1)
//		.findFirst()
//		.get();
//		System.out.println(double1);
//		
//		//filter emp with sec hih sal
//		emp.stream()
//		.filter(f->f.getSalary()==double1)
//		.forEach(System.out::println);
//		
		
		//get emp who are earng abpve avg sal
		//get avg sal
//		Double collect = emp.stream()
//		.collect(Collectors.averagingDouble(CommonInvt::getSalary));
//		System.out.println(collect);
//		//filter emp havg sal>avg
//		emp.stream()
//		.filter(f->f.getSalary()>collect)
//		.forEach(System.out::println);
		
		//get emp with longest name
//		 Optional<CommonInvt> max = emp.stream()
//		.max(Comparator.comparingInt(e->e.empName.length()));
//		 if (max.isPresent()) {
//			 System.out.println(max);
//		}
		 
		//Q)list all emp by dept
//		Map<String, List<CommonInvt>> collect = emp
//		.stream()
//		.collect(Collectors.groupingBy(CommonInvt::getDept));
//		
//		collect.forEach((dept,emps)->{
//			System.out.println("Departement "+dept);
//			emps.forEach(System.out::println);
//		});
		
		//Q)get count of emp by dept
//          emp.stream()
//		.collect(Collectors.groupingBy(CommonInvt::getDept,Collectors.counting()))
//		.forEach((dept,count)->System.out.println(dept+" "+count));
		
		//Q)get sum of sal of all emp by dept
//	 emp.stream()
//		.collect(Collectors.groupingBy(CommonInvt::getDept,
//				Collectors.summingDouble(CommonInvt::getSalary)))
//		.forEach((dept,sal)->System.out.println(dept+"\t"+sal));
//		
		//Q)get avg sal of all emp per dept
		
//		emp.stream()
//		.collect(Collectors.groupingBy(CommonInvt::getDept,
//				Collectors.averagingDouble(CommonInvt::getSalary)))
//		.forEach((dept,sal)->System.out.println(dept+"\t"+sal));
//	
	
	//Q) check if all emps belong to specf dept 
		
//		boolean allMatch = emp.stream()
//		.allMatch(m->m.getDept().equals("HR"));
//		System.out.println(allMatch);
	
	//Q)list all emp grp by vities but belong to same dept
//		
//		Map<String, List<CommonInvt>> empDept = emp.stream()
//		.collect(Collectors.groupingBy(CommonInvt::getDept));
//		empDept.forEach((dept,empList)->{
//			System.out.println("Department "+dept);
//			empList.stream()
//			.collect(Collectors.groupingBy(CommonInvt::getCity))
//			.forEach((city,emps)->{
//				System.out.println("city "+city);
//				emps.forEach(empl->System.out.println("Emp Name "+empl.getEmpName()));
//			});
//			
//		
//		});
//	
	
	//Q) find dept with highest avg sal
		Map<String, Double> empMap = emp.stream()
		.collect(Collectors.groupingBy(CommonInvt::getDept,
				Collectors.averagingDouble(CommonInvt::getSalary)));
		System.out.println(empMap);
	
	String key = empMap.keySet().stream()
	.max(Comparator.comparing(dept->empMap.get(dept)))
	.get();
	
	Double highest = empMap.get(key);
	System.out.println(highest);
	
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
