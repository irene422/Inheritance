public class StoreOneA extends StoreToRent {
    private boolean specialCustomer;
    private double monthlyPayment;
    private final double DISCOUNT_RATE=0.1;

    public StoreOneA(boolean loanRequired,double loanAmount, int loanPaymentTerm, boolean specialCustomer){
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.specialCustomer=specialCustomer;

    }

    @Override
    public double calculateLoanFinancing(){
        monthlyPayment=super.calculateLoanFinancing();
        if(specialCustomer){
            return monthlyPayment-= (monthlyPayment * DISCOUNT_RATE);
        }else{
            return monthlyPayment;
        }
    }

    @Override
    public String toString(){
        return super.toString()+
        "LOAN DETAILS(if applicable)\n"+
        "Loan Amount:"+getLoanAmount()+
        "\nLoan Payment Term: "+getLoanPaymentTerm()+
        "\ninterest Rate: "+getInterestRate()+
        "\nSpecail Customer: "+specialCustomer+
        "\nMonthly Loan Payment"+monthlyPayment;
    }

    public void showStoreInfo(){
        System.out.println(toString());
    }
    


}
