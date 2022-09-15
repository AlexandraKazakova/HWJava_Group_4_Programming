package HW4.Task1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

// Реализуйте сущность “Deque” с помощью массива Integer, массив ограничен в размере size <=5 . Нужно реализовать методы

// boolean offerFirst(Integer element); //добавляет элемент element в самое начало массива.
// Если элемент удачно добавлен, возвращает true, иначе - false
// boolean offerLast(Integer element); //добавляет элемент element в конец массива.
// Если элемент удачно добавлен, возвращает true, иначе - false
// Integer peekFirst(); //возвращает без удаления элемент из начала массива. Если массив пуст, возвращает значение null
// Integer peekLast(); //возвращает без удаления последний элемент массива. Если массив пуст, возвращает значение null
// Integer pollFirst(); //возвращает с удалением элемент из начала массива. Если массив пуст, возвращает значение null
// Integer pollLast(); //возвращает с удалением последний элемент массива. Если массив пуст, возвращает значение null

public class Task1 {
	public static void main(String[] args) {
		List<Integer> list = List.of(6, 1, 4, 10, 3);
		Deque<Integer> dq = new ArrayDeque<>();
		dq.addAll(list);
		System.out.println(dq.offerFirst(18));
		System.out.println(dq.offerLast(13));
		System.out.println(dq);
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq);
	}
}
