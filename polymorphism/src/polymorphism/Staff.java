/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Irfan Habibi
 */

public class Staff extends Employee {
    private String Pangkat;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String kantor, double gaji, MyDate dateHired, String pangkat) {
        super(name, address, phoneNumber, emailAddress, kantor, gaji, dateHired);
        this.Pangkat = Pangkat;
    }

    @Override
    public String toString() {
        return "Staff: " + super.toString();
    }
}

