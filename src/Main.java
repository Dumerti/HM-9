public class Main {
    public static void main(String[] args) {
        Author Nikolay = new Author("Николай", "Гоголь");
        Book DeadSoul = new Book("Мертвые души", Nikolay, 1835);
        Author Alex = new Author("Александер", "Пушкин");
        Book Dubrovski = new Book("Дубровский", Alex, 1941);
        System.out.println("Имя автора: " + Nikolay.getName());
        System.out.println("Фамилия автора: " + Nikolay.getLastname());
        System.out.println("Название книги: " + DeadSoul.getTitle());
        System.out.println("Автор книги: " + DeadSoul.getAuthor());
        System.out.println("Год книги: " + DeadSoul.getYear());
        System.out.println();
        System.out.println("Имя автора: " + Alex.getName());
        System.out.println("Фамилия автора: " + Alex.getLastname());
        System.out.println("Название книги: " + Dubrovski.getTitle());
        System.out.println("Автор книги: " + Dubrovski.getAuthor());
        System.out.println("Год книги: " + Dubrovski.getYear());
        System.out.println();
        Dubrovski.setYear(1940);
        System.out.println("Исправление в годе книги: " + Dubrovski.getYear());


    }
}