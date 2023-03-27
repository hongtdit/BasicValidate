package view;

import service.Service;

public class View {
    public static void showMenu(){
        System.out.println("nhập lựa chọn của bạn \n" +
                "1. hiển thị danh sách \n" +
                "2. thêm sản phẩm \n" +
                "3. xóa sản phẩm \n" +
                "4. sửa sản phẩm ");
    }
    public void showListProduct(){
        System.out.println(Service.showListProduct());
    }
}
