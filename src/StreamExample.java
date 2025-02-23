import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public List<LearnPojo> getEmployee() {


        LearnPojo learnPojo = new LearnPojo();
        learnPojo.setName("Darshan");
        learnPojo.setAge(30);
        LearnPojo learnPojo1 = new LearnPojo();
        learnPojo1.setName("Ishu");
        learnPojo1.setAge(20);
        List<LearnPojo> employeelist = new ArrayList<>();
        employeelist.add(learnPojo);
        employeelist.add(learnPojo1);
        return employeelist;
    }

    public void printemployee(List<LearnPojo> employeelist) {
        for (LearnPojo l1 : employeelist) {
            System.out.println("Name is : " + l1.getName());
            System.out.println("Name is : " + l1.getAge());

        }
    }

    public List<LearnPojo> filterList (List<LearnPojo> employeeList) {
        List<LearnPojo> filterList = employeeList.stream().filter(LearnPojo -> LearnPojo.getName().equalsIgnoreCase("Darshan")).collect(Collectors.toList());
        return filterList;
    }

    public static void main(String[] args) {


        System.out.println("Hello");

        StreamExample example = new StreamExample();
        List<LearnPojo> employeeList = example.getEmployee();
        example.printemployee(employeeList);
        List<LearnPojo> filteredEmployee = example.filterList(employeeList);
        System.out.println("-------------------------------------");
        example.printemployee(filteredEmployee);

    }
}


