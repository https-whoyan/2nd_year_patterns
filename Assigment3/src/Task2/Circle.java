package Task2;

class Circle extends Shape {
    Circle(Renderer renderer) {
        super(renderer);
    }
    void draw() {
        renderer.renderShape("Circle");
    }
}