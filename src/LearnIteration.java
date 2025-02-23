import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnIteration {
    public List<String> addName(){
        List<String> mylist = new ArrayList();
        mylist.add("12");
        mylist.add("Ishant");
        mylist.add("Ishant");
        mylist.add("Ishu");
        mylist.set(0,"Mayuri");
        return mylist;
    }

    public List<Employee> addEmployee(){
        List<Employee> employeeList = new ArrayList<>();

        Employee darshan = new Employee();
        darshan.setName("Darshan Deshpande");
        darshan.setAge(30);

        employeeList.add(darshan);
        Employee amruta = new Employee();
        amruta.setName("Amruta Pande");
        amruta.setAge(40);
        employeeList.add(amruta);
        return employeeList;
    }

    public void printEmploye(List<Employee> employeeList){
        for(int i=0;i<employeeList.size();i++){
            Employee employee = employeeList.get(i);
            System.out.println("-----------------------");
            System.out.println(i+1+" Name : "+employee.getName()+" Age : "+employee.getAge());
        }
    }

    public void printList(List<String> mylist){
        Iterator<String> it = mylist.iterator();
        while(it.hasNext()){
            String i = it.next();
            if(i.equalsIgnoreCase("Ishant")) {
                it.remove();
            }
            System.out.println("updated list is ---> "+ mylist);
        }
    }
    public static void main(String[] args) {
        LearnIteration learnIteration = new LearnIteration();
        List<String> mylist = learnIteration.addName();
        learnIteration.printList(mylist);
        List<Employee> employees = learnIteration.addEmployee();
        learnIteration.printEmploye(employees);

    }
}
