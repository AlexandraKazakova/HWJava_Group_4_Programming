package HW3.Task2;

import java.util.ArrayList;

import java.util.Collections;
// import java.util.Iterator;

// Пусть дан произвольный список(ArrayList) целых чисел, удалить из него четные числа
public class Task2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 12, 10, 25, 4, 5, 15, 47, 8, 24, 1);

		System.out.println(list);
		int index = 0;
		// Использовала do while т.к. решила, что данный цикл максимально подходит
		// из-за сдвига индексов списка из-за удаления элемента
		// Вариант решения через Iterator нашла в интернете - проще
		// Какое из них быстрее и эффективнее не знаю.

		do{
			if(list.get(index) % 2 == 0){
				list.remove(list.get(index));
				index = 0;
			}
			else index++;
		}
		while(index < list.size());
		System.out.println(list);

		// for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
		// 	Integer number = iterator.next();
		// 	if (number % 2 == 0) {
		// 		iterator.remove();
		// 	}
		// }
		// System.out.println(list);
	}
	
}
