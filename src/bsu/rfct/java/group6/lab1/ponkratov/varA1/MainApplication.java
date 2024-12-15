package bsu.rfct.java.group6.lab1.ponkratov.varA1;


public class MainApplication {
    // Конструктор класса отсутствует!!!
    // Главный метод главного класса
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        // Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Potatoes")) {
                breakfast[itemsSoFar] = new Potatoes(parts[1]);
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            itemsSoFar++;
        }

        // Подсчет количества картошки
        Food potatoSample = new Potatoes(""); // Создаем образец картошки для сравнения
        int potatoCount = countProductsByType(breakfast, potatoSample);
        System.out.println("Количество картошки в меню: " + potatoCount);

        // Перебор всех элементов массива
        for (Food item : breakfast) {
            if (item != null) {
                // Если элемент не null – употребить продукт
                item.consume();
            } else {
                // Если дошли до элемента null – значит достигли конца
                break;
            }
        }
        System.out.println("Всего хорошего!");
    }

    // Метод для подсчета продуктов заданного типа
    public static int countProductsByType(Food[] breakfast, Food typeToCount) {
        int count = 0;
        for (Food item : breakfast) {
            if (item != null && item.equals(typeToCount)) {
                count++;
            }
        }
        return count;
    }
}
