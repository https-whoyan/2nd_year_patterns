package Task4;

class BoldDecorator extends TextDecorator {
    public BoldDecorator(TextEditor editor) {
        super(editor);
    }
    public String write() {
        return "<b>" + super.write() + "</b>";
    }
}