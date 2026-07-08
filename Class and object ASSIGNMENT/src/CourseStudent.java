//1. Online Course Enrollment System An ed-tech platform stores information about students enrolling in courses.
//Create a class CourseStudent with
//private variables:studentName courseName courseFee discountPercent Using setters assign values.
//Using getters calculate the final payable fee:
//finalFee = courseFee - (courseFee * discountPercent / 100) Print the student name, course, and final fee.






class CourseStudent {
    private String studentName;
    private String courseName;
    private double courseFee;
    private double discountPercent;

    public void setData(String s, String c, double f, double d) {
        studentName = s;
        courseName = c;
        courseFee = f;
        discountPercent = d;
    }

    public double getFinalFee() {
        return courseFee - (courseFee * discountPercent / 100);
    }

    public void display() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Final Fee    : " + getFinalFee());
    }
    
    public static void main(String[] args) {
        CourseStudent cs = new CourseStudent();

        cs.setData("Kalyani", "Core Java", 10000, 20);

        cs.display();
    }
}