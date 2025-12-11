import controller.Stack;
import models.Node;
import models.Person;
import controller.Queue;
public class App {
    public static void main(String[] args) throws Exception {
        
        Node node1 = new Node<Person>(new Person("Juan", 30));
        Node node2 = new Node<Person>(new Person("Maria", 35));
        Node node3 = new Node<Person>(new Person("Pepito", 32));
        Node node4 = new Node<Person>(new Person("Diego", 31));
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        System.out.println(node1.toString());
        runStackExample();
        runQueueExample();
    }
    public static void runStackExample(){
            Stack<Person> stack = new Stack<Person>();
            stack.push(new Person("Juan", 30));
            stack.push(new Person("Maria", 35));
            stack.push(new Person("Pepito", 32));
            stack.push(new Person("Diego", 31));

            System.out.println("Tamaño: " + stack.size());
            stack.printAllNodes();
            System.out.println("POP: " + stack.size());
            System.out.println("Size= " + stack.size());
            stack.printAllNodes();
    }

    public static void runQueueExample(){
        Queue<Person> persons = new Queue<Person>();
        persons.enqueue(new Person("Juan", 30));
        persons.enqueue(new Person("Maria", 35));
        persons.enqueue(new Person("Pepito", 32));
        persons.enqueue(new Person("Diego", 31));
        System.out.println("Size: " + persons.size());
        persons.printAllNodes();
        System.out.println(persons.dequeue());
        System.out.println("Primera: " + persons.getFirst());
        System.out.println("Ultima: " + persons.getLast());
        System.out.println("Size: " + persons.size());
        persons.printAllNodes();
    }
}
