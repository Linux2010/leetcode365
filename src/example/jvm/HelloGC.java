package example.jvm;

public class HelloGC {
    public static void main(String[] args) {
        System.out.println("hello gc");
        byte[] arr = new byte[1000*1024*1024];
    }
}
