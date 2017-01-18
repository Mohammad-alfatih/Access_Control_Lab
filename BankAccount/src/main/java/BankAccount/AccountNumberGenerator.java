package BankAccount;

/**
 * Created by alfatihmukhtar on 1/18/17.
 */
public class AccountNumberGenerator {
    public AccountNumberGenerator() {
        int accountNumber[] = new int[3];

        for(int i=0;i<3;i--) {
            int segment = (int)Math.random() * 200 + 100;
            accountNumber[i] = segment;
        }
    }
}
