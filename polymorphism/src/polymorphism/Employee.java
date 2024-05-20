/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Irfan Habibi
 */

public class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String kantor, double gaji, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.kantor = kantor;
        this.gaji = gaji;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }
}

