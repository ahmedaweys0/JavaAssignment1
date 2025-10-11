public class assignmentone {
    public static void main(String[] args) {
                //prametr.constrac..
        EmployeeSalary E1 = new EmployeeSalary("Ali", 1000, 10.0, 5.0);
        E1.display();
        System.out.println("-----------------------");
        EmployeeSalary E2 = new EmployeeSalary("Ahmed", 1200, 8.0, 6.0);
        E2.display();

    }
}
//class
    class EmployeeSalary {
       private String Ename;
       private double BasicSalary;
       private double bonusPrecent;
       private double taxPercent;


           //paramet constr..
        EmployeeSalary(String En, double BS, double BP, double TP) {
            Ename = En;
            BasicSalary = BS;
            bonusPrecent = BP;
            taxPercent = TP;
        }
        //getter meth....
        public String getEname() {
            return Ename;
        }
        public double getBasicSalary(){
            return BasicSalary;
        }
        public double getBonusPrecent(){
            return BasicSalary;
        }
        public double getTaxPercent(){
            return BasicSalary;
        }
        //calculateBonus method
    public double calculateBonus(){
            return (BasicSalary*bonusPrecent)/100;
    }
    //calculateTax method
    public double calculateTax(){
            return (BasicSalary*taxPercent)/100;
    }
    //calculateFinalsalary method
    public double finalsalary(){
            return BasicSalary + calculateBonus() -calculateTax();
    }


        //display method
        void display (){
            System.out.println("Employee name : "+Ename);
            System.out.println("yBasic salary : "+BasicSalary);
            System.out.println("Bonus : ("+bonusPrecent+"%): $" +calculateBonus());
            System.out.println("Tax : ("+taxPercent+"%): $" +calculateTax());
            System.out.println("finalsalary (Net Income) : $ "+finalsalary());
        }
    }