package PracticeProblem_05;

class  Book{
    String tittle;
    String author;

    Book(String tittle){
        this.tittle = tittle;
        this.author = "Unknown";
    }
    Book(String tittle, String author){
        this.tittle = tittle;
        this.author = author;
    }

    public void printDetails(){
        System.out.println("Book name : " + this.tittle);
        System.out.println("Author : " + this.author);
    }
}
public class task_03 {
    public static void main(String[] args) {
        Book book1 = new Book("abcdef");
        book1.printDetails();

        Book book2 = new Book("ijklmn", "xyz");
        book2.printDetails();
    }
}
