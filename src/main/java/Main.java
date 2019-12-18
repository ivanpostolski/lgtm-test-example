public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.execute();
    }

    void execute(){
        A a = foo();
        bar(a);
    }

    A foo() {
        A a = new A();
        //interprocedural def
        a.bfield = new B();
        return a;
    }
    void bar(A a) {
        //interprocedural use
        B sink = a.bfield;
    }
}
