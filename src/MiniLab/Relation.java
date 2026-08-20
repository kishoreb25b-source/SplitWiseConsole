package MiniLab;

public class Relation {
    public static void main(String[] args) {
        int choice=2;

        // true because choice is exactly 2.
        System.out.println(choice == 2);

        // true because choice is not 3.
        System.out.println(choice != 3);

        // true  because choice is between 1 and 3
        System.out.println(choice >= 1 && choice <= 3);
    }

}
