package LAB8;

public class CompanyApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.setPid("1809900879628");
        emp1.setName("Kankanit Chuaysuk");
        emp1.setAge(23);
        emp1.setGender("female");
        emp1.setTel("09525xxxxx");

        emp1.setEmpID("emp001");
        emp1.setPosition("Student");
        emp1.setSalary(12000.00);


        //display object data
        System.out.println(emp1.toString());

    }
}//class