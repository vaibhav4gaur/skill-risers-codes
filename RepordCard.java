//Pascal Case
//CamelCase - Variables,Methods
//className- Noun
//class  = Member Variables + Member Functions
//Encapsulation - Binding Data Members + Functions into single Unity
//and that unit is called class
//class - Blue print / templets /Plan /Features Plan
//Good Encapsulation  = private data meme
class Student{
      //Member Variable of a class
      //Members Memory - create when object is created 
      //objects 
      private int rollno; //access the roll no 
      private String name;
      private int marks[] = new int[3]; //3 subjects marks stored in marks working
      private String CollegeName;
      //Construction - I call when object is created 
      //Prompts - Default Constructors
      //class name and constructors name is same.

      Student(){
           CollegeName = "SkillRisers";
      }
      Student(int rollno,String name,int marks[]){
      this();
        // Student();
      
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
      }
      //Member Functions / Methods
      private int totalMarks(){
        int total = 0; 
        for(var mark:marks){
              total += mark;
        }
        return total;
      }
       
      private double percentage()
      {
      return totalMarks() /marks.length; 
      }
      private String grade()
      {
           var percent = percentage();
           if(percent>=90){
            return "A GRADE";
           }
           else if(percent<90 && percent>=70){
            return "B GRADE";
           }
           else{
            return "C GRADE";
           } 
      }
     public  void reportCard()
      {
        System.out.println("************* REPORT CARD of  "+CollegeName+" ************");
  System.out.println("RollNo" + rollno);
  System.out.println("Name" + name);
//   System.out.println("Marks" + mark);
  for(var mark : marks){
    System.out.println("Marks" +mark);
  }
  System.out.println("Total Marks" +totalMarks());
  System.out.println("Percentage"+percentage());
  System.out.println("Grade"+grade());
      }
}
//DRY - don't repeat yourself
//SRP - Single Responsibility Single
//SOLID 
public class RepordCard{
      public static void main(String[] args) {
         Student ram;
         ram = new Student( 1001, "Ram Kumar",new int[]{90,80,100});
         ram.reportCard();
         //new student() - object create 
        //  ram.rollno = 10007;
        //  ram.name = "Rajveer";
        //  int marks[] = {10,20,30};
        //  ram.marks = marks; 
         Student shyam = new Student(1002,"Shyam Ramesh",new int[]{100,101,102});  
         shyam.reportCard();
        //  shyam.rollno = 10009;
        //  shyam.name = "Shyam Kumar";
        //  shyam.marks = new int[]{1000,10001,10005};
          //ram is  reference varibale of type student
         int x;
         x = 10;
      }
}
