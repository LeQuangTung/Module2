import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    public static ArrayList<Product> lists = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        lists.add(new Product(1, "SP1", 2222));
        lists.add(new Product(2, "SP2", 3333));
        lists.add(new Product(3, "SP3", 1111));
        lists.add(new Product(4, "SP4", 4444));

        ProductManager productManager = new ProductManager();
        do {
            System.out.println("MENU");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Hiển thị tất cả sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.addProduct(scanner);
                    break;
                case 2:
                    productManager.editProduct(scanner);
                    break;
                case 3:
                    productManager.deleteProduct(scanner);
                    break;
                case 4:
                    productManager.displayProduct();
                    break;
                case 5:
                    productManager.searchByName(scanner);
                    break;
                case 6:
                    boolean flag = true;
                    do {
                        System.out.println("6.1. Sắp xếp tăng dần");
                        System.out.println("6.2. Sắp xếp giảm dần");
                        System.out.println("0. Thoát");
                        System.out.println("Nhập lựa chọn");
                        int choice2 = Integer.parseInt(scanner.nextLine());

                        switch (choice2) {
                            case 1:
                                productManager.sortAsc();
                                break;
                            case 2:
                                productManager.sortDes();
                                break;
                            case 0:
                                flag = false;
                                break;
                        }
                    } while (flag);
                case 0:
                    System.exit(0);
            }
        }while (true) ;
    }
    public void addProduct(Scanner scanner) {
        System.out.println("Nhap id san pham:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("Nhap gia san pham");
        double price = Double.parseDouble(scanner.nextLine());
        Product product =new Product(id,name,price);
        lists.add(product);
        displayProduct();
    }

    public void displayProduct(){
        for (Product product : lists) {
            System.out.println(product);
        }
    }

    public  void editProduct(Scanner scanner){
        System.out.println("Nhap id san pham muon sua:");
        int idsua = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getId() == idsua){
                System.out.println("Nhap ten moi san pham");
                String name = scanner.nextLine();
                lists.get(i).setName(name);
                System.out.println("Nhap gia moi cua san pham");
                Double price = Double.parseDouble(scanner.nextLine());
                lists.get(i).setPrice(price);
                System.out.println("Cap nhat thanh cong");
                System.out.println(lists.get(i));
            }
        }
    }

    public void deleteProduct(Scanner scanner){
        System.out.println("Nhap id san pham ban muon xoa");
        int idxoa = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getId() == idxoa){
                lists.remove(i);
                System.out.println("Xoa thanh cong");
                break;
            }
        }

    }

    public void searchByName(Scanner scanner){
        System.out.println("Nhap ten san pham muon tim");
        String searchName = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < lists.size(); i++) {
            if(lists.get(i).getName().equals(searchName)){
                System.out.println(lists.get(i).toString());
                count++;
            }
        }
        if (count == 0){
            System.out.println("khong co");
        }
    }

    public  void sortAsc(){
        Collections.sort(lists, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        displayProduct();
    }

    public  void sortDes(){
        Collections.sort(lists, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
        displayProduct();
    }



}
