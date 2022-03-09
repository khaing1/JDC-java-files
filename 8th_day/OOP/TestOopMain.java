class TestOopMain{
  public static void main(String args[]){
    TestOop student1=new TestOop();
    student1.name="Kyaw Kyaw";
    student1.age=15;
    student1.grade=10;
    student1.father="U Zaw Zaw";
    System.out.println("Student name: "+student1.name);
    System.out.println("Student age: "+student1.age);
    System.out.println("Student grade: "+student1.grade);
    System.out.println("Student's father: "+student1.father);
    System.out.println();
    TestOop student2=new TestOop();
    student2.name="Hla Hla";
    student2.age=16;
    System.out.println("Student name: "+student2.name);
    System.out.println("Student age: "+student2.age);
    System.out.println("Student grade: "+student2.grade);
    System.out.println("Student's father: "+student2.father);

  }
}