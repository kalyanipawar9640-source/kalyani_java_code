
//13. Write a recursive method that reverses a string.

class ReverseStringDemo {
    static String reverse(String str) {
        if (str.isEmpty())
            return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("JAVA"));
    }
}