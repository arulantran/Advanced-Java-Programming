package runnable;

public class ThreadDemo implements Runnable {
public void run() {
for(int counter=1;counter<=100;counter++){
System.out.println("thread is running..."+counter);
}
}
public static void main(String args[]) {
ThreadDemo threadDemo = new ThreadDemo();
Thread t1 = new Thread(threadDemo);
t1.start();
}
}