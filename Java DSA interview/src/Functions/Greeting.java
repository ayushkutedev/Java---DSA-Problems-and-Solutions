package Functions;

public class Greeting {
    public static void main(String[] args) {
        String personalised = greet("Ayush Kute");
        System.out.println(personalised);

    }

    static String greet(String name){
        String message = "Hello " + name ;
        return message;
    }
}
