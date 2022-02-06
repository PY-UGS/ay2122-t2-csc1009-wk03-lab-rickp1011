
public class Loan {
    public double annualInterestRate;
    public int numberOfYears;
    public double loanAmount;
    public java.util.Date  date;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }
    public double MonthlyPayment(double loanAmount,double annualInterestRate,int numberOfYears){
        double monthlyInterestrate = ((this.annualInterestRate/100)/12) ;
        double var1 = this.numberOfYears*12;
        double var2= 1+monthlyInterestrate;
        double var3 = Math.pow(var2,var1);
        var3 = 1/var3;
        var3 = 1-var3;
        double money = this.loanAmount*monthlyInterestrate;
        money = money/var3;
        return money;

    }
    public double totalPayment(double loanAmount,double annualInterestRate,int numberOfYears)
    {
       double amount=this.MonthlyPayment(this.loanAmount,this.annualInterestRate,this.numberOfYears)*this.numberOfYears*12;
       return amount;

    }
}
