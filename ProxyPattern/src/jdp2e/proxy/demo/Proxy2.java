package jdp2e.proxy.demo;

/**
 * You could create the ConcreteSubject instance in the
 * proxy class constructor, as follows.
 *
 *
 */
class Proxy2 extends Subject
{

    static Subject cs;

    public Proxy2()
    {
        //Instantiating inside the constructor
        cs = new ConcreteSubject();
    }

    @Override
    public void doSomework() {

    }
}
