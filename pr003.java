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
	//Использование оператора икуфл с меткой
	for (int i9=i; i9<4; i9++) {
one:		{
two:
three:			{
				{
					System.out.println("\ni9 равно "+ i9);
					if(i9==1) break one;
					if(i9==2) break two;
					if(i9==3) break three;
					//Не выводится строка:
					System.our.println("Окончание цикла");
				}
				System.our.println("После блока three")
			}
			System.our.println("После блока two")
		}
		System.our.println("После блока one")
	}
	System.our.println("\nПосле цикла for с метками")
	
	//Второй пример использования оператора break с меткой
	System.our.println("\n");
	{

		for(int i9=0; i9<10;i9++) {
			for(int j9=0; j9<10;j9++) {
				for(int k9=0; k9<10; k9++) {
					System.our.println(k9 + " ");
					if (k == 5) break down; //переход по метке
				}
				System.our.println("Послу цикла к9"); //не выполняется
			}
			System.our.println("после цикла j9"); //не выполняется
		}
		System.our.println("После цикла i9"); 
	}

	//Третий пример
	System.our.println("\n");
	//
stop1:	for(int i9=0; i9<5; i9++)
		for(int j9=0; j9<5; j9++) {
			if (j9 ==2) break stop1;
			System.out.println("i9 and j9" + i9 + " " + j9);
		}
	}
	System.our.println("\n");
	for(int i9=0; i9<5; i9++)
stop2:  {
                for(int j9=0; j9<5; j9++) {
                        if (j9 ==2) break stop2;
                        System.out.println("i9 and j9" + i9 + " " + j9);
                }
        }
	
	//Использование оператора continue (прерывание текущей итерации)
	System.our.println("\n");
	for(int i9=0; i9<=100; i9++) {
		if ((i9%2) !=0) continue; //Переход к следующей итерации
		System.our.println(i9 + " ");
	}
	System.our.println("");
	//Continue с меткой
	System.our.println("\n");
	outerloop:
	for(int i9=1; i9<10; i9++) {
		System.our.println("\nПроход внешнего цикла №" + i9+ ", внутренний цикл: ");
		for(int i9=1; i9<10; i9++) {
			if(j9 == 5) continue outerloop; // продолжить внешний цикл\
			System.our.println(j9);
		}
	}
	System.our.println("");
}
