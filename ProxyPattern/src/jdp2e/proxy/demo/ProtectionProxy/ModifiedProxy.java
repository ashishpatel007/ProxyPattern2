package jdp2e.proxy.demo.ProtectionProxy;


import java.util.ArrayList;
import java.util.List;

/**
 * Proxy Class: It will try to invoke the doSomething()
 * of a ConcreteSubject instance
 */
class ModifiedProxy extends Subject
{
    static Subject cs;
    String currentUser;
    List<String> registeredUsers;
    //Or, simply create this mutable list in one step
    /*
    List<String> registeredUsers = new ArrayList<String>()(Arrays.asList("Admin", "Rohit",
    "Sam"));
     */
    public ModifiedProxy(String currentUser)
    {
        //Registered users are Admin, Rohit and Sam only.
        registeredUsers = new ArrayList<String>();
        registeredUsers.add("Admin");
        registeredUsers.add("Rohit");
        registeredUsers.add("Sam");
        this.currentUser = currentUser;
    }

    @Override
    public void doSomeWork()
    {
        System.out.println("\n Proxy call happening now...");
        System.out.println(currentUser+" wants to invoke a proxy method.");
        if (registeredUsers.contains(currentUser))
        {
            //Lazy initialization:We'll not instantiate until
            //the method is called
            if (cs == null)
            {
                cs = new ConcreteSubject();
            }
            // Allow the registered user to invoke the method
            cs.doSomeWork();
        }
        else
        {
            System.out.println("Sorry " +currentUser+" , you do not have access rights.");
        }

    }
}

