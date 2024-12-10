//Импорт класса из пакета bookpack
import bookpack.Book
/*
 * Импорт всех классов из пакета bookpack
 * import bookpack.*;
 * kgskkjgowek[roqel[okfkmslvl,c
 * dfgdg
 * s
 * gd
 * sgdsg
 * sd
 * g
 * sd
 * fdfsfds
 * fsdfsfgrwe
 * r
 * fsdfgser
 * ewfd
 * s
 */
package bookpackext;
class pr011 {
        public static void main(String[] args){
                bookpack.Book[] books = new Book[5];
                books[0] = new Book("Иллиада", "Гомер", 1980);
                books[1] = new Book("Унесенные ветром", "Митчел", 2000);
                books[2] = new Book("Наедине с собой", "Аврелий", 1950);
                books[3] = new Book("Собор Парижской богоматери", "Гюго", 1970);
                books[4] = new Book("Претупление и наказание", "Достоевский", 1950);
                fot(int i=0; i<books.lenght; i++)
                        books[i].show();
        }
}
