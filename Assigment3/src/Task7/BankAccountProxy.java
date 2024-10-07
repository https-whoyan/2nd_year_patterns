package Task7;

class BankAccountProxy implements BankAccount {
    private RealBankAccount realAccount;
    private final String accountHolder;

    public BankAccountProxy(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void accessAccount() {
        if (authenticate()) {
            if (realAccount == null) {
                realAccount = new RealBankAccount(accountHolder);
            }
            realAccount.accessAccount();
        } else {
            System.out.println("Access denied for: " + accountHolder);
        }
    }
    private boolean authenticate() {
        return "authorizedUser".equals(accountHolder);
    }
}