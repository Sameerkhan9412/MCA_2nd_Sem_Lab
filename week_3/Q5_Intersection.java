class Rectangle {
    int x, y, width, height;

    // Constructor to initialize the rectangle
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Method to print the rectangle details
    public void print() {
        System.out.println("Rectangle [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]");
    }

    // Method to compute the intersection of two rectangles
    public Rectangle intersection(Rectangle r) {
        // Find the overlap area
        int xOverlap = Math.max(this.x, r.x);
        int yOverlap = Math.max(this.y, r.y);
        int x2Overlap = Math.min(this.x + this.width, r.x + r.width);
        int y2Overlap = Math.min(this.y + this.height, r.y + r.height);

        // Check if there is no overlap
        if (x2Overlap <= xOverlap || y2Overlap <= yOverlap) {
            return new Rectangle(0, 0, 0, 0);  // Return a rectangle with no area
        }

        // Return the intersecting rectangle
        return new Rectangle(xOverlap, yOverlap, x2Overlap - xOverlap, y2Overlap - yOverlap);
    }
}

public class Q5_Intersection {
    public static void main(String[] args) {
        // Create two rectangles
        Rectangle r1 = new Rectangle(2, 3, 4, 5);
        Rectangle r2 = new Rectangle(3, 4, 5, 6);

        // Print the two rectangles
        System.out.println("Rectangle 1:");
        r1.print();
        System.out.println("Rectangle 2:");
        r2.print();

        // Calculate the intersection
        Rectangle r3 = r1.intersection(r2);

        // Print the intersection
        System.out.println("Intersection Rectangle:");
        r3.print();
    }
}
