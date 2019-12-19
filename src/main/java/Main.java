public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.execute();
    }

    void execute(){
        A a = foo();
        B abfield = bar(a);
        System.out.println(abfield.value);
    }

    A foo() {
        A a = new A();
        //interprocedural def
        a.bfield = new B();
        return a;
    }
    B bar(A a) {
        //interprocedural use
        B sink = a.bfield;
        return sink;
    }
}
