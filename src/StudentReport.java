public class StudentReport {
    public void printReport(StudentModel student) {
        System.out.println("===== Reporte del Estudiante =====");
        System.out.println("Nombre: " + student.getName());
        System.out.println("Edad: " + student.getAge() + " años");
        System.out.println("=================================");
        }
}
