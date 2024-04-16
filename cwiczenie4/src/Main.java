public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Anna", "Kowalska", "s3456", "ann.kowalska@example.com", "Gwiezdna 46");
        Student student2 = new Student("Maciek", "Rybak", "s6678", "m.rybak@example.com", "Wesoła 334");

        student1.addGrade(5.0);
        student1.addGrade(4.5);
        student1.addGrade(3.5);
        student1.addGrade(4.0);
        student2.addGrade(4.5);
        student2.addGrade(3.5);
        student2.addGrade(3.0);
        student2.addGrade(2.5);

        StudentGroup group1 = new StudentGroup("group 1");

        try {
            group1.addStudent(student1);
            group1.addStudent(student2);

        } catch (IllegalStateException e) {
            System.out.println("Error adding student to group: " + e.getMessage());
        }

        try {
            System.out.println("Average grade for student 1: " + student1.calculateAverageGrade());
            System.out.println("Average grade for student 2: " + student2.calculateAverageGrade());
        } catch (IllegalArgumentException e) {
            System.out.println("Error calculating average grade: " + e.getMessage());
        }

    }
}