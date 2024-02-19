package jdp2e.proxy.demo;

public class ProxyPatternQuestionsAndAnswers {
    public static void main(String[] args) {
        System.out.println("***Proxy Pattern Demo without lazy instantiation***\n");
        Proxy3 px = new Proxy3();
        px.doSomework();
        //2nd proxy instance
        Proxy3 px2 = new Proxy3();
        px2.doSomework();

        System.out.println("Instance Count="+Proxy3.count);
    }
}
