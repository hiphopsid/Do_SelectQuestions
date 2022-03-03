/**
 * Description
 * Your task here is to implement a Java code based on the following specifications. Note that your code should match the specifications in a precise manner. Consider default visibility of classes, data fields, and methods unless mentioned otherwise.
 *
 * Specifications:
 *
 * class Candidate
 *   data members:
 *    name: String
 *    id: int
 *    age: int
 *    gender: String
 *    department: String
 *    yearOfJoining: int
 *    salary: double
 *     visibility: private
 *
 *   Candidate(int id, String name, int age, String gender, String department, int yearOfJoining, double salary): constructor with public visibility
 *   Define getter setters with public visibility
 *   toString() method has been implemented for you
 *
 * class Implementation:
 *  method definition:
 *   getCount(List<Candidate> list):
 *    return type: Map<String, Long>
 *    visibility: public
 *
 *   getAverageAge(List<Candidate> list):
 *    return type: Map<String, Double>
 *    visibility: public
 *
 *   countCandidatesDepartmentWise(List<Candidate> list):
 *    return type: Map<String, Long>
 *    visibility: public
 *
 *   getYoungestCandidateDetails(List<Candidate> list)
 *    return type: Optional<Candidate>
 *    visibility: public
 * Task:
 *
 * class Candidate:
 *
 * - define the String variable name
 *
 * - define the int variable id
 *
 * - define the int variable age
 *
 * - define the String variable gender
 *
 * - define the String variable department
 *
 * - define the int variable yearOfJoining
 *
 * - define the double variable salary
 *
 * -define a constructor and getter setters according to the above specifications
 *
 * -toString() method has been implemented for you as a part of the code stub
 *
 * class Implementation:
 *
 * Implement the below method for this class using in Stream API:
 *
 * static Map<String, Long> getCount(List<Candidate> list):  get the count of male and female employees from the list, put it into a Map and return the Map
 * static Map<String, Double> getAverageAge(List<Candidate> list): return the average age of male and female employees
 * static Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list): count and return the number of employees in each department
 * static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list): Get the details of youngest male employee in the product development department
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Candidate{
    //Write Your Code Here..
    private String name;
    private int age;
    private int id;
    private String gender;
    private String department;
    private int yearOfJoining;
    private double salary;

    public Candidate(String name, int age, int id, String gender, String department, int yearOfJoining, double salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
                + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
    }
}

class Implementation{
    //Write Your Code Here..

//    public Map<String,Long> getCount(List<Candidate> list)
//    {
//
//    }
//
//    public Map<String,Double> getAverage(List<Candidate> list)
//    {
//
//    }
//
//    public Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list)
//    {
//
//    }
}

public class HiringOn {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    }
}