import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);

    static Product[] products = new Product[4];
//    public ProductManager(){
//        products = new Product[0];
//    }
    static int count = 0;

    static void addProduct() {
        System.out.println("Nhập tên sản phẩm:");
        String name = scanner.next();
        System.out.println("Nhập giá:");
        int price = scanner.nextInt();
        System.out.println("Nhập mô tả:");
        String description = scanner.next();
        Product product = new Product(name,price,description);
        products[count] = product;
        count++;
    }

    static void updateProduct(){
        System.out.println("Nhập vị trí sản phẩm cần sửa(0-2): ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên mới: ");
        String name = scanner.nextLine();
        if (name.equals("")){
        } else {
            products[index].setName(name);
        }

        System.out.println("Nhập giá mới: ");
        String price = scanner.nextLine();
        if (price.equals("")){
        } else {
            products[index].setPrice(parseInt(price));
        }

        System.out.println("Nhập mô tả mới: ");
        String des = scanner.nextLine();
        if (des.equals("")){
        } else {
            products[index].setDescription(des);
        }

        System.out.println("Product name" + products[index].getName() + " Price:" + products[index].getPrice() + " Description: " + products[index].getDescription());
    }

    static void displayProduct(){
        for (int i=0 ; i<products.length; i++){
            System.out.println("Product name" + products[i].getName() + " Price:" + products[i].getPrice() + " Description: " + products[i].getDescription());
        }
    }

    static void deleteProduct(){
        System.out.println("Nhập vị trí sản phẩm muốn xóa(0-3): ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int delIndex = 0;
        for (int i = 0; i < products.length; i++) {
            if (x == i) {
                delIndex = i;
                products[i] = null;
            }
        }
        if (delIndex != -1) {
            for (int i = delIndex; i < products.length - 1; i++) {
                Product temp = products[i];
                products[i] = products[i + 1];
                products[i + 1] = temp;
            }
        }
        for (int i = 0; i < products.length-1; i++) {
            System.out.println("Name: " + products[i].getName() + " Price: " + products[i].getPrice() + " description: " + products[i].getDescription());
        }
    }

    static void displayMaxPriceProduct(){
        double max = products[0].getPrice();
        Product temp = new Product();
        for (int i = 1; i < products.length; i++) {
            if (max < products[i].getPrice()){
                max = products[i].getPrice();
                temp = products[i];
            }
        }
        System.out.println("Max price product: " + temp.getName() + " Price: " + temp.getPrice() + " Description: " + temp.getDescription());
    }



    public static void main(String[] args) {
        for (int i = 0; i < products.length; i++) {
            ProductManager.addProduct();
        }
        ProductManager.displayProduct();
        ProductManager.displayMaxPriceProduct();
        ProductManager.deleteProduct();
        ProductManager.updateProduct();

    }
}

