package com.example.student;

public class SignUp {
    public static void main(String[] args)
    {
        Student s = new Student();
        s.sethours(45);
        s.setgpa(3.13);
        System.out.println("You had " + s.gethours()
                + " credits");
        System.out.printf("You had a %.2f GPA\n", s.getgpa());
        s.addcourse(3, 4);	// 3 credit course with an A
        System.out.println("You now have " + s.gethours()
                + " credits");
        System.out.printf("You now have a %.2f GPA\n",
                s.getgpa());
    }
}
