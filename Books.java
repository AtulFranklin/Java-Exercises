// Program to print Book titles and pages
public class Books {
    String title;
    int pages;

    public Books(String title,int pages) {
        this.title = title;
        this.pages = pages;
    }

    public void printInfo(){
        System.out.println("Title: " + this.title + " | Pages: " + this.pages);
    }

    public static void main(String[] args) {
        Books book1 = new Books("Java Basics", 250);
        Books book2 = new Books("Hoboken Guide", 120);
        Books book3 = new Books("Data Structures", 480);
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}