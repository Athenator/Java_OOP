package seminar.Task01.controller;

import java.util.List;
import java.util.Scanner;

import seminar.Task01.View.UserView;
import seminar.Task01.data.Student;
import seminar.Task01.service.StudentsService;
import seminar.Task01.util.FileToReade;
import seminar.Task01.util.FileToWrite;

public class StudentContoller {
    // private UserView view;
    // private DataService<Student> model;

    // public StudentContoller(UserView view, DataService<Student> model) {
    //     this.view = view;
    //     this.model = model;
    // }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие: \n");
            System.err.println("1 - Загрузить список студентов из файла");
            System.err.println("2 - Добавить нового студента");
            System.err.println("3 - Распечатать текущий список студентов");
            System.err.println("4 - Сохранить студентов в файл");
            System.err.println("5 - Выйти из программы");

        
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Вы загрузили список студентов");
                    // model.load();
                    break;
                case 2:
                    System.out.println("Вы добавили нового студента");
                    // model.add(null);
                    break;
                case 3:
                    System.out.println("Вы расечатали список студентов");
                    // view.print();
                    break;
                case 4:
                    System.out.println("Вы сохранили студентов в фаил");
                    break;
                case 5:
                scanner.close();
                return;
            }
        }
    }
    
}
