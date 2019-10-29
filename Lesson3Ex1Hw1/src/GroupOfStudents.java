import java.util.Scanner;

import java.util.Arrays;

public class GroupOfStudents implements Voenkom {
    Student[] groupArr = new Student[10];
    private String groupName;


    public GroupOfStudents() {
        super();
        this.groupName = "SET NAME!";
    }

    public GroupOfStudents(String groupName) {
        super();
        this.groupName = groupName;
    }

    public GroupOfStudents(Student[] groupArr, String groupName) {
        this.groupArr = groupArr;
        this.groupName = groupName;
    }

    public Student[] getGroupArr() {
        return groupArr;
    }

    public void setGroupArr(Student[] groupArr) {
        this.groupArr = groupArr;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void aggStudentToGroup(Student student) throws MyPersonExeptions {
        if (student == null) {
            throw new MyPersonExeptions();
        }
        for (int i = 0; groupArr.length > i; i++) {
            if (groupArr[i] == null) {
                groupArr[i] = student;
                student.setNameOfTheGroup(this.groupName);
                return;
            }
        }
        throw new MyPersonExeptions();
    }

    public boolean deleteStudentOnGroup(String lastName) {
        for (int i = 0; i < 10; i++) {
            if (groupArr[i] != null) {
                String time = groupArr[i].getLastName();
                if (groupArr[i] != null && time.equalsIgnoreCase(lastName)) {
                    groupArr[i] = null;
                    System.out.println("Student was delete");
                    return true;
                }
            }
        }
        return false;
    }

    public String searchStudentOnGroup(String lastName) {
        for (Student student : groupArr) {
            if (student != null && student.getLastName().equals(lastName)) {
                return student.toString();
            }
        }
        return "\"" + lastName + "\"" + " This student wasn't found...";
    }

    public void sortStudentOnGroup() {
        for (int i = 0; groupArr.length - 1 > i; i++) {
            for (int j = i + 1; groupArr.length > j; j++) {
                if (compare(groupArr[i], groupArr[j]) > 0) {
                    Student time = groupArr[i];
                    groupArr[i] = groupArr[j];
                    groupArr[j] = time;
                }
            }
        }
    }

    private int compare(Student a, Student b) {
        if (a != null && b == null) {
            return 1;
        }
        if (a == null && b != null) {
            return -1;
        }
        if (a == null && b == null) {
            return 0;
        }
        return a.getLastName().compareTo(b.getLastName());
    }

    public int count() {
        int number = 0;
        for (int i = 0; groupArr.length > i; i++) {
            if (groupArr[i] == null) {
                number +=1;
                return number;
            }
        }
        return number;
    }

    public void interactivAdding() {
        Scanner sc = new Scanner(System.in);
        String st;
        int intagers;
        boolean bool;

        for (int i = 0; groupArr.length > i; i++) {
            Student time = new Student();
            if (groupArr[i] == null) {
                System.out.println("Enter First name");
                st = sc.next();
                time.setName(st);
                System.out.println("Enter Last name");
                st = sc.next();
                time.setLastName(st);
                System.out.println("Enter sex \"true\" - boy, \"false\" - girl");
                st = sc.next();
                if (st.equals("true")) {
                    bool = true;
                } else bool = false;
                time.setSex(bool);
                System.out.println("Enter age");
                intagers = sc.nextInt();
                time.setAge(intagers);
                System.out.println("Enter score book");
                intagers = sc.nextInt();
                time.setScoreBook(intagers);
                time.setNameOfTheGroup(this.groupName);
                try {
                    aggStudentToGroup(time);
                } catch (MyPersonExeptions f) {
                    f.getMessage();
                }
                return;
            }
        }
    }

    public void sortByParametr(int i) {
        Arrays.sort(this.groupArr, new StudentComparator( i));
    }

    public void sortByParametr(int i, boolean forward) {
        Arrays.sort(this.groupArr, new StudentComparator(i, forward));
    }
    public Student[] getRecruiters() {
        int n = 0;
        for (Student student : groupArr) {
            if (student != null && student.isSex() && student.getAge() >= 18) {
                n += 1;
            }
        }
        Student[] recruterArray = new Student[n];
        int i = 0;
        for (Student student : this.groupArr) {
            if (student != null && student.isSex() && student.getAge() >= 18) {
                recruterArray[i++] = student;
            }
        }
        return recruterArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        //sortStudentOnGroup();
        for (Student s : groupArr) {

            if (s != null) {
                sb.append((i++) + ")").append(s);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
