package generics;

public class Main {
    public static void main(String[] args) {
        //instantiate the bag for pets
        Bag<Pets> petBag= new Bag<>();


        Pets cat1= new Pets();
        cat1.setName("Casanova");
        petBag.setContent(cat1);

        Bag<Laptop> laptopBag = new Bag<>();
        Laptop applemac= new Laptop();
        applemac.setName("Apple Mac");

        laptopBag.setContent(applemac);


        Bag<Book> bookBag= new Bag<>();
        Book poetry= new Book();
        poetry.setTitle("SzipIordo");
        bookBag.setContent(poetry);


        Box <Integer> integerBox = new Box<>();
        integerBox.setContent(23);
        Box <String> stringBox = new Box<>();
        stringBox.setContent("Hello World");


    }
}
