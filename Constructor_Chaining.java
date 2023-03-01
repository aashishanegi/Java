class Studentbio {
int rollno;
String name, course;
float fee;
Studentbio(int rollno,String name,String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
Studentbio(int rollno,String name,String course ,float fee){
this(rollno, name, course);
this.fee=fee;
}
void Display() {
System.out.println(rollno+" "+name+" "+course+" "+fee);
}
}
class Constructor_chaining {
public static void main(String args[]) {
System.out.println("Name- Aashisha Negi ");
System.out.println("SAP ID:- 500091664");
System.out.println("Roll no. :- R2142210463");
System.out.println("Implementation of this keyword");
System.out.println();
Studentbio s1=new Studentbio(111,"Ankit","java");
Studentbio s2=new Studentbio(222,"Manav","java",6000f);
s1.Display();
s2.Display();
}
}
