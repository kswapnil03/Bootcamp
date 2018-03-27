package Question2

class Employee extends Person{
    int empId;
    String company;
    int salary;

    int getEmpId() {
        return empId
    }

    void setEmpId(int empId) {
        this.empId = empId
    }

    String getCompany() {
        return company
    }

    void setCompany(String company) {
        this.company = company
    }

    int getSalary() {
        return salary
    }

    void setSalary(int salary) {
        this.salary = salary
    }
}
class Groovy{
    public static void main(String[] args) {
        def employee=new Employee(name: "swapnil" ,age: 20,gender: "Male",address: "saharanpur",empId: 28454,company: "ToTheNew",salary: 15100 );
        printf "salary:${employee.@salary}\n"
        printf "name:${employee.name} \n"
        printf "company:${employee.getCompany()}\n"
        printf "salary:${employee.@salary}\n"
    }
}
