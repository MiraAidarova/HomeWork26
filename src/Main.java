import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        Box<String,Integer,String> box = new Box<>("Ящик",1000);
        System.out.println(box.getName());
        System.out.println(box.getPrice());
        System.out.println(box);
        box.methodT();



    }
}