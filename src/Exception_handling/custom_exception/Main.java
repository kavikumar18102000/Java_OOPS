package Exception_handling.custom_exception;

public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try{
            System.out.println(a/b);
            throw new Myexception("This is custom made exception..");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
