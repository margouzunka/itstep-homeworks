package homework4.task3;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor;
        textEditor = new TextEditor();

        textEditor.addText("Hello world");
        textEditor.printText();

        textEditor.addText("How are your?");
        textEditor.printText();

        textEditor.addText("Where are you from?");
        textEditor.printText();

    }

}
