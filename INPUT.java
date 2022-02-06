
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class INPUT {

    public static void main(String [] args)
    {
        System.out.print("Enter anual interst rate, for example,8.25: ");
        Scanner me = new Scanner(System.in);
        double interestrate = me.nextDouble();
        System.out.print(interestrate);
        System.out.print("Enter anumber of years as an integer: ");
        Scanner erm = new Scanner(System.in);
        int year = erm.nextInt();
        System.out.print(year);
        System.out.print("Enter loan amount , for example ,120000.95: ");
        Scanner wee = new Scanner(System.in);
        double LoanAmount = wee.nextDouble();
        long millis=System.currentTimeMillis();
        java.util.Date date = new java.util.Date(millis);
        System.out.println("the loan was created on : "+date);
        Loan alan = new Loan(interestrate,year,LoanAmount);
        System.out.println("The monthly payment is " + alan.MonthlyPayment(alan.loanAmount,alan.annualInterestRate,alan.numberOfYears));
        System.out.println("The total payment is " + alan.totalPayment(alan.loanAmount,alan.annualInterestRate,alan.numberOfYears));
    }
}
