package calculadora;

import java.util.*;

public class calculadora {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner s = new Scanner(System.in);
				
		double num1,num2,resultado=0;
		
		char simbolo;
		
		System.out.print("Escribe el primer numero ");
		
		num1= s.nextDouble();
				
		System.out.print("Escribe el segundo numero ");
		
		num2= s.nextDouble();		
		
		System.out.println("Escribe el simbolo de la operacion ");
		
		simbolo = s.next().charAt(0);
		
		switch(simbolo){

		case '+': 
			resultado=num1+num2;
			break;
		case '-':
			resultado=num1+num2;
			break;
		case '*':
			resultado=num1*num2;
			break;
		case '/':
			resultado=num1/num2;
			break;
		}		
		
		System.out.println("El resultado es "+resultado);
	}
	
	}
	


