package Seminar_7_DZ_1;



    import Seminar_7_DZ_1.Classes.CalcFactory;
    import Seminar_7_DZ_1.Classes.Presenter;
    import Seminar_7_DZ_1.Classes.View;

    import java.util.Scanner;

    public class Program {
        public static void main(String[] args) {
            Presenter presenter = new Presenter(new View(new Scanner(System.in)), new CalcFactory());
            presenter.run();
        }
}
