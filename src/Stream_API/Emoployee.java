package Stream_API;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emoployee {
    private String name;
    private int salary;
    private List<String> projects;
}
