
public class NullPointerExceptionHandler {

    // Version A:
    public static void versionA() {
        System.out.println("Version A: Identifying NPE without handling it.");
        try {
            String str = null;
            System.out.println(str.length());  // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    // Version B: 
    public static void versionB() {
        System.out.println("\nVersion B: Handling NPE using an if condition.");
        String str = null;
        if (str != null) {
            System.out.println(str.length());  // Safe to call as str is checked first
        } else {
            System.out.println("Object is null, cannot perform method call.");
        }
    }

    // Version C:
    public static void versionC() {
        System.out.println("\nVersion C: Preventing NPE with Optional.");
        String str = null;
        
       
        java.util.Optional<String> optionalStr = java.util.Optional.ofNullable(str);
        
        // Using ifPresent to execute code only if the object is not null
        optionalStr.ifPresent(s -> System.out.println(s.length()));
        
        // Alternatively, using orElse to provide a default value if the object is null
        String defaultStr = optionalStr.orElse("Default String");
        System.out.println("Value from Optional: " + defaultStr);
    }

    public static void main(String[] args) {
        // Demonstrate the three versions
        versionA();  // Version A: Identifying NPE
        versionB();  // Version B: Handling NPE
        versionC();  // Version C: Preventing NPE
    }
}
