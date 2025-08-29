public class StudentController {
    public static void main(String[] args) {
        StudentModel student = new StudentModel("Ana", 20);
        StudentView view = new StudentView();
        view.showStudent(student.getName(), student.getAge());

        StudentReport report = new StudentReport();
        report.printReport(student);
    }
}
