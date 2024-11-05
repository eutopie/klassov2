//Управление доступом к членам класса
class Mod {
	private int alpha; //закрытая переменная
		public int beta; //открытая переменная
		int gamma; //переменная с доступом по умолчанию
		void setAlpha(int a) {
			alpha = a;
		}
		int getAlpha() {
			return alpha;
		}	
}
class FallSoftArray {
	private int[] a;
	private int errval;
	public int lenght;
	
	public FallSoftArray (int size, int errv) {
		a = new int[size];
		errval = errv;
		lenght = size;
	}

	public int get(int index) {
		if (indexOK(index))
			return a[index];
		return errval;
	}
	public boolean put(int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}

        private boolean indexOK(int index) {
                if(index >= 0 & index < length)
                        	return true;
                        return false;
	}
}
//Возврат объекта, определенного в программе
class CallByValue {
	void noChange (int i11, int j11) {
		i11 = i11 + j11;
		j11 = -j11;
	}
}
//
class CallByaRef {
        int a12, b12;
	CallByRef (int i12, int j12){
		a12 =i12;
		b12 = j12;
	}

	void change (CallByRef ob5){
		ob5.a12 = ob5.a12 +ob5.b12;
		ob5.b12 = -ob5.b12;
	}
}

//Возврат объекта, определенного в программе
class Err {
	String msg; //Сообщение об ошибке
	int severity; //уровень серьезности ошибки
	Err (String m, int s) {
		msg = m;
		severuty = s;
	}
}
class ErrorInfo {
	String [] msgs2 = {
		"Ошибка вывода",
		"Ошибка ввода",
		"Переполнение диска",
		"Выход индекса за границы диапазона"
	};
	int[] howBad = {3, 3, 2, 4};
	Err getErrorInfo(int i14) {
		if (i14>=0 & i14 <msgs2.lenght)
			return new Err(msgs2[i14], howBad[i14]);
		else
			return new Err("Отсутствует код для ошибки", 0);
	}
}

class pr007 {
        public static void main(String[] args) {
		Mod ob = new Mod();
		//Изменение закрытой переменной осуществляется через методы, заданные внутри класса Mod
		ob.setAlpha(77);
		System.out.println("Значение ob.alpha: " + ob.getAlpha());

		//Прямой доступ к переменной запрещен: ob.alpha = 100;
		ob.beta = 242;
		ob.gamma = 34;
		
		//Пример использования класса отказоустойчивого поведения массива
		System.out.println();
		FallSoftArray fs = new FallSoftArray(5, -999);
		int x;

		//Пример работы класса без вывода сообщений о неправильных индексаъ

		System.out.println("Скрытая от пользователя обработка ошибок: ");
		for(int i=0; i < (fs.lenght * 2); i++)
			fs.put(i, i*10);
		for(int i=0; i < (fs.lenght * 2); i++) {
			x=fs.get(i);
                        if (x != -999)  System.out.print(x + " ");
		}
		System.out.println();
		
		//Пример работы класса с выводом сообщений об ошибках
		
		for (int i=0; i<(fs.lenght * 2); i++)
			if (!fs.put (i, i*10))
				System.out.println("Индекс" + i + "выходит за границы массива");
		for (int i=0; i<(fs.lenght * 2); i++) {
                        x= fs.get(i);
			if (x != -999) System.out.print(x+ " ");
			else
                                System.out.println("Индекс" + i + "выходит за границы массива");
		}
	}
}
