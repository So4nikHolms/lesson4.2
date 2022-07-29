package Paska.ge2;

public class Nomain {
}
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int color = 0;

        System.out.print (
                "Какой цвет радуги Вам нравится?\n\n"
                        + "1 - Желтый\n"
                        + "2 - Синий\n"
                        + "3 - Оранжевый\n"
                        + "4 - Голубой\n"
                        + "5 - Зеленый\n"
                        + "6 - Фиолетовый\n"
                        + "7 - Красный\n"
                        + "Введите число, соответствующее ответу: "
        );

        color = in.nextInt();

        if (color == 12) {
            System.out.println("Желто-Синий");
        }
        else if (color == 21) {
            System.out.println("Сине-красный");
        }

        switch (color) {
            case 1:
                System.out.println("Желтый");
                break;

            case 2:
                System.out.println("Синий");
                break;

            case 3:
                System.out.println("Оранжевый");
                break;

            case 4:
                System.out.println("Голубой");
                break;

            case 5:
                System.out.println("Зеленый");
                break;

            case 6:
                System.out.println("Фиолетовый");
                break;

            case 7:
                System.out.println("Красный");
                break;

            default:
                System.out.println ("Необходимо выбрать цвет");

        }
    }
}