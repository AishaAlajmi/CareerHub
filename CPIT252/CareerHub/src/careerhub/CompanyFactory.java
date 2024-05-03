/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package careerhub;

import java.util.Scanner;

/**
 *
 * @author aisha
 */
public class CompanyFactory {

    public static Company createApplication(Student Student, String CompanyName, String getGPA, String getMajor) {
        while (true) {
            if (CompanyName.equalsIgnoreCase("SDAIA")) {
                return new SDAIA(Student, getGPA, getMajor);
            } else if (CompanyName.equalsIgnoreCase("STC")) {
                return new STC(Student, getGPA, getMajor);
            } else if (CompanyName.equalsIgnoreCase("Sabic")) {
                return new Sabic(Student, getGPA, getMajor);
            } else if (CompanyName.equalsIgnoreCase("aramco")) {
                return new aramco(Student, getGPA, getMajor);
            } else {
                System.out.println("Please enter a valid Company name (SDAIA, STC, Sabic, aramco):");
                Scanner scanner = new Scanner(System.in);
                CompanyName = scanner.nextLine();
            }

        }
    }
}
