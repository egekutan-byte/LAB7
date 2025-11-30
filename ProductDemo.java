import java.util.Scanner;

class Product{
    private String name;
    private int stock;

    public String getName() {return name;}
    public int getStock() {return stock;}


    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }
    public void buyOne(){
        if(this.stock==0){
            System.out.println("Out of stock!");
        }
        else{
            stock-=1;
        }
    }
    public void printInfo(){
        System.out.println("Product name: "+ this.getName());
        System.out.println("Stock of the product: "+this.getStock());
    }

}




public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many products are there in the store?");
        int c= sc.nextInt();
        sc.nextLine();
        Product[] products=new Product[c];
        for (int i = 0; i < products.length; i++) {
            System.out.println("What is the name of the "+(i+1)+". product?");
            String name1=sc.nextLine();
            System.out.println("The stock of the product: ");
            int stock1= sc.nextInt();
            sc.nextLine();
            products[i]=new Product(name1,stock1);
        }
        while(true){
            System.out.println("(Press Q to exit)Please enter the product's name:");
            String name2=sc.nextLine();
            if(name2.equals("Q")){
                System.out.println("You successfully quited from the system,have a nice day!");
                System.out.println("Final stock information:");
                for (int i = 0; i < products.length; i++) {
                    products[i].printInfo();
                    System.out.println();
                }
                break;
            }
            boolean found=false;
            for (int i = 0; i < products.length; i++) {
                if(products[i].getName().equals(name2)){
                    products[i].buyOne();
                    found=true;
                    break;
                }
                
            }
            if(!found){
                System.out.println("No such product!");
            }
        }
    }
}