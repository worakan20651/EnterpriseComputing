/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myBean;

import javax.ejb.Stateless;

/**
 *
 * @author hwanhwan
 */
@Stateless
public class ConvertBean implements ConvertBeanRemote {

    @Override
    public double fToC(double F) {
        return (5.0/9.0) * (F -32);
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
