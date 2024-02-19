package jdp2e.proxy.demo;

/**
 * Concrete Subject class
 */
class ConcreteSubject extends Subject {

    @Override
    public void doSomework() {
        System.out.println("doSomework() inside Concrete subject is invoked.");
    }
}
