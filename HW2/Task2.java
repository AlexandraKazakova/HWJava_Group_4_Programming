package HW2;
// Задание 2

// Напишите программу, которая считает, распарсит и выведет
// в логгер заранее созданный файл с именами, предметами и оценками студентов
// Формат строк в файле:
// Андрей 5
// Алена 5
// Игорь 4
// Формат вывода: Ученик %s получил сегодня %d.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Logger;

public class Task2 {
	public static void main(String[] args) {
		Logger l = Logger.getAnonymousLogger();
		File myFile = new File("HW2\\Test2.txt");
		StringBuilder sb = new StringBuilder();
		if (myFile.exists()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(myFile.getAbsoluteFile()));
				String st;
				while ((st = br.readLine()) != null) {
					sb.append(st);
					sb.append("\n");
				}
				br.close();
			} catch (Exception e) {
				l.warning(e.getMessage());
			}

		}
		System.out.println(sb);
		l.info("End");
	}
}
