package com.example.objectsandclasses3;

public class ex98 {
    public static void main(String[] args)
    {
        Rectangle91 r = new Rectangle91(5,4);
        Cube91 c = new Cube91(3,2,1);

        changelength(r);
        System.out.println();
        changelength(c);
    }

    public static void changelength(Rectangle91 rc) {
        String rcrc  = rc.toString();
        System.out.println(rcrc);

        if (rcrc.startsWith("Cube91"))
            rc.setlength(15);
        else if (rcrc.startsWith("Rectangle91"))
            rc.setlength(10);
        rc.calcarea();
        rc.print();
    }
}




