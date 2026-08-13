package MiniLab;

public class Casting {
    public static void main(String[] args) {

        double value = 9.7;
        {
            int d = (int) value; //truncates/removes the decimal part
            System.out.println(d);
        }
        {
            int math = (int) Math.round(value); //Rounds the value to the nearest whole number.
            System.out.println(math);
        }
    }
}
