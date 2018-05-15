/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps1;

import java.util.Comparator;

/**
 *
 * @author Micro
 */
public class ProcuraNumero implements Comparator<Numeros>{  
    
	@Override        
	public int compare(Numeros o1, Numeros o2) {
		if (o1.getNumero()== o2.getNumero()) {
			return 0;
		}if (o1.getNumero() > o2.getNumero()) {
			return 1;
		}
		return -1;
	}

    
}
