import models.Node;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Node node1 = new Node<Person>(new Person("Juan", 30));
        Node node2 = new Node<Person>(new Person("Maria", 35));
        Node node3 = new Node<Person>(new Person("Pepito", 20));
        Node node4 = new Node<Person>(new Person("Diego", 10));
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        System.out.println(node1.toString()
    );
    }
}
