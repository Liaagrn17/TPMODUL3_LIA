public class Calculation implements Runnable {
    
    double side, area, radius;
    double phi = 3.14;

    public void setSquare(double side) throws IllegalArgumentException {
        if (side < 1) {
            throw new IllegalArgumentException("Sides cannot be less than 1");
        }
        this.side = side;
        this.area = side * side;
    }
    public double getSquare() {
        return this.area;
    }
    public void setCircle(double radius) throws IllegalArgumentException {
        if (radius < 1) {
            throw new IllegalArgumentException("Radius cannot be less than 1");
        }
        this.radius = radius;
        this.area = this.phi * radius * radius;
    }
    public double getCircle() {
        return this.area;
    }
    public void setTrapezoid(double a, double b, double c) throws IllegalArgumentException {
        if (a < 1 || b < 1 || c < 1) {
            throw new IllegalArgumentException("a,b,t cannot be less than 1");
        }
        this.side = (a + b) / 2;
        this.area = c * this.side;
    }
    public double getTrapezoid() {
        return this.area;
    }
    @Override
    public void run() {
        System.out.println("Program will start in");
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("error: " + e.getMessage());
            }
        }
        System.out.println("Program start");
    }
}