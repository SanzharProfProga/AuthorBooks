import java.util.Arrays;

public class Author {
    private String name;
    private String email;
    private char gender;
    private Book []books;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Author(String name, String email, char gender, Book[] books) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.books = books;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getBooks (){
        String str = "";
        for (Book book:books) {
            str += book;
        }
        return str;
    }

    @Override
    public String toString() {
        return "\nAuthor: " +
                "\nName: " + name +
                "\nEmail: " + email +
                "\nGender: " + gender +
                "\n" + getBooks();
    }
}
