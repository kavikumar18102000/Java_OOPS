package Java_8_Features.Stream_API;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee_Main {

    static List<Emoployee> emoployees = new ArrayList<>();
    static {
        emoployees.add(
                new Emoployee("kavi",3432,List.of("proj1","proj2"))

        );
        emoployees.add(
                new Emoployee("arya",3223,List.of("prj3","proj4"))
        );

        emoployees.add(
                new Emoployee("kumar",2453,List.of("prj6","pro8"))
        );
    }

    public static void main(String[] args) {

        //foreach
        emoployees.stream().forEach(emoployee -> System.out.println(emoployee));

        System.out.println();

        //map
        List<Emoployee> increasedSalary = emoployees.stream().map(emoployee -> new Emoployee(
                emoployee.getName(),
                emoployee.getSalary()*10,
                emoployee.getProjects()
        )).collect(Collectors.toList());

        increasedSalary.forEach(emoployee -> System.out.println(emoployee));

        System.out.println();

        //filter operations
        //we can perform the operations inside the "sout" also.
        System.out.println(emoployees.stream().filter(emoployee -> emoployee.getSalary()<3432)
                .map(emoployee -> new Emoployee(
                        emoployee.getName(),
                        emoployee.getSalary(),
                        emoployee.getProjects()
                )).collect(Collectors.toList()));
        System.out.println();

        //find first
        System.out.println(increasedSalary.stream()
                .filter(emoployee -> emoployee.getSalary()>3223)
                        .map(emoployee -> new Emoployee(
                                emoployee.getName(),
                                emoployee.getSalary(),
                                emoployee.getProjects()
                        ))
                .findFirst());

        System.out.println();

        //flatmap operation
        String projects = emoployees.stream()
                .map(emoployee -> emoployee.getProjects())
                .flatMap(strings -> strings.stream())
                .collect(Collectors.joining(","));

        System.out.println(projects);
        System.out.println();

        //shortCircuit operation
        List<Emoployee> shortCircuit = emoployees.stream()
                .skip(1) //skips the first object from the list
                .limit(2) //limit for next object and skip the rest of the objects.
                .collect(Collectors.toList());
        System.out.println(shortCircuit);
        System.out.println();

        //finite data
        //if we have infinite data, we can make finite data
        Stream.generate(Math::random)
                .limit(5)
                .forEach(value-> System.out.println(value));
        System.out.println();

        //sorting
        List<Emoployee> sortedEmployee = emoployees
                .stream()
                .sorted(((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName())))
                .collect(Collectors.toList());
        System.out.println(sortedEmployee);
        System.out.println();

        //max or min
        Emoployee maxSalary = emoployees.stream()
                .max(Comparator.comparing(Emoployee::getSalary))
                .orElseThrow(NoSuchElementException::new);
        System.out.println(maxSalary);
    }
}
