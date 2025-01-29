class Employee  {
	int id;
	String name;
	double salary;
	
	public Employee() {	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}
}
class collectionMap{
    Employee[] empArray;
    int size;
    public collectionMap() {
        empArray = new Employee[10];
        size = 0;
    }

    int addEmployee(Employee emp){
        if (emp == null) {
            return 1;
        }
        for(int i=0; i<size; i++){
            if(empArray[i].getId()==emp.id){
                return 2;
            }
        }
        if(size<empArray.length){
            empArray[size] = emp;
            size++;
            return 0;
        }
        return 1;
    }

    int removeEmployee(int id){
        for(int i=0; i<empArray.length; i++){
            if(empArray[i].getId() == id){
                empArray[i] = null;
                for(int j=i; j<size; j++){
                    empArray[j] = empArray[j+1];
                    return 0;
                } 
            }
            return 2;
        }
        return 1;
    }
    void getEmployees(){
        if(empArray!=null){
            for(int i=0; i<size; i++){
                System.out.println(empArray[i].toString());
            }
        }
        System.out.println("null");
    }

}

public class PS005 {
    public static void main(String[] args) {
        
    }
    
}