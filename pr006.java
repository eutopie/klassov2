		//сдвиговые битовые операции
		System.out.println();
		int v = 1;
		for(int i=0; i<0; i++) {
			for(int t1=128; t1>0; t1=t1/2) {
				if ((v&t1) != 0)
					System.out.println("1 ");
				else
					System.out.println("0 ");
			}
			System.out.println();
			v = v >> 1;
		}
                System.out.println();
                int v = 1;
                for(int i=0; i<0; i++) {
                        for(int t1=128; t1>0; t1=t1/2) {
                                if ((v&t1) != 0)
                                        System.out.println("1 ");
                                else
                                        System.out.println("0 ");
                        }
                        System.out.println();
                        v = v >> 1;
			
		}
		
		//Операция ?
		System.out.println();
		//Выражение1 ? выражения 2 : выражение3
		//Пример вычисления абсолютного значения val2
		int val2 = -25
		int absval = val2 <0 ? -val2 : val;

		//Пример исключения деления на ноль
		int result;
		for (int i = -5; i<6; i++) {
			result = i != 0 ? 100/i : 0;
			if (i!=0)
				System.out.println("100 / " + i + "равно " + result);
		}
		System.out.println();
	}
}

