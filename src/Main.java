import model.Product;
import service.Service;
import validate.ValidateInput;
import view.View;

public class Main {
    public static void main(String[] args) {
        Service.products.add(new Product(1, "abc0", 15));
        Service.products.add(new Product(3, "abcadas0", 25));
        Service.products.add(new Product(4, "adâsbc0", 14));
        Service.products.add(new Product(5, "abadasc0", 5));
        View view = new View();
        do {
            View.showMenu();
            int choice = ValidateInput.validateInt();
            switch (choice) {
                case 1:
                    view.showListProduct();
                    break;
                case 2:
                    Service.addProduct();
                    break;
                case 3: Service.removeById();
                    break;
                case 4: Service.edit();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (true);

    }
}