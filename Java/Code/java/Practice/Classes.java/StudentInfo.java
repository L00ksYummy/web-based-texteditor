

public class StudentInfo{
    String name;
    double grade;
    int ID;
    String major;
    char GPA;

    public void studentInfo(String name, double grade, int ID, String major){
        this.name = name;
        this.grade = grade;
        this.ID = ID;
        this.major = major;

        if (grade > 89.5){
            this.GPA = 'A';
        }
        else if (grade < 89.5 && grade > 79.5){
            this.GPA = 'B';
        }
        else if (grade < 79.5 && grade > 69.5){
            this.GPA = 'C';
        }
        else if (grade < 69.5 && grade > 59.5){
            this.GPA = 'D';
        }
        else this.GPA = 'F';
    }

    public void printInfo(){
        System.out.println(name + "(ID: " + ID + ") is majoring in " + major + "and he has a " + 
        grade + " which makes their GPA: " + GPA);
    }
}