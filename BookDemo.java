class Book {
    String title;
    int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    public void addPages(int n){
        this.pages+=n;
    }
    public void printBook(){
        System.out.println("The title of the book is "+ this.title);
        System.out.println("The number of pages is: "+ this.pages);
    }
}
public class BookDemo{
    public static void main(String[] args) {
        Book b1=new Book("Ege1907'nin Maceraları",67);
        Book b2=b1;
        b2.addPages(20);
        b1.printBook();
        b2.printBook();//Book b2=b1 does not create a new object,it is only a referance to the first object(b1) so there are only 1 object in the memory,just for now.
        Book b3=new Book("Ege1907'nin Maceraları",67);
        System.out.println(b3);//b1 and b3 are completely different objects since we created b3 with the "new" operator so they have the exact values in the data store but they are different objects.For example,lets think about the identical twins,they are exactly the same but also there are 2 person.
    }
}