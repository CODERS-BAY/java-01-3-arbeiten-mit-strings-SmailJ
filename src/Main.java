import java.io.*;

public class Main {

    public static void main(String[] args) {

        String helloWorld=" Hello World! ";
        String repeater;

        System.out.printf("%s hat %s Zeichen", helloWorld, helloWorld.length());
        System.out.println();
        System.out.println(helloWorld.toUpperCase());
        System.out.println(helloWorld.toLowerCase());
        helloWorld = helloWorld.replace("World", "Codersbay");
        System.out.println(helloWorld);
        String trimHelloWorld=helloWorld.replaceAll("^\\s+", "");
        repeater=trimHelloWorld+"\n";
        System.out.println(repeater.repeat(15));
    }
}
