package com.example.rectanglemethod;
import javax.swing.JOptionPane;
public class LengthDemo {
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle();

        System.out.println("Sending the value 10.0 " +
                "to the setLength method.");

        box.setLength(10.0);

        System.out.println("Done");

        box.setWidth(20.0);

        double size1;
        size1 = box.getLength();

        double size2;
        size2 = box.getWidth();

        System.out.println("The box's length is " + size1);
        System.out.println("The box's width is " + size2);

        double area;
        area = box.getArea();

        System.out.println("The box's area is " + area);

        PlayListEntry album = new PlayListEntry();

        album.setTitle("Incredibles OST");
        album.setArtist("Michael Giacchino");
        album.setPlayCount(4000000);

        System.out.println("Title: " + album.getTitle());
        System.out.println("Artist: " + album.getArtist());
        System.out.println("Plays: " + album.getPlayCount());

        double number;
        double totalArea;
        String input;

        Rectangle kitchen = new Rectangle();
        Rectangle bedroom = new Rectangle();
        Rectangle den = new Rectangle();

        input = JOptionPane.showInputDialog("What is the " +
                "kitchen's length?");

        number = Double.parseDouble(input);
        kitchen.setLength(number);
        input = JOptionPane.showInputDialog("What is the " +
                "kitchen's width?");
        number = Double.parseDouble(input);
        kitchen.setWidth(number);
        input = JOptionPane.showInputDialog("What is the " +
                "bedroom's length?");
        number = Double.parseDouble(input);
        bedroom.setLength(number);
        input = JOptionPane.showInputDialog("What is the " +
                "bedroom's width?");
        number = Double.parseDouble(input);
        bedroom.setWidth(number);
        input = JOptionPane.showInputDialog("What is the " +
                "den's length?");
        number = Double.parseDouble(input);
        den.setLength(number);
        input = JOptionPane.showInputDialog("What is the " +
                "den's width?");
        number = Double.parseDouble(input);
        den.setWidth(number);

        totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();

        JOptionPane.showMessageDialog(null, "The total area "+
                "of the rooms is " + totalArea);

        System.exit(0);

    }
}
