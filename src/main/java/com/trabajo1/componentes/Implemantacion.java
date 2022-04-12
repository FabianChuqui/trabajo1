package com.trabajo1.componentes;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Implemantacion implements Dependencia {

	@Override
	public void salida_mensaje(String Mensaje) {
		System.out.println("la respuesta es: ");
		System.out.println(Mensaje);
		
	}

	@Override
	public int leer_teclado() {
		
		System.out.println("ingrese un valor: ");
		Scanner leer=new Scanner(System.in);
		return leer.nextInt();
	}

	@Override
	public String suma(int a, int b) {
		
		int suma=a+b;
				
		return String.valueOf(suma) ;
	}

	@Override
	public String resta(int a, int b) {
		int suma=a-b;
		return String.valueOf(suma) ;
		
	}

	@Override
	public String multiplica(int a, int b) {
		int suma=a*b;
		return String.valueOf(suma) ;
		
		
	}

	@Override
	public String divide(int a, int b) {
		int suma=a/b;
		return String.valueOf(suma) ;
		
	}

	@Override
	public String mayor(int a, int b) {
		
		
		if(a>b)
		{
		
			return("A es mayor que B");
			
		}else 
		{
		
		return ("B es mayor  que A");
		}
	}

	@Override
	public ArrayList<String> tabla(int tabladel) {
		
		ArrayList<String> lista=new ArrayList<>();
		
		for (int i=0; i<10; i++)
		{
			
			lista.add(String.valueOf(i*tabladel));
			
		}
		
		return lista;
	}

	
	

}
