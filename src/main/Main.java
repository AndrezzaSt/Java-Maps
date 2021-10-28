package main;
import Classes.AgendaTelefonica;
import java.util.*;
public class Main {
	//Método que retorna a união de l1 e l2
	public static Set<Integer> union(Set<Integer> l1, Set<Integer> l2){
		l1.addAll(l2); 
		return  l1;
		
	}
	// Método que retorna a intersecção de l1 e l2 
	//é um conjunto de elementos que, simultaneamente, pertencem a dois ou mais conjuntos,
	public static HashSet<Integer> intersect(HashSet<Integer> l1, HashSet<Integer> l2){
			l2.retainAll(l1);
			return l2; 
		
	}
	//Método que retorna a diferença entre l1 e l2
	public static Set<Integer> Diff(Set<Integer> l1, Set<Integer> l2){
			l2.removeAll(l1);
			return l2;
		
		
	}
	
	
	public static void main(String[] args) {
		AgendaTelefonica a = new AgendaTelefonica();
		a.inserir("andrezza", "1234");
		a.inserir("Matheus", "12345");
		a.inserir("Michael", "123456");
		a.inserir("Ronaldo", "1234567");
		a.inserir("Luana", "12345678");

		System.out.println("Numero de Andrezza: " + a.buscarNumero("andrezza"));
	
		a.remover("andrezza");
		System.out.println(a.buscarNumero("andrezza"));
		System.out.println("Tamanho da lista: " + a.tamanho());
		
		
		
		
		
		
		HashSet<Integer> l1 = new HashSet<>(); 
		HashSet<Integer> l2 = new HashSet<>(); 
		for(int i = 1; i <= 16; i++) {
			l1.add(i);
		}
		for(int j = 10; j < 20; j++) {
			l2.add(j);
		}
		
		System.out.println("Set 1: " + l1 + "\n");
		System.out.println("Set 2: " + l2 + "\n");
		
		System.out.println("União dos dois set's:  " + union(l1, l2) + "\n");
		System.out.println("Interesecção dos dois set's:  " + intersect(l1, l2) + "\n");
		System.out.println("Diferença dos dois set's:  " + Diff(l1, l2) + "\n");
		
		
		
	}

}
