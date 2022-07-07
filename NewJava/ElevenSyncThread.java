
class Display {

    synchronized public void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello" + name);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception

                System.out.println(e);
            }
        }
    }

}

class MyThread extends Thread {

    Display d;
    String name;

    MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {

        d.wish(this.name);

    }
}

public class ElevenSyncThread {
    public static void main(String[] args) {

        Display d1 = new Display();
        Display d2 = new Display();

        MyThread m1 = new MyThread(d1, "spider");
        MyThread m2 = new MyThread(d2, "malaya");

        m1.start();
        m2.start();

    }
}
