public class Main {
    public static void main(String[] args) {

        AttendanceSystem attendance = new AttendanceSystem();
        GradingSystem grading = new GradingSystem();
        LibrarySystem library = new LibrarySystem();

        SchoolManagementApp attendanceAdapter =new AttendanceSystemAdapter(attendance);
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(grading);
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(library);

        attendanceAdapter.integrateSystem();
        gradingAdapter.integrateSystem();
        libraryAdapter.integrateSystem();
    }
}
