class Avtomobil {
	int pass; // колличество пассажиров
	int v; // объем бака
	double rash; //расход топлива в л. на 100км
}
class pr004 {
	public static void main (String args[]) {
		//Создание жкзепляра класса
		Avtomobil lada = new Avtomobil();
		int rasst;

		//Присваиваем значение внутрю пременным экземпляра
		lada.pass = 4;
		lada.v = 40;
		lada.rash = 9.5;

		//Расчет расстояния, которое лада проедет на полом баке
		rasst = (int) lada.v/lada.rash * 100;
		System.out.println("Лада проедет " + rasst + " , км. на полном баке");
	}
}
