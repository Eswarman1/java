package Shape;
interface Shape {
    void draw();
}

// Concrete classes
class Circle implements Shape {
    public void draw() {
        System.out.println("I am a circle");
    }
}

class Oval implements Shape {
    public void draw() {
        System.out.println("I am an oval");
    }
}

class Factory {
    static Shape getObject(int x) {
        if (x == 1) return new Circle();
        else if (x == 2) return new Oval();
        else return null;
    }
}

class Shapes {
    public static void main(String[] args) {
        Shape sh; // Shape reference variable
        sh = Factory.getObject(1); // Circle object assigned
        if (sh != null) {
            sh.draw();
        } else {
            System.out.println("Invalid input");
        }

        sh = Factory.getObject(2); // Oval object assigned
        if (sh != null) {
            sh.draw();
        } else {
            System.out.println("Invalid input");
        }

        sh = Factory.getObject(3); // Invalid input
        if (sh != null) {
            sh.draw();
        } else {
            System.out.println("Invalid input");
        }
    }
}
