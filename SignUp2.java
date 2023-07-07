package com.example.student;

public class SignUp2 {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.sethours(45);	/* call the sethours() method with the s1 object - this object that called the sethours() method */
        s1.setgpa(3.13);
        System.out.println("You had " + s1.gethours()
                + " credits");
        System.out.println("You had a " + s1.getgpa()
                + " GPA");
        s1.addcourse(3, 4);	// 3 credit course with an A
        System.out.println("You now have " + s1.gethours()
                + " credits");
        System.out.println("You now have a " + s1.getgpa()
                + " GPA");
        s2.sethours(30);	/* call the sethours() method with the s2 object - this object that called the sethours() method */
        s2.setgpa(3.25);
        System.out.println("You had " + s2.gethours()
                + " credits");
        System.out.println("You had a " + s2.getgpa()
                + " GPA");
        s2.addcourse(3, 3);	// 3 credit course with an B
        System.out.println("You now have " + s2.gethours()
                + " credits");
        System.out.println("You now have a " + s2.getgpa()
                + " GPA");
    }

}
