class Student
{ 
  int stno;
  String name;
  float m1,m2,m3,total;
  void getstudentdetels()
 {
   stno=1;
   name="sathya";
   m1=66f;
   m2=77.77f;
   m3=67.76f;
  }
void gettotalmarks()
  {
    total=m1+m2+m3;
  }
void displaystudentdetels()
   {
   System.out.println("stno="+stno);
   System.out.println("studentname="+name);
   System.out.println("marks1="+m1);
   System.out.println("marks="+m2);
   System.out.println("marks="+m3);
   System.out.println("total="+total);
   }
 public static void main(String[] args)
{
 Student s=new Student();
 s.displaystudentdetels();
}
}

