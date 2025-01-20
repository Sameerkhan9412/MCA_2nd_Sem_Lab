public class Q5{
    public static void main(String[] args) {
        
        double num1 = 25.5;
        double num2 = 4.2;
        double num3 = -3.7;
        
        // Math.abs() - Returns the absolute value of a number
        System.out.println("Math.abs(" + num3 + ") = " + Math.abs(num3));  // Output: 3.7
        
        // Math.ceil() - Rounds a number UP to the nearest integer
        System.out.println("Math.ceil(" + num1 + ") = " + Math.ceil(num1));  // Output: 26.0
        
        // Math.floor() - Rounds a number DOWN to the nearest integer
        System.out.println("Math.floor(" + num1 + ") = " + Math.floor(num1));  // Output: 25.0
        
        // Math.max() - Returns the larger of two numbers
        System.out.println("Math.max(" + num1 + ", " + num2 + ") = " + Math.max(num1, num2));  // Output: 25.5
        
        // Math.min() - Returns the smaller of two numbers
        System.out.println("Math.min(" + num1 + ", " + num2 + ") = " + Math.min(num1, num2));  // Output: 4.2
        
        // Math.pow() - Returns the value of the first argument raised to the power of the second argument
        System.out.println("Math.pow(" + num2 + ", 2) = " + Math.pow(num2, 2));  // Output: 17.64
        
        // Math.sqrt() - Returns the square root of a number
        System.out.println("Math.sqrt(" + num1 + ") = " + Math.sqrt(num1));  // Output: 5.05
        
        // Math.random() - Returns a random number between 0.0 and 1.0
        System.out.println("Math.random() = " + Math.random());  // Output: A random number between 0.0 and 1.0
        
        // Math.round() - Rounds a number to the nearest integer
        System.out.println("Math.round(" + num2 + ") = " + Math.round(num2));  // Output: 4
        
        // Math.sin() - Returns the sine of an angle (in radians)
        double angleInRadians = Math.toRadians(30);  // Convert 30 degrees to radians
        System.out.println("Math.sin(30 degrees) = " + Math.sin(angleInRadians));  // Output: 0.5
        
        // Math.cos() - Returns the cosine of an angle (in radians)
        System.out.println("Math.cos(30 degrees) = " + Math.cos(angleInRadians));  // Output: 0.86602540378
        
        // Math.tan() - Returns the tangent of an angle (in radians)
        System.out.println("Math.tan(30 degrees) = " + Math.tan(angleInRadians));  // Output: 0.5773502691896257
        
        // Math.toRadians() - Converts degrees to radians
        System.out.println("Math.toRadians(45 degrees) = " + Math.toRadians(45));  // Output: 0.7853981633974483
        
        // Math.toDegrees() - Converts radians to degrees
        double angleInRadians2 = Math.PI / 4;  // 45 degrees in radians
        System.out.println("Math.toDegrees(π/4 radians) = " + Math.toDegrees(angleInRadians2));  // Output: 45.0
        
        // Math.log() - Returns the natural logarithm (base e) of a number
        System.out.println("Math.log(" + num1 + ") = " + Math.log(num1));  // Output: 3.238
    }
}
