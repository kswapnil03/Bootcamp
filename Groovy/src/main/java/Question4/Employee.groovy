package Question4

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

class Groovy {
    public static void main(String[] args) {
        def employee = new Employee(name: "swapnil", age: 22, gender: "Male", address: "saharanpur", empId: 28454, company: "Intelligrape", salary: 15100);
        printf "${employee.toString()} .He works for ${employee.company} and his salary is ${employee.salary}"
    }
}