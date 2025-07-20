package org.example.patterns.structural.decorator;

// Base Component
interface VisualComponent {
//    This defines the core behavior that all UI elements must implement.
    void draw();
}

//---- Implement Class - VisualComponent --------------------------------------------------------------
// Concrete Component
class TextView implements VisualComponent {
    @Override
    public void draw() {
        System.out.println("Drawing a text view");
    }
}

//---- Implement Class - VisualDecorator --------------------------------------------------------------

// Base Decorator || The abstract VisualDecorator is open for extension (via subclassing) but closed for direct use.
abstract class VisualDecorator implements VisualComponent {
    protected VisualComponent component;

    public VisualDecorator(VisualComponent component) {
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw();
    }
}


//---- Extend VisualDecorator - BorderDecorator Class --------------------------------------------------------------
// --       public void draw() {
// --       private void drawBorder() {


// Concrete Decorators
class BorderDecorator extends VisualDecorator {
    public BorderDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void draw() {
        super.draw();
        drawBorder();
    }

    private void drawBorder() {
        System.out.println("Drawing a border");
    }
}
//---- Extend VisualDecorator - ScrollDecorator --------------------------------------------------------------
// --       public void draw() {
// --       private void drawScrollBar() {

class ScrollDecorator extends VisualDecorator {
    public ScrollDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void draw() {
        super.draw();
        drawScrollBar();
    }

    private void drawScrollBar() {
        System.out.println("Drawing a scroll bar");
    }
}