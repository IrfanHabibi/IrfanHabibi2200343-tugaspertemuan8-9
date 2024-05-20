/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Irfan Habibi
 */

public class Faculty extends Employee {
    private int jamKerja;
    private String pangkat;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String kantor, double gaji, MyDate dateHired, int jamKerja, String pangkat) {
        super(name, address, phoneNumber, emailAddress, kantor, gaji, dateHired);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Faculty: " + super.toString();
    }
}

