package qaace22training;
final class Employee
{
    public String name;
    public int age;  
    public double salary;
    public char gender;
    public Employee(String name, int age, double salary, char gender)
    {
        this.name = name;
        this.age = age;  
        this.salary = salary;
        this.gender = gender;
    }
}
public class MultipleValue
{
    public static Employee getDetails()
    {
        String name = "kuberan";
        int age = 21;
        double salary = 13000;
        char gender = 'M';
        return new Employee(name, age,salary, gender);
    }
    public static void main(String[] args)
    {
    	Employee employee = getDetails();
        System.out.println("Name is " + employee.name);
        System.out.println("Age is " + employee.age);
        System.out.println("salary is " +employee.salary);
        System.out.println("Gender is " + employee.gender);
    }
}