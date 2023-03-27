package service;

import config.Config;
import model.Product;
import validate.ValidateInput;

import java.util.ArrayList;

public class Service {
    public  static ArrayList<Product> products = new ArrayList<>();
    public static ArrayList<Product> showListProduct(){
        return products;
    }
    public static  Product createProduct(){
        System.out.println("nhập tên");
        String name = Config.getScanner().nextLine();
        System.out.println("nhập chiều cao");
        double high = ValidateInput.validateInt();
        return new Product(products.size() == 0  ? 1 : (idAutoIncrement() + 1), name, high);
    }
    public static void addProduct(){
        try {
            products.add(createProduct());
        }catch (Exception e){
            System.err.println("gặp lỗi trong quá trình add product");
        }
    }

    public static int idAutoIncrement(){
        int maxId = products.get(0).getId();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() > maxId){
                maxId = products.get(i).getId();
            }
        }
        return maxId;
    }

    public static int getIndexById(int id){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id){
                return i;
            }
        }
        System.out.println("không tìm thấy sản phẩm có id này! ");
        return -1;
    }

    public static void removeById(){
        System.out.println("nhập id cần xóa: ");
        int id = ValidateInput.validateInt();
        int index = getIndexById(id);
        if (index != -1) products.remove(index);
    }

    public static void edit(){
        System.out.println("nhập id cần sửa: ");
        int id = ValidateInput.validateInt();
        int index = getIndexById(id);
        if (index != -1){
            System.out.println("nhập tên");
            String name = Config.getScanner().nextLine();
            System.out.println("nhập chiều cao");
            double high = ValidateInput.validateInt();
            products.get(index).setProductName(name);
            products.get(index).setHigh(high);
        }
    }
 }
