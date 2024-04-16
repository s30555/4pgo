public class Student {
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String address;
    public double[] grades;
    public int gradesFilled;
    public StudentGroup studentGroup;

    public Student(String fname, String lname, String indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = new double[15];
        this.gradesFilled = 0;
    }
    public void addGrade(double newGrade) {
        if(gradesFilled >= 15) {
            System.out.println("Cannot add more than 15 grades");
            return;
        }

        grades[gradesFilled++] = newGrade;
    }

    public double calculateAverageGrade() throws IllegalArgumentException{
            if(gradesFilled == 0)
                throw new IllegalArgumentException("Student have no grades.");

            double total = 0;

            for(double grade : grades)
                total += grade;

            double average = total / gradesFilled;

            if(average < 2)
                return 2;
            if(average >= 2.5 && average < 3)
                return 2.5;
            if(average >= 3 && average < 3.5)
                return 3;
            if(average >= 3.5 && average < 4)
                return 3.5;
            if(average >= 4 && average < 4.5)
                return 4;
            if(average >= 4.5 && average < 5)
                return 4.5;
            return 5;
        }

    }