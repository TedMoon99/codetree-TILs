import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String productName = sc.next();
        int productCode = sc.nextInt();
        // Instance call
        Product product1 = new Product(productName, productCode);
        Product product2 = new Product();

        System.out.printf("product %d is %s\n",product1.productCode, product1.productName);
        System.out.printf("product %d is %s\n",product2.productCode, product2.productName);


    }
}

class Product{
    String productName;
    int productCode;

    Product(){
        this.productName = "codetree";
        this.productCode = 50;
    }

    Product(String productName, int productCode){
        this.productName = productName;
        this.productCode = productCode;
    }
}