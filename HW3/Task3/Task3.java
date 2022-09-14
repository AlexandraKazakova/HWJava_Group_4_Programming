package HW3.Task3;

import java.util.ArrayList;
import java.util.Collections;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 12, 100, 25, 4, 5, 15, 47, 8, 24, 1, 18, 33, 81);
		int min = list.get(0);
		int max = list.get(0);
		int sum = 0;
		double aver;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min){
				min = list.get(i);
			}
			else if(list.get(i) > max){
				max = list.get(i);
			}
			sum += list.get(i);
		}
		aver = (double) sum / list.size();

		System.out.println("Minimum = " + min);
		System.out.println("Maximum = " + max);
		System.out.printf("Average = " + "%.3f\n", aver);
		System.out.println("Collections.max = " + Collections.max(list));
		System.out.println("Collections.max = " + Collections.min(list));
	}
}
