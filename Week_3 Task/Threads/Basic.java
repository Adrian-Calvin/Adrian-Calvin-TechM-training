class Basic extends Thread {
    public void run() {
        System.out.println("Hi ,Good Morning");
    }

    public static void main(String[] args) {
        Basic thread = new Basic();
        thread.start();
    }
}
