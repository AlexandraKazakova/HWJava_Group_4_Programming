package HW5;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/*
Дана строка. Необходимо написать метод, который отсортирует слова в строке по длине с помощью TreeMap.
Строки с одинаковой длиной не должны “потеряться”.
Пример:
“Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись”
Результат:
[и], [ты], [Еще], [день, друг, Пора], [Мороз], [солнце], [чудесный, дремлешь, проснись], [красавица], [прелестный]
 */
public class Task1 {
	public static void main(String[] args) {
		TreeMap <Integer, List<String>> tMap = new TreeMap<>();
		String s1 = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
		String[] s2 = s1.split(" ");
		for (int i = 1; i < s2.length; i++) {
			List<String> list = new ArrayList<>();
			for (String item : s2) {
				if (item.length() == i){
					list.add(item);
				}
			}
			if(list.isEmpty() != true){
				tMap.put(i, list);
			}
		}
		System.out.println(tMap.values());
	}
}