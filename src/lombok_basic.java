import lombok.Data;

@Data
public class lombok_basic {
    private int no;


    public static void main(String[] args) {
        lombok_basic l = new lombok_basic();
        l.setNo(10);
        System.out.println(l.no);
    }
}
