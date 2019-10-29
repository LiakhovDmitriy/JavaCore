import java.util.Scanner;

public class Main {
    /*
     * Создайте класс, описывающий человека (создайте метод, выводящий информацию о человеке).
     * На его основе создайте класс студент (переопределите метод вывода информации).
     * Создайте класс Группа, который содержит массив из 10 объектов класса Студент.
     * Реализуйте методы добавления, удаления студента и метод поиска студента по фамилии. В случае попытки добавления 11 студента, создайте
     * собственное исключение и обработайте его. Определите метод toString() для группы так, что бы он выводил список студентов в алфавитном порядке.
     * Усовершенствуйте класс Group, добавив возможность интерактивного добавления объекта.
     * Реализуйте возможность сортировки списка студентов по фамилии.
     * Реализуйте возможность сортировки по параметру (Фамилия, успеваемость и т. д.).
     * Реализуйте интерфейс Военком, который вернет из группы массив студентов - юношей, которым больше 18 лет.
     */
    public static void main(String[] args) throws MyPersonExeptions {
        GroupOfStudents groupArr = new GroupOfStudents("AD");

        try {
            groupArr.aggStudentToGroup(new Student(true, "Bi", "Grend", 21, 80));
            groupArr.aggStudentToGroup(new Student(true, "Al", "Ter", 17, 75));
            groupArr.aggStudentToGroup(new Student(true, "Ka", "Nex", 19, 90));
            groupArr.aggStudentToGroup(new Student(true, "Fa", "Fix", 17, 69));
            groupArr.aggStudentToGroup(new Student(false, "Re", "Der", 20, 70));
            groupArr.aggStudentToGroup(new Student(true, "Ko", "Vse", 21, 80));
            groupArr.aggStudentToGroup(new Student(true, "Wq", "Hqw", 17, 80));
            groupArr.aggStudentToGroup(new Student(false, "Io", "Kol", 22, 78));
            groupArr.aggStudentToGroup(new Student(true, "Po", "Mol", 18, 87));
//            groupArr.aggStudentToGroup(new Student(true, "Bn", "Bol", 20, 78));
//            groupArr.aggStudentToGroup(new Student(true, "Vac", "Wal", 21, 91));
        } catch (MyPersonExeptions a) {
            System.out.println(a.getMessage());
        }
        System.out.println(groupArr.toString());

        System.out.println("Result of your search " + groupArr.searchStudentOnGroup("Hqw"));
        System.out.println();

        groupArr.deleteStudentOnGroup("Hqw");
        System.out.println();

        System.out.println(groupArr.searchStudentOnGroup("Hqw"));
        try {
            groupArr.aggStudentToGroup(new Student(true, "Vac", "Wal", 21, 91));
        } catch (MyPersonExeptions a) {
            System.out.println(a.getMessage());
        }
        System.out.println(groupArr.toString());

        System.out.println("Do you want add a student to group?");
        System.out.println("Enter  \"Yes\" To add a student.");
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            if (groupArr.count() >= 1) {
                String name = sc.next();
                if (name.equalsIgnoreCase("Yes") == true) {
                    groupArr.interactivAdding();
                    break;
                } else if (name.equals("No") == true) {
                    break;
                }
            } else System.out.println("Group is full!");
            break;
        }
        System.out.println(groupArr.toString());

        System.out.println("Sorted by score book");
        groupArr.sortByParametr(5, false);
        System.out.println(groupArr);

        System.out.println();
        Student[] recruterArr = groupArr.getRecruiters();
        for (int i = 1; recruterArr.length > i; i++) {

            System.out.println(i + ") " + "You are in army " + recruterArr[i]);
        }

    }
}