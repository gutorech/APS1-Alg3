/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps1;

/**
 *
 * @author Micro
 */
public class Teste_stableSort {

    public static void main(String[] args) {

        Lista<Numeros> lista = encher();
		
		lista.printObjects();
                
		
		lista.stableSort(lista.getHead(), new ProcuraNumero());
		System.out.println("\nInsertion sort\n");
		lista.printObjects();
   
    }
    public static Lista<Numeros> encher() {
		
		int num[] = {12,113,425,35,25,6264,22,2,76,8};
                
		Lista<Numeros> lista = new Lista<>();
		for (int k = 0; k < num.length; k++) {
			Numeros n = new Numeros(num[k]);
			if (k == 0) {
				lista.addFirst(n);
			} else {
				lista.append(n);
			}
		}
		return lista;
	}
}
