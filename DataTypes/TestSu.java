package DataTypes;

public class TestSu{
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "Anant";
        stu.Address = "lal badgh";
        stu.Standard = 5;
        stu.Roll_no = 13;
    
        System.out.println("--> Name :" + stu.name + " \n--> Address : " + stu.Address + "\n--> Roll no : "+ stu.Roll_no + "\n--> Standard : " + stu.Standard);
        
    }

}