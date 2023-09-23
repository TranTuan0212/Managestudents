package view;

import controller.Manager;
import controller.Validation;
import model.Students;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Students> ls = new ArrayList<>();
        Validation validation = new Validation();
        ls.add(new Students("1", "Tran Phuoc Tuan", "Spring", "java"));
        ls.add(new Students("2", "Nguyen Khanh", "Summer", ".net"));
        ls.add(new Students("3", "Dai Nhan", "Spring", "c/c++"));
        int count = 3;
        while (true) {
            Manager.menu();
            int choice = validation.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    Manager.createStudent(count,ls);
                    break;
                case 2:
                    Manager.findAndSort(ls);
                    break;
                case 3:
                    Manager.updateOrDelete(count,ls);
                    break;
                case 4:
                    Manager.report(ls);
                    break;
                case 5:
                    return;
            }

        }
    }

}
