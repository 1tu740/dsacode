class base {
    public static void amethod(int i) {
        System.out.println("value is " + i);
    }

}

class main extends base {
    public static void amethod(int i) {
        System.out.println("value of i is" + i);
    }

    public static void amethod(String a) {
        System.out.println("name is " + a);
    }
}
