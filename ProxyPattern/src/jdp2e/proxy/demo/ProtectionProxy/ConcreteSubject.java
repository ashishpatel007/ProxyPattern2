package jdp2e.proxy.demo.ProtectionProxy;

//ConcreteSubject class
class ConcreteSubject extends Subject
{
    @Override
    public void doSomeWork() {

        System.out.println("doSomeWork() inside ConcreteSubject is invoked.");
    }
}