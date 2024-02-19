package jdp2e.proxy.demo;

/**
 * Proxy Class
 * It will try to invoke the doSomething() of a ConcreteSubject instance
 */
class Proxy3 extends Subject
{
    static Subject cs;
    static int count = 0;   // A counter to track the number of instances

    public Proxy3()
    {
        //Instantiating inside the constructor
        cs = new ConcreteSubject();
        count++;
    }

    @Override
    public void doSomework() {
        System.out.println("Proxy call happening now...");
        //Lazy initialization:We'll not instantiate until the method is
        //called
        cs.doSomework();
    }
}
