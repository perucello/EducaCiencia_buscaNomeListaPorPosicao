package com.educaciencia.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**************************************
 * ******* EDUCACIENCIA FASTCODE ******
 * ******* MANIPULANDO LISTAS *********
 * *******     29/09/2022     *********
 **************************************/

public class Main {

	public static void main(String[] args) {		
		buscaNomeListaPorPosicao();
	}
	
	/* Buscando Nome na lista por posição */
	public static void buscaNomeListaPorPosicao() {
		System.out.println("----------- EDUCACIENCIA FASTCODE - ARRAYLIST ------------------");
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("EducaCiencia FastCode"); // posicao 0 na Lista
		listaNome.add("CobraDev"); // posicao 1 na lista
		System.out.println("Buscando nome da posição 1 " + listaNome.get(1)); // buscando posicao 1 = CobraDev
		System.out.println("Buscando nome da posição 0 " + listaNome.get(0)); // buscando posicao 0 = Educa
	}
		
}
