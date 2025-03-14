public class MethodDemo {
    // Main method
    public static void main(String[] args) {
        greet();  // Calling the greet method
        printMessage("This is my message!");  // Calling the printMessage method with a string argument
    }
    
    // greet method
    public static void greet() {
        System.out.println("Hello from the greet method!"); 
    }
    
    // printMessage method
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
