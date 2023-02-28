public class Main {
    public static void main(String[] args) {

        Book[] books = {
                new Book("Toolor Kulaganda", 250, 100000),
                new Book("Samanchynyn Jolu", 300, 100000),
                new Book("Zhamilya", 200, 500000),
                new Book("Gulsarat", 130, 80000)};
        Author author = new Author("Chyngyz Aitmatov", "aitmatov@gmail.com", 'M',books);
        System.out.println(author.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~");
        Book [] books1 = {
                new Book("Secret of Chimneys",2500,80000000),
                new Book("Big Four",3000,7000000),
                new Book("Partners in Crime",1600,6000000)};
        Author author1 = new Author("Agatha Christie","agata@gmail.com",'F',books1);
        System.out.println(author1.toString());
    }
}