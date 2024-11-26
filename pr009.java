//Основы наследования
class TwoDShape {
	private double width;
	private double height;
	}
	
	//Конструктор с 2 параметрами
	TwoDShape(double w, double h) {
		width = w;
		height = h;
		System.out.println("Внутри конструктора TwoDShape(double w, double h)");
	}
	void showDim() {
                System.out.println("Ширина и высота " + width + "и " + height);

	}
}
//Демонстрация строгой типизации при присваивании ссылок на объект
class X {
	int a;
	X(int i) {
		a=i;
	}
	void show() {

		System.out.println("Значение a: " + a);
	}
	void show(String msg) {
	}
}
class Y {
        int a;
        Y(int i) {
                a=i;
        }
}

class Z extends X {
	int b;
	Z(int i, int j) {
		super (j);
		b = i;
	
	}
/*	void show() {
		super.show(); //Вызов одноименного метода из суперкласса	
                System.out.println("Значение a и b: " + a + " " + b);
	}
*/	
	void show (String msg) {
		System.out.println(msg + b);
	}
}

class ColorTriangle extends Triangle {
        private String color;

        ColorTriangle{ (String c, String s, double w double h) {
                super(s, w, h);
                color = c;
		System.out.println("Внутри конструктора ColorTriangle{ (String c, String s, double w double h)");
        }
	
	ColorTriangle (ColorTriangle ob) {
		super(ob);
		color = ob.color;
	}
	
        String getColor() {
                return color;

        }
        double area() {
		System.out.println("Метод area() должен быть переопределен в подклассе");
		return 0.0;
	}

class Triangle extends TwoDShape {
	String style;

	double area() {
		return width*height/2;
	}
	void showStyle() {
		System.out.println("Стиль: " + style);
	}

	//Конструктор объекта на базе существующего треугольника
	Triangle (Triangle ob) {
		super(ob); //Передаем объект Triangle конструктору суперкласса
		style = ob.style;
}

class pr009 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		ColorTriangle t5 = new ColorTriangle("Синий", "Контурный", 8.0, 12.0);
		ColorTriangle t6 = new ColorTriangle("Красный", "Закрашенный", 2.0, 5.0);
		Triangle t7 = new Triangle(t1);
		ColorTriangle t8 = new Triangle(t5);
		t1.width = 4.0;
		t1.height  = 4.0;
		t1.style = "закрашенный";
		t1.width = 8.0;
                t1.height  = 12.0;
                t1.style = "контурный";
		System.out.println("Информация об объекте t1: ");
		t1.showStyle();
		t1.ShowDim();
		System.out.println("Площадь: " + t1.area());
		System.out.println();
		System.out.println("Информация об объекте t2: ");
		t2.showStyle();
                t2.ShowDim();
		System.out.println("Площадь: " + t2.area());
                System.out.println();

		//Демонстрация контроля типов:
		X x = new X(10);
		X x2;
		Y y = new Y(5);
		Z z = new Z(5, 6);
		x2 = x;
		x2 = z;

		x.show(); //Демонстрация динамической диспетчеризации методов
		System.out.println("Выполнение show() приссылке на объект подкласса");
		x2.show();
		x2.show("Перешруженная версия метода из подкласса");
		z.show("Строка");
		x2 = x;
		System.out.println("Выполнение show() приссылке на объект суперкласса");
		x2.show();
		
		System.out.println();

		System.out.println("x2.a: " + x2.a);
		//System.out.println("x2.b: " + x2.b); Внутренняя переменная подкласса недоступна ссылочной перемнной родительского класса

		//x2 = y; Недопустимое присваивание ссылки на объект другого типа

		TwoDShape[] shapes = new TwoDShape[5]

		shapes[0] = new Triangle ("контурный", 8.0, 12.0);
		shapes[1] = new Rectangle (10);
		shapes[2] = new Rectangle("сплошная", 10, 4);
		shapes[3] = new Triangle (7.0);
		shapes[4] = new TwoDShape (10, 20, "абстрактная фигура");
		
		System.out.println();

		for (int i=0; i<shapes.length; i++) {
			System.out.println("Имя объекта " + shapes[i].getName());
			System.out.println("Площадь " + shapes[i].area());
			System.out.println();		
	}
}
