class book{
    String name;
    int pages;
    int prices;
    void insert(String name,int pages,int prices)
    {
        this.name=name;
        this.pages=pages;
        this.prices=prices;
    }
    void display(){
        System.out.println(name+ " "+pages+ " "+prices+ " ");
    }

}
public class Books {
    public static void main(String[] args) {
        book b1 = new book();
        book b2 = new book();
        book b3 = new book();
        book b4 = new book();
        b1.insert("Reasons To Stay Alive", 200, 500);
        b2.insert("It starts with us",300, 650);
        b3.insert("To Kill a Mockingbird", 400, 700);
        b4.insert("The Fault in our Stars", 500, 800);
        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
    
}
