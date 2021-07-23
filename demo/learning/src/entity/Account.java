package entity;

import com.sun.tools.internal.ws.wsdl.framework.QNameAction;

import java.util.Date;

/**
 * @author Michael Wijaya
 * @version $Id: entity.Account.java, v0.1 Jul 23, 2021 9:01 PM Michael Wijaya Exp $
 */
public class Account {

    //Surrogate identifier 1,2,3,4,5,6,7,8,9,10
    private int identifier;
    private String name;
    private String bio;
    private String location;
    private String website;
    private Date dob;

    public Account(int identifier, String name, String bio, String location, String website, Date dob){
        this.identifier = identifier;
        this.name = name;
        this.bio = bio;
        this.location = location;
        this.website = website;
        this.dob = dob;
    }

    public int getIdentifier(){
        return this.identifier;
    }
}
