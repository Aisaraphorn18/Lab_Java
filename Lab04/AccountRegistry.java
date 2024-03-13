package Lab04;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class AccountRegistry {
    // ประกาศ ArrayList เพื่อเก็บข้อมูล Account
    private ArrayList<Account> accounts = new ArrayList<Account>();

    private int countActiveAccounts(){
        return countActiveAccounts(Account.Status.ACTIVE);
    }

    // เมธอดส่วนตัวสำหรับนับจำนวนบัญชีที่มีสถานะเป็น ACTIVE
    private int countActiveAccountsByStatus(Account.Status status) {
        int count = 0;
        for (Account account: accounts)
            if (account.getStatus() == Account.Status.ACTIVE)
                count++;
        return count;
    }

    // เมธอดสำหรับเพิ่มบัญชีเข้าในทะเบียน
    public void addAccount(Account acc) {
        // ถ้าบัญชีเป็น null ให้โยน NullPointerException
        if (acc == null)
            throw new NullPointerException("Account is null.");
        else
            accounts.add(acc);
    }

    // เมธอดสำหรับดึงข้อมูลบัญชีด้วยเลขที่บัญชี
    public Account getAccount(String accountNumber) {
        for (Account account: accounts)
            // หากเจอบัญชีที่มีเลขที่บัญชีตรงกับที่ระบุ ให้คืนค่าบัญชีนั้น
            if (account.getAccountNumber().equals(accountNumber))
                return account;
        // หากไม่เจอ โยน NoSuchElementException
        throw new NoSuchElementException("No such account number.");
    }

    // เมธอดสำหรับรายการบัญชีทั้งหมดที่มีสถานะเป็น ACTIVE
    //themod overloading
    public Account[] listAccounts() {
        return listAccounts(Account.Status.ACTIVE);
    }
    public Account[] listAccounts(Account.Status status){
       Account[] results = new Account[countActiveAccounts(status)];

        int idx = 0;
        for (Account account: accounts)
            // ถ้าบัญชีมีสถานะเป็น ACTIVE ให้เพิ่มลงใน Array
            if (account.getStatus() == status)
                results[idx++] = account;

        return results;
    }

}

