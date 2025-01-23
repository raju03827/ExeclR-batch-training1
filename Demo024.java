import java.util.ArrayList;
public class Demo024 {
    public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Sindhu");
    names.add("Siri");
    names.add("Sony");
    names.add("Nidhi");
    names.add("Amrutha");
    ArrayList<Long>  phno = new ArrayList<>();
    phno.add(1234567890L);
    phno.add(9087654321L);
    phno.add(5432167897L);
    phno.add(65432178908L);
    phno.add(78905432145L);
    ArrayList<String> address = new ArrayList<>();
    address.add("hyderabad");
    address.add("Kolkata");
    address.add("Bangalore");
    address.add("Chennai");
    address.add("Mumbai");
    for (int i = 0; i < names.size(); i++) {
        System.out.println("Name: " + names.get(i) + ", Phno: " + phno.get(i) + ", Address: " + address.get(i));
    }
}
}