public interface Banker {

    double withdraw(double amount) throws InsufficientFundException;
    void deposit(double amount) throws FundLimitExceededException;

}
