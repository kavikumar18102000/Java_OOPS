package Anonymous_class.Abstract_anonymous_class;

public class Main {
    public static void main(String[] args) {

        //creating anonymous class for an abstract class.

        car c1 = new car() {
            @Override
            void name(String name) {
                System.out.println(name);
            }

            @Override
            void model(int id) {
                System.out.println(id);
            }
        };

        c1.name("ROLLS ROYCE C1");
        c1.model(231);


    }
}
