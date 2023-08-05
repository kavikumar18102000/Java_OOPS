package Abstract_Classes;

public  class son2 extends Parent{

    public son2(int age) {
        super(age);
    }

    @Override
    void name() {
        System.out.println("I am Kumar");
    }

    @Override
    void career() {
        System.out.println("I am gonna be a sports player");
    }
}
