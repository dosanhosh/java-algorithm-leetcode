package src.sh.SOLID;

// chi nen mo rong nhung khong duoc sua doi => dung interface hoac abstract de mo rong de dang
public class OpenClosedPrinciple {
    interface Shape {
        double area();
    }

    interface Build {
        double build();
    }

    interface Hand extends Build, Shape {
    }

    static class Circle implements Shape {
        double radius;

        public double area() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle implements Shape {
        double width;
        double height;

        public double area() {
            return width * height;
        }
    }
}
