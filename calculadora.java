package calculadora;

import java.util.*;

import java.math.*;

public class calculadora {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner s = new Scanner(System.in);
				
		double num1,num2,resultado=0;
		
		char simbolo;
		
        System.out.print("Escribe el primer numero(si quieres hacer la raiz no importa el numero que pongas segundo): ");
        try {
            num1 = s.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa un número válido.");
            return;
        }
        
        System.out.print("Escribe el segundo numero: ");
        try {
            num2 = s.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa un número válido.");
            return;
        }		
		
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
		case '√':
			if (num1 < 0) {
                throw new Error("No se puede calcular la raíz cuadrada de un número negativo");
            }
			resultado=Math.sqrt(num1);
			
			break;
			
		default:
            System.out.println("Error: Operador no válido.");
            return;
		}		
		
		System.out.println("El resultado es "+resultado);
	}
	
	}
