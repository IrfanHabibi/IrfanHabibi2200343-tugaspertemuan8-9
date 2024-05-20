/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Irfan Habibi
 */

public class Polymorphism {
    public static void main(String[] args) {
        Person person = new Person("Irfan Habibi", "JL. Komplek SMA, Jambi", "0895-2335-5547", "irfanhabibi@upi.edu");
        Student student = new Student("Sahrul Mubarok", "JL.Gegerkalong,Bandung", "0857-2431-9725", "sahrulmubarok@upi.edu", Student.SENIOR);
        MyDate dateHired = new MyDate(2024, 5, 15);
        Employee employee = new Employee("Farrell Naufal", "JL.Cilimus, Bandung", "0812-8857-4356", "farrellnaufall@upi.edu", "A123", 60000, dateHired);
        Faculty faculty = new Faculty("Izzuhdin", "JL.Dago, Bandung", "0855-9141-5756", "izzuhdin@upi.edu", "B456", 80000, dateHired, 10, "Professor");
        Staff staff = new Staff("Yogi Suardi", "JL.Setiabudi, Bandung", "0813-9120-9306", "yogisuardi@upi.edu", "C789", 50000, dateHired, "HR Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
