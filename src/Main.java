public class Main {
    public static void main(String[] args) {
        System.out.println("Дз 1 и 2 (первая задача)");
        int age = 19;
        if (age >= 18) {
            System.out.println("Уважаемый пользователь, поздравляем Вас с совершенолетием.");
        } else {
            System.out.println("Уважаемый пользователь, Вы еще не достигли совершеннолетия");
        }

        System.out.println("Дз 1 и 2 (вторая задача)");
        int childAge = 9;
        if (childAge == 7 || childAge >= 7) {
            System.out.println("Ребенок ходит в школу");
        } else {
            System.out.println("Ребенок еще не ходит в школу");
        }

        int personAge = 7;
        if (personAge == 18 || personAge > 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек еще учится в школе и не может отправляться в университет");
        }

        int studentAge = 7;
        if (studentAge == 24 || studentAge > 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            System.out.println("Человек еще не окончил университет и ему не пора искать первую работу");
        }

        System.out.println("Дз 1 и 2 (третья задача)");
        int wagonCapacity = 102;
        int seating = 60;
        int standing = wagonCapacity - seating;
        System.out.println(standing);
        seating = 40;
        standing = 11;
        if (seating <= 60 && standing <= standing) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        } else {
            System.out.println("В вагоне нет сидячих и стоячих мест");
        }

        wagonCapacity = 105;
        if (wagonCapacity > 102) {
            System.out.println("Вагон полностью забит");
        } else {
            System.out.println("В вагоне еще есть места");
        }

        System.out.println("Дз 3 (первая задача)");
        int age1 = 3;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то ему не нужно ходить в детский сад");
        }

        int age2 = 9;
        if (age2 >= 7 && age2 <= 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        } else {
            System.out.println("Если возраст человека равен " + age2 + ", то ему не нужно ходить в школу");
        }

        int age3 = 23;
        if (age3 > 18 && age3 <= 24) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age3 + ", то ему не нужно ходить в университет");
        }

        int age4 = 30;
        if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age4 + ", то ему не нужно ходить на работу");
        }

        System.out.println("Дз 3 (вторая задача)");
        int age5 = 3;
        if (age5 < 5) {
            System.out.println("Если ребенку " + age5 + ", то ему нельзя кататься на аттракционах.");
        } else if (age5 > 5 && age5 < 14) {
            System.out.println("Если ребенку " + age5 + ", то ему можно кататься на аттракционах в сопровождении взрослого.");
        } else if (age5 > 14) {
            System.out.println("Если ребенку " + age5 + ", то ему можно кататься на аттракционах одному.");

        }

        System.out.println("Дз 3 (третья задача)");
        int one = 654;
        int two = 30;
        int free = 100;
        if (one > two && one > free) {
            System.out.println(one);
        } else if (two > one && two > free) {
            System.out.println(two);
        } else if (free > one && free > two) {
            System.out.println(free);

        }

    }

}



