package Seminar_7_DZ_1.Classes;

import Seminar_7_DZ_1.Base.AbstractClasses.AView;

import java.util.Scanner;

public class View extends AView {
    Scanner scanner;

    public View(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getExpression() {

        System.out.println("Введите выражение с вещественными или комплексными числами. Для выхода наберите exit.");
        return scanner.next();
    }

    @Override
    public void showResult(String result) {
        System.out.printf("Результат выражения: %s\n", result);
    }
}