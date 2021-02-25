
@FunctionalInterface
interface SalaryCalc {
    double calculateSalary(double hourlyPay, int hourWorked, double bonus);
}


public class Main{
    public static void main(String[] args) {


        SalaryCalc cal = (hp,hw,b) -> hp*hw + b;
        System.out.println(cal.calculateSalary(2,5,8));
    }


}
