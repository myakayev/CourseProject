package course.myakaev.lesson4_classwork;

public class Student {
    private int studentId;
    private String name;
    private int group;
    private String faculty;
    private Address address;
    Address adress = new Address();
    // private, protected – may be
    public class Address { // inner class: begin
        private String city;
        private String street;
        private int houseId;
        private int flatId;
        private String email;
        private String skype;
        private long phoneNumber;
// more code
    }// inner class: end

}
