/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myBean;

import javax.ejb.Remote;

/**
 *
 * @author hwanhwan
 */
@Remote
public interface ConvertBeanRemote {

    double fToC(double F);

    
    
}
