package Aufgabe;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        String helloWorld=" Hello World! ";
        String string1 = new String(helloWorld);
        String repeater;

        System.out.println(helloWorld+" hat "+string1.length()+" Zeichen");
        System.out.println(helloWorld.toUpperCase());
        System.out.println(helloWorld.toLowerCase());
        helloWorld = helloWorld.replace("World", "Codersbay");
        System.out.println(helloWorld);
        String trimHelloWorld=helloWorld.replaceAll("^\\s+", "");
        repeater=trimHelloWorld+"\n";
        System.out.println(repeater.repeat(15));
    }
}
