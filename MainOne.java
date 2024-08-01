import java.util.Scanner;

 class MainOne {
     public static void main(String args[]){
     Student s1=new Student();
      s1.setName("pranav");
      System.out.println(s1.getName());
   	s1.setRoll(20);
   	System.out.println(s1.getRoll());
 }
 }
 class Student{
 private String name;
 private int roll;
 
  public void setName(String fn)
    {
    	this.name=fn;	
    	
    }
    public String getName()
    {
    return name;
    }
    public void setRoll(int n)
    {
    	this.roll=n;
    	
    }
     public int getRoll()
    {
    return roll;
    }
    
}
//any instance variables of type private can be retrieved using setters and getters 
