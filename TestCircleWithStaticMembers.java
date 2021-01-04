package ObjectSample;

public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle object is" + CircleWithStaticMembers.numberOfObjects);

        CircleWithStaticMembers c1 = new CircleWithStaticMembers();

        System.out.println("\nAfter creating c1");
        System.out.println("ci:radius (" + c1.radius + ") and number of Circle objects (" +
                c1.numberOfObjects + ")");

        CircleWithStaticMembers c2 = new CircleWithStaticMembers();

        c1.radius = 9;

        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1:radius (" + c1.radius + ")" +
                "and number of Circle Object (" + c1.numberOfObjects + ")");
        System.out.println("c2:radius (" + c2.radius + ") and number of Circle object (" +
                c2.numberOfObjects + ")");
    }
}
