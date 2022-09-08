public class Student {
    String surname;
    String firstname;
    char middleinitial;
    String dateOFBirth;
    int studentNumber;
    String EmailAddress;
    boolean iAmAwesome;

    public void myFullName() {
        System.out.println("My full name is " + firstname + surname + ".");
    }
    public void myStudentNumber() {

        System.out.println("My student number is " + studentNumber + " .");
    }
    public void sayMyEmail() {

        System.out.println("Contact me through my email address: " + EmailAddress + " .");
    }
    public void amIAwesome() {
        System.out.println("Am i awesome though? the answer is:" + iAmAwesome + " !");
    }

}
