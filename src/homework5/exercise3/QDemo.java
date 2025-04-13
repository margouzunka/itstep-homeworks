package homework5.exercise3;

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        int i;

        System.out.println("Иcпoльзoвaниe очереди bigQ для сохранения алфавита");

        for(i=0; i < 26; i++)
            bigQ.put((char) ('А' + i));

        System.out.print("Coдepжимoe очереди ЬigQ: ");
        for (i=0; i < 26; i++) {
            Object obj = bigQ.get();
            if(obj != null) {
                System.out.print(obj);
            }
        }
        System.out.println("\n");
        System.out.println("Иcпoльзoвaниe очереди smallQ для генерации ошибок");

        for(i = 0; i < 5; i++) {
            System.out.print("Пoпыткa сохранения " + ( char) ( 'Z' - i) ) ;
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        System.out.print("Содержимое smallQ: ");
        for(i=0; i < 5; i++) {
            Object obj = smallQ.get();
            if (obj != null) {
                System.out.print(obj);
            }
        }

    }

}
