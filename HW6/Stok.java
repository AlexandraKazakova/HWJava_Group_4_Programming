package HW6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Stok {
	public static void main(String[] args) {

	Notebook n1 = new Notebook("Apple", "MacBook Pro", "grey", 15.6, "1920/1080", 1.6, 1.0, "China", "512", "wfjhebfl", 150000.00);
	Notebook n2 = new Notebook("Huawei", "Sx80", "grey", 17.0, "1920/1080", 1.5, 2.0, "China", "256", "dmfnkjenf", 90000.00);
	Notebook n3 = new Notebook("Apple", "MacBook Air", "white", 15.9, "1920/1080", 1.1, 1.0, "China", "512", "jnfcjke", 120000.00);
	Notebook n4 = new Notebook("Asus", "DG350", "white", 16.5, "1920/1080", 2.2, 2.0, "China", "256", "ekjnfj", 100000.00);
	Notebook n5 = new Notebook("Aser", "Predator", "black", 16.0, "1920/1080", 1.8, 1.0, "China", "512", "jfelkjer", 130000.00);
	Notebook n6 = new Notebook("Lenovo", "ThinkPad", "black", 14.0, "1920/1080", 1.5, 1.5, "China", "512", "jkrnfjke", 80000.00);
	Notebook n7 = new Notebook("Aser", "Predator", "black", 16.0, "1920/1080", 1.8, 1.0, "China", "512", "jfelkjer", 130000.00);

	HashSet<Notebook> stok = new HashSet<Notebook>(Arrays.asList(n1, n2, n3, n4, n5, n6, n7));
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Введите вирму ноутбука: ");
	String find = sc.nextLine();
	sc.close();
	Notebook n = new Notebook(find, find, find, null, find, null, null, find, find, find, null);

	int count = 0;

	for (Notebook notebook : stok) {
		if (notebook.equals(n)){
			System.out.println(notebook);
			count++;
			}
		}
	System.out.println();
	System.out.println("В наличии: " + count);
	}
}
