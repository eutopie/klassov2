class Toyota {
	public void Kuzov() {
		System.out.println("Тойота - Автомобильная марка");
	}
}


class Vitz extends Toyota {
	public void Kuzov() {
		System.out.println("Toyota Vitz - пятидверный хэтчбек");
	}
}


class Mark2 extends Toyota {
	public void Kuzov() {
		System.out.println("Toyota Mark 2 - седан");
	}
} 


class Itog {
       public static void main(String[] args) {
		Toyota Vitz = new Vitz();
	 	Toyota Mark2 = new Mark2();

		Vitz.Kuzov();
		Mark2.Kuzov();
	}
}	       	
