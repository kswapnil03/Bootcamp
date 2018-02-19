package com.company;
	
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	
	class Employee {
	    Double age;
	    Double salary;
	    String name;
	
	    public Employee(double age, double salary, String name) {
	        this.age = age;
	        this.salary=salary;
	        this.name=name;
	    }
	
	    public void getdata(){
	        System.out.println("Name- " + this.name + " Age- " + this.age + " Salary- " + this.salary);
	    }
	}
	
	class comp implements Comparator<Employee>{
	    public int compare(Employee a, Employee b){
	        if(a.salary==b.salary)
	            return 0;
	        else if(a.salary>b.salary)
	            return 1;
	        else
	            return -1;
	    }
	}
	
	    public class Question4{
	
	        public static void main(String[] args) {
	
	            List<Employee> E = new ArrayList<Employee>();
	            E.add(new Employee(23.0,15100.0,"Pushkar Singh"));
	            E.add(new Employee(23.0,15200.0,"Archit Chauhan"));
	            E.add(new Employee(23.0,15300.0,"Swapil Khanna"));
	
	            Collections.sort(E,new comp());
	
	            for(int i=0;i<E.size();i++){
	                E.get(i).getdata();
	            }
	        }
	    }
