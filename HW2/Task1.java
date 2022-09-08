// Задание 1
// Напишите программу, записывающую 100 раз слово ”ТЕST” в файл.
// Слова должны чередоваться по формату – четная итерация большими буквами,
// нечетные – маленькими Пример: TESTtestTESTtestTEST…
package HW2;

import java.io.FileWriter;
import java.util.logging.Logger;

public class Task1 {
	public static void main(String[] args) {
		Logger l = Logger.getAnonymousLogger();
		String s1 = "TEST";
		String s2 = "test";
		try (FileWriter wr = new FileWriter("Test.txt", true)){
			for(int i = 0; i < 100; i++){
				if(i % 2 == 0){
					wr.write(String.valueOf(s1));
					wr.flush();
				}
				else{
					wr.write(String.valueOf(s2));
					wr.flush();
				}
			}
			wr.write(String.valueOf("\n"));
			wr.flush();
			l.info("Запись выполнена");
		}
		catch (Exception ex) {
			l.warning(ex.getMessage());
		}
	}
}

