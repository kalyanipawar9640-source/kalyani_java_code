//6. School Result System A school stores marks of a student.
//Create a class StudentResult with private variables: studentName mathMarks scienceMarks englishMarks 
//Using getters calculate: totalMarks average Then print grade: >= 90 → A
//>= 75 → B 
//>= 50 → C 
//else → Fail.

class StudentResult {
    private String studentName;
    private int mathMarks;
    private int scienceMarks;
    private int englishMarks;

    // Setter
    public void setData(String name, int math, int science, int english) {
        studentName = name;
        mathMarks = math;
        scienceMarks = science;
        englishMarks = english;
    }

    // Getter for Total
    public int getTotalMarks() {
        return mathMarks + scienceMarks + englishMarks;
    }

    // Getter for Average
    public double getAverage() {
        return getTotalMarks() / 3.0;
    }

    public void display() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Total Marks : " + getTotalMarks());
        System.out.println("Average : " + getAverage());

        double avg = getAverage();

        if (avg >= 90)
            System.out.println("Grade : A");
        else if (avg >= 75)
            System.out.println("Grade : B");
        else if (avg >= 50)
            System.out.println("Grade : C");
        else
            System.out.println("Grade : Fail");
    }

    public static void main(String[] args) {
        StudentResult s = new StudentResult();

        s.setData("Kalyani", 85, 80, 75);

        s.display();
    }
}
