class Avtomobil {
	int pass; // колличество пассажиров
	int v; // объем бака
	double rash; //расход топлива в л. на 100км
	
	void rasst() {
		System.out.println("Расстояние на полном баке: "  + ((int)(v/rash * 100)));
	}
}
class pr004 {
	public static void main (String args[]) {
		//Создание жкзепляра класса
		Avtomobil lada = new Avtomobil();
		Avtomobil porshe = new Avtomobil();
		int rasst, rasst2;

		//Присваиваем значение внутрю пременным экземпляра
		lada.pass = 4;
		lada.v = 40;
		lada.rash = 5.5;

		porshe.pass = 1;
                porshe.v = 100;
                porshe.rash = 14.0;

		//Расчет расстояния, которое лада проедет на полом баке
		//rasst = (int) (lada.v/lada.rash * 100);
		//rasst2 = (int) (porshe.v/porshe.rash * 100);

		System.out.println("Для Лада: ");
		lada.rasst();

		System.out.println("Для Porshe: ");
		porshe.rasst();

	}
}
