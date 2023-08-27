public class Person
{
   int age;
   String name;
   //Using constructor
    public Person(String name, int age)
    {
      this.name = name;
      this.age = age;
    }
    public String getName() 
    {
    return name;
    }
    public int getAge()
    {
    return age;
    }
}
public class Main
{
    public static void main(String[] args) 
    {
      //creating two instances  
     Person person1 = new Person("Raktim", 25);
     Person person2 = new Person("Kanak", 25);
      //instance no. 1 
     System.out.println("First person:");
     System.out.println("Name: " + person1.getName());
     System.out.println("Age: " + person1.getAge());
      //instance no. 2  
     System.out.println("Second person:\n");
     System.out.println("Name: " + person2.getName());
     System.out.println("Age: " + person2.getAge());
    }
    
}
