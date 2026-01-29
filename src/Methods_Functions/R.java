package Methods_Functions;

class R implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("closed");
    }
}

 class Test_Day_42 {

    static void m() {
        try (R r = new R()) {
            System.out.println("try");
        }
    }

    public static void main(String[] args) {
        m();
    }
}