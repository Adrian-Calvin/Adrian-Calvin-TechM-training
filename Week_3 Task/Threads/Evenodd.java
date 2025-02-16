class Eventhread extends Thread{
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class Oddthread extends Thread{
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class Evenodd{
    public static void main(String[] args){
        new Eventhread().start();
        new Oddthread().start();
    }
}

