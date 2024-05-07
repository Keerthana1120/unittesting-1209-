package javaAssignment;

public class Letters {

        public static void main(String[] args) {
            char c='A';
            if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
            } else {
                System.out.print(c);
            }
        }
    }


