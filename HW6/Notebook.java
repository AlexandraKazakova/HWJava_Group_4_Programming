package HW6;

/*Подумать над структурой класса Ноутбук для магазина
техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков. Реализовать методы фильтрации-сортировки
ноутбуки их первоначального множества и вывести проходящие по условиям.
Сделать так, как мы обсуждали на семинаре (M - V - C)
 */
public class Notebook {
	String brand;
	String model;
	String collor;
	Double diagonal;
	String screen;
	Double weight;
	Double guarantee;
	String manufacturer;
	String hardDisk;
	String serialNumber;
	Double sale;

	public Notebook(String brand, String model, String collor, Double diagonal,
			String screen, Double weight, Double guarantee,
			String manufacturer, String hardDisk, String serialNumber, Double sale) {
		this.brand = brand;
		this.model = model;
		this.collor = collor;
		this.diagonal = diagonal;
		this.screen = screen;
		this.weight = weight;
		this.guarantee = guarantee;
		this.manufacturer = manufacturer;
		this.hardDisk = hardDisk;
		this.serialNumber = serialNumber;
		this.sale = sale;
	}
	@Override
	public String toString() {
		String res = String.format("\n%s %s %s %.1f %s %.2f %.1f %s %s %s %.2f", brand, model, collor, diagonal, screen, weight, guarantee, manufacturer, hardDisk, serialNumber, sale);
		return res;
	}

	@Override
	public boolean equals(Object obj) {
		Notebook n = (Notebook) obj;
		return brand.toLowerCase().equals(n.brand.toLowerCase());
	}
	
}
