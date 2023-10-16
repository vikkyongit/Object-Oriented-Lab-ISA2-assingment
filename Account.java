class Account {
    private int account_number;
    private int account_balance;

    public void show Data() {
        //code to show data 
    }

    public void deposit(int a) {
        if (a < 0) {
            //show error 
        } else
            account_balance = account_balance + a;
    }
}
