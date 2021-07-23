/**
 * @author Michael Wijaya
 * @version $Id: Manusia.java, v0.1 Jul 23, 2021 8:33 PM Michael Wijaya Exp $
 */

public class Manusia {

    //Data Members
    private int age;
    private String gender;
    private String name;
    private float weight;
    private float height;
    private String status;
    //Functions
    public void walk(){
        System.out.println(name + " is walking");
    }

    public void run(){
        System.out.println(name + " is running");
    }

    //Constructor
    public Manusia(String name){
        this.name = name;
    }

}
