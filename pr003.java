class pr003 {
	public static void  main (String args[]) throws java.io.IOExpection {
		//Чтение с клавиатуры 
		char ch;
		System.out.println("Нажмите на клавишу и Enter");
		ch =(char) System.in.read();
		System.out.println("Вы нашли клавишу"+ch);

		//Оператор цикла for
		
		System.out.println('\n');
		double num, sroot, rerr;

		for(num=1,0; num<100.0, num++) {
			sroot = Math.sqrt(num);
			System.out.println("Квадратный корень числа " + num + "равен" + sroot);
			//Вычисление ошибки округления
			rerr = num-(sroot*sroot);
			System.out.println("Ошибка оургления составляет " + rerr);
			System.out.println();
		}

		int x1;
	
		for(x1=100; x1 > -100; x1 -=5)
			System.out.println(x1);

		System.out.println('\n');

		int i7, j7;
		for (i7=0,j7=10,i7<j7;i7++, j7--)
			System.out.println("i7 и j7 " + i7 + " " + j7);
		
		System.out.println('\n');

		int i8;
		char ignore;
		//вставить while
		System.out.println("Для остановки циклв нажмите клавишу \"S\"");
		for(i8=0; (char) System.in.read() != 'S'; i8++) {
			do {
                		
                		ignore = (char) System.in.read();
			} while (ignore != '\n');
			System.out.println("Итерация № "+i8);
		}
		for (i8 = 0;i8 < 10;) {
			System.out.printlnSystem.out.println("Итерация № "+i8);
			i8++;
		}
		//Бесконечный цикл
		System.out.println('\n');
		for (;;){
			ch = (char) System.in.read();
			if (ch == 'q') break;
		}

		System.out.println('\n');
	
		int sum =0;
		//Вычисление сумм от 1 до 5
		for(i8=1; i8<=5; sum+= i8++);
		System.out.println("Сумма чисел равна " + sum);
		//commit №2
	
		//Цикл while
		System.out.println('\n');
		ch = "a";
		while (ch<="z") {
		System.out.println(ch);
			ch++;
		}
		System.out.println();
	
	//Вычисление целых степеней числа 2
		int e;
		int result;
		for (int i9=0; i9 <10; i9++) {
			result =1;
			e = i9;
			while (e>0) {
				result *=2;
				e--;
			}
		System.out.println("2 в степени "+ i9 +"равно "+result);
		}
	}
	//Цикл do while
	do {
		System.out.println("Нажмите клавишу затем Enter");
		ch = (char) System.in.read();
		do {	
			ignore = (char) System.in.read();
		} while(ignore != '\n');
	} while(ch != "q")

	//оператор break
	System.out.println('\n');
	
        for(x1=100; x1 > -100; x1 -= 5) {
		System.out.println(x1);
		if (x1 == 50) break; //прекращвем выполненик цикла
	}

	System.out.println('\n');

	//break с вложенными циклами
	for (int i9=0; i9<3; i9++) {
		System.out.println("Счетчик внешнего цикла" + i9)
		System.out.print("Счетчик вгутреннего цикла" + )
		int t = 0;
		while (t<100) {
			if (t==10) break;
			 System.out.print(t+" ");
			 t++;
		}
		System.out.println()
	}
	 System.out.println("Циклы закончились")


}
