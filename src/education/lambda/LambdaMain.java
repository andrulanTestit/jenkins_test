package education.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class LambdaMain {

    public static void main(String[] args) {

        String bike = "I want a bike.";
        String ball = "I want a ball.";

        Pattern pattern = Pattern.compile("I want a \\w+.");
        Matcher bikeMatcher = pattern.matcher(bike);
        Matcher ballMatcher = pattern.matcher(ball);

        System.out.println(bikeMatcher.matches());
        System.out.println(ballMatcher.matches());

        System.out.println(bike.matches("I want a \\w+."));
        System.out.println(ball.matches("I want a (bike|ball)."));

        String abcde = "aaaaabbccddeeee";
        String ae = "ae";
        System.out.println(abcde.matches("[a-e]+"));
        System.out.println(ae.matches("ae"));

        String t7 = "sad.123";
        System.out.println(t7.matches("[a-z]+\\.\\d+"));

        pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("abcd.1234uq.7tzik.999");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        Pattern pattern1 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher1 = pattern1.matcher("{1,2}, {0,5}");
        while (matcher1.find()) {
            System.out.println(matcher1.group(1));
        }

        String kode = "11111";
        String code = "11111-4444";
        System.out.println(kode.matches("^\\d{5}(-\\d{4})?$"));
        System.out.println(code.matches("^\\d{5}(-\\d{4})?$"));

//        new ArrayList<>()
//                .stream()
//                .count()
//                .limit()
//                .map()
//                .reduce()
//                .max()
//                .flatMap()
//                .distinct()
//                .findFirst()
//                .findAny()
//                .collect(Collectors.toList());


//        Emp emp1 = new Emp("Dimas");
//        Emp emp2 = new Emp("Karol");
//        Emp emp3 = new Emp("Andruha");
//
//        List<Emp> emps = new ArrayList<>();
//        emps.add(emp1);
//        emps.add(emp2);
//        emps.add(emp3);
//        emp1.setEmpEmbedded(new EmpEmbedded("EmbName"));
//        NameConcationator nameConcationator =  (n1, n2) -> emp1.getEmpEmbedded().getEmbName().concat(n2);
//        emp1.setEmpEmbedded(new EmpEmbedded(""));
//
//        for (Emp emp : emps) {
//            System.out.println(concationate(nameConcationator, emp1.getName(), emp.getName()));
//        }

//        for (int i = 0; i < emps.size(); i++) {
//            Emp emp = emps.get(i);
//            String a = String.valueOf(i);
//            System.out.println(concationate((n1, n2) -> a.concat(n2), emp1.getName(), emp.getName()));
//        }


    }

    public static String concationate(NameConcationator nameConcationator, String n1, String n2) {
        return nameConcationator.concationate(n1, n2);
    }
}


class Emp {
    private String name;
    private EmpEmbedded empEmbedded;

    public Emp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmpEmbedded getEmpEmbedded() {
        return empEmbedded;
    }

    public void setEmpEmbedded(EmpEmbedded empEmbedded) {
        this.empEmbedded = empEmbedded;
    }
}

class EmpEmbedded {
    private String embName;

    public EmpEmbedded(String embName) {
        this.embName = embName;
    }

    public String getEmbName() {
        return embName;
    }

    public void setEmbName(String embName) {
        this.embName = embName;
    }
}

interface NameConcationator {
    String concationate(String name1, String name2);
}
