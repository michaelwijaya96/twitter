package service;

import entity.Account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Michael Wijaya
 * @version $Id: AccountService.java, v0.1 Jul 23, 2021 9:12 PM Michael Wijaya Exp $
 */
public class AccountService {

    public List<Account> accounts = new ArrayList<>();

    public void createAccount(int identifier, String name, String bio, String location, String website, Date dob) {
        if (accounts
                .stream()
                .anyMatch(account -> account.getIdentifier() == identifier)) {
            System.out.println("identifiernya dobel nih :" +  identifier);
        }else {
            accounts.add(new Account(identifier, name, bio, location, website, dob));
        }
    }

}
