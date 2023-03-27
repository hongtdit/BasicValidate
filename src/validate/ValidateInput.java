package validate;

import config.Config;
import service.Service;

import java.util.InputMismatchException;

public class ValidateInput {
        public static int validateInt(){
            int choice = 0;
            while (true) {
                try {
                    choice = Config.getScanner().nextInt();
                    return choice;
                } catch (InputMismatchException e) {
                    System.err.println("bạn đã nhập sai định dạng, vui lòng nhập lại");
                }
            }
        }

        public static double validateDouble(){
            double choice = 0;
            while (true) {
                try {
                    choice = Config.getScanner().nextDouble();
                    return choice;
                } catch (InputMismatchException e) {
                    System.err.println("bạn đã nhập sai định dạng, vui lòng nhập lại");
                }
            }
        }

        public static boolean checkDuplicateId(int id){
            for (int i = 0; i < Service.products.size(); i++) {
                if (Service.products.get(i).getId() == id){
                    System.err.println("trùng với id có sẵn, vui lòng nhập lại");
                    return true;
                }
            }
            return false;
        }
}
