package PracticeProblem_06;

class Librarian{
    public long  ID;
    public String name;

    Librarian(long ID, String name){
        this.ID = ID;
        this.name = name;

    }

    public void searchBook(String bookName){

    }

    public boolean verifyMember(int ID){
        return true;

    }

    public void orderBook(){

    }

    public void sellBook(){

    }
}


class Book{
    public long bookID;
    public String bookName;
    public String bookAuthor;
    public String yearOfPub;
    public float price;
    public String status;

    Book(long bookID, String bookName, String bookAuthor, String yearOfPub, float price, String status){
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPub = yearOfPub;
        this. price = price;
        this.status = status;

    }

    public void addNewBook(String bookName){

    }

    public void deleteBook(String bookName){

    }

    public void displayBookDetails(int bookID){

    }

    public void inquiryBook(){

    }
}


class Publisher{
    public long pubID;
    public String pubName;
    public String pubAddress;
    public long pubPhoneNum;

    Publisher(long pubID, String pubName, String pubAddress, long pubPhoneNum){
        this.pubID = pubID;
        this.pubName = pubName;
        this.pubAddress = pubAddress;
        this.pubPhoneNum = pubPhoneNum;

    }

    public void addPub(){

    }

    public void modifyPub(){

    }

    public void deletePub(){

    }

    public void orderStatus(){

    }
}


class User{
    public long userID;
    public String userName;
    public String userAddress;
    public long userPhoneNum;

    User(long userID, String userName, String userAddress, long userPhoneNum){
        this.userID = userID;
        this.userName = userName;
        this.userAddress = userAddress;
        this.userPhoneNum = userPhoneNum;

    }

    public void returnBook(){

    }

    public int payFine(int date){
        int fine = 0;
        return  fine;
    }

    public void addNewUser(){

    }

    public void deleteUser(){

    }

    public void uploadDetails(){

    }

    public void bookPurchase(){

    }
}


public class Library {
    public static void main(String[] args) {

    }
}



