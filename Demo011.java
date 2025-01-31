class Parent {
    public String Name = "Hitler";
    
    void parentDetails() {
        System.out.println("Parent's name is " + Name);
    }
}

class Child extends Parent {
    String Son = "Jean Marie";
    
    void childDetails() {
        // Directly accessing Name from the Parent class
        System.out.println("Son's full name is " + Name + ". " + Son);
    }
}

public class Demo011 {
    public static void main(String[] args) {
        Parent pobj = new Parent(); // Parent object
        pobj.parentDetails(); // Call parentDetails() method

        Child cobj = new Child(); // Child object
        cobj.childDetails(); // Call childDetails() method
    }
}
