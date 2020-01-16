public class ExerciseA{
    public static final int NUM_ITER = 10;

    static class MyThread extends Thread{
        private String name;

        MyThread(String name) {
            this.name = name;
        }

        void writeHello() {
            System.out.println("Hello " + name);
        }

        @Override
        public void run() {
            for (int i = 0; i < NUM_ITER; i++)
                writeHello();
        }
    }

    public static void main(String[] args) throws Exception {
        Thread a = new MyThread("A");
        Thread b = new MyThread("B");
        a.start();
        b.start();

        a.join();
        System.out.println("i'm done");
        b.join();

    }
}
