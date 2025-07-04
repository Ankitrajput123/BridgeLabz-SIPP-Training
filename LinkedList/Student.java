import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int age;
    char grade;
    Student next;

    public Student(int rollNo, String name, int age, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentLinkedList {
    private Student head;

    // Add at beginning
    public void addAtBeginning(int rollNo, String name, int age, char grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // Add at end
    public void addAtEnd(int rollNo, String name, int age, char grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newStudent;
    }

    // Add at specific position
    public void addAtPosition(int position, int rollNo, String name, int age, char grade) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }
        Student newStudent = new Student(rollNo, name, age, grade);
        Student temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    // Delete by roll number
    public void deleteByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Record deleted.");
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo)
            temp = temp.next;

        if (temp.next == null) {
            System.out.println("Roll Number not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Record deleted.");
        }
    }

    // Search by roll number
    public void searchByRollNo(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Found: " + temp.rollNo + ", " + temp.name + ", " + temp.age + ", " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Roll Number not found.");
    }

    // Update grade by roll number
    public void updateGrade(int rollNo, char newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Roll Number not found.");
    }

    // Display all records
    public void displayAll() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.rollNo + " | " + temp.name + " | " + temp.age + " | " + temp.grade);
            temp = temp.next;
        }
    }

    // Main method for user interaction
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Roll No");
            System.out.println("5. Search by Roll No");
            System.out.println("6. Update Grade");
            System.out.println("7. Display All Records");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            int roll, age, pos;
            char grade;
            String name;

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No, Name, Age, Grade: ");
                    roll = sc.nextInt(); name = sc.next(); age = sc.nextInt(); grade = sc.next().charAt(0);
                    list.addAtBeginning(roll, name, age, grade);
                    break;
                case 2:
                    System.out.print("Enter Roll No, Name, Age, Grade: ");
                    roll = sc.nextInt(); name = sc.next(); age = sc.nextInt(); grade = sc.next().charAt(0);
                    list.addAtEnd(roll, name, age, grade);
                    break;
                case 3:
                    System.out.print("Enter Position: ");
                    pos = sc.nextInt();
                    System.out.print("Enter Roll No, Name, Age, Grade: ");
                    roll = sc.nextInt(); name = sc.next(); age = sc.nextInt(); grade = sc.next().charAt(0);
                    list.addAtPosition(pos, roll, name, age, grade);
                    break;
                case 4:
                    System.out.print("Enter Roll No to delete: ");
                    roll = sc.nextInt();
                    list.deleteByRollNo(roll);
                    break;
                case 5:
                    System.out.print("Enter Roll No to search: ");
                    roll = sc.nextInt();
                    list.searchByRollNo(roll);
                    break;
                case 6:
                    System.out.print("Enter Roll No to update grade: ");
                    roll = sc.nextInt();
                    System.out.print("Enter new Grade: ");
                    grade = sc.next().charAt(0);
                    list.updateGrade(roll, grade);
                    break;
                case 7:
                    list.displayAll();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 8);
        sc.close();
    }
}
