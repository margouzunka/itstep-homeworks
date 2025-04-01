package homework4.task3;

public class TextEditor {
    String string = "";

    public void addText(String text) {
        string = string + text;

    }
    public void printText() {
        System.out.println("Итоговая строка: " + string);
    }

}
