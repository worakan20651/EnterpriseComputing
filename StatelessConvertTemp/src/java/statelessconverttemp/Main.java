/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package statelessconverttemp;

import javax.ejb.EJB;
import myBean.ConvertBeanRemote;
import java.util.Scanner;

/**
 *
 * @author hwanhwan
 */
public class Main {
    @javax.ejb.EJB
    private static ConvertBeanRemote convertBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter degree in Fahrenheit: ");
        double F = in.nextDouble();
        System.out.println(F + " Fahrenheit = " + convertBean.fToC(F) +" Celsius");
    }
    
}
