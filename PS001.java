
public class PS001 {
        // Instance variables
        private int id;
        private String firstName;
        private String lastName;
        private String address;
    
        // Default constructor
        public PS001() {
            this.id = 0;
            this.firstName = "";
            this.lastName = "";
            this.address = "";
        }
    
        // Parameterized constructor
        public PS001(int id, String firstName, String lastName, String address) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
        }
    
        // Method to get the full name
        public String getFullName() {
            return firstName + " " + lastName;
        }
    
        // Getters and Setters (optional, for accessing private variables)
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getFirstName() {
            return firstName;
        }
    
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    
        public String getLastName() {
            return lastName;
        }
    
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    
        public String getAddress() {
            return address;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        // Main method for testing
        public static void main(String[] args) {
            // Creating an employee using the default constructor
            PS001 emp1 = new PS001();
            emp1.setFirstName("Akshaya");
            emp1.setLastName("madhu sudhan");
            emp1.setAddress("123 Main St");
            System.out.println("Employee 1 Full Name: " + emp1.getFullName());
    
            // Creating an employee using the parameterized constructor
            PS001 emp2 = new PS001(2, "varsha", "ramesh", "456 Elm St");
            System.out.println("Employee 2 Full Name: " + emp2.getFullName());
        }
    }