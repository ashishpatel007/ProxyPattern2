package jdp2e.proxy.demo;

/**
 * Proxy Class: It will try to invoke the doSomething()
 * of a ConcreteSubject instance
 */
class Proxy extends Subject {
    
    static Subject cs;

    @Override
    public void doSomework()
    {

        System.out.println("Proxy call happening now...");
        //Lazy initialization:We'll not initialize until the method is
        //called
        if (cs == null)
        {
            cs = new ConcreteSubject();
        }
        cs.doSomework();


    }
}
