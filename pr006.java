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
	}
}	
