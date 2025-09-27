class TheeDemo {
    static int num = 8;

    public void set() {
        num++;
    }

    public void get() {
        System.out.println("Current value of num = " + num);
    }
}

class Main {
    public static void main(String[] args) {
        TheeDemo ob1 = new TheeDemo();
        TheeDemo ob2 = new TheeDemo();
        TheeDemo ob3 = new TheeDemo();

        ob1.set();
        ob1.get();

        ob1.set();
        ob1.get();

        ob2.set();
        ob2.get();

        ob3.set();
        ob3.get();

        ob3.set();
        ob3.get();

        ob1.set();
        ob1.get();

        ob2.set();
        ob2.get();

        ob3.set();
        ob3.get();
    }
}
