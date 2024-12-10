class SeriesDemo {
	public static void main(String[] args) {
		ByTwos ob = new ByTwos();
		ByThrees ob3 = new ByThrees();
		//Последовательность через два
		for(int i = 0; i < 5; i++)
			System.out.println("Следующее значение в последовательности " + ob.getNext());
		System.out.println("Последнее предыдущее значение " + ob.getPrevious());
		System.out.println("\nСброс последовательности к стартовому значению ");
		ob.reset();
		for(int i = 0; i < 5; i++)
                        System.out.println("Следующее значение в последовательности " + ob.getNext());
                System.out.println("Последнее предыдущее значение " + ob.getPrevious());
		System.out.println("\nСдвиг точки начала ");
                ob.setStart(100);
		for(int i = 0; i < 5; i++)
                        System.out.println("" + ob.getNext());
		System.out.println("Последнее предыдущее значение " + ob.getPrevious());
		
		//Последовательность через три
		System.out.println();
		for(int i = 0; i < 5; i++)
                        System.out.println("Следующее значение в последовательности " + ob.getNext());
                //System.out.println("Последнее предыдущее значение " + ob.getPrevious());
                ob.reset();
                for(int i = 0; i < 5; i++)
                        System.out.println("Следующее значение в последовательности " + ob.getNext());
                //System.out.println("Последнее предыдущее значение " + ob.getPrevious());
                System.out.println("\nСдвиг точки начала ");
                ob.setStart(100);
                for(int i = 0; i < 5; i++)
                        System.out.println("" + ob.getNext());
                //System.out.println("Последнее предыдущее значение " + ob.getPrevious());

                //Демонстрация использования интерфейсной переменной
		Series obInt;
		for(int i = 0; i < 5; i++)
			obInt = ob;
                        System.out.println("Следующее значение в последовательности ByTwos: " + obInt.getNext());
			obInt = ob3;
			System.out.println("Следующее значение в последовательности ByTrees: " + obInt.getNext());
		}
	}		
}		
