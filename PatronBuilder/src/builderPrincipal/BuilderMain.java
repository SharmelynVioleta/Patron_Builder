package builderPrincipal;

import builderObjetos.Employee;
public class BuilderMain {

    public static void main(String[] args) {
        System.out.println("\nPRIMER EJEMPLO:");   
        Employee emp = new Employee.EmployeeBuilder()
        		.setName("Oscar Javier Blancarte Iturralde")
                .setGender("Male")
                .setAge(30)
                .setAdress("Benito " + "Juarez", "Mexico D.F.", "Mexico", "03400")
                .addContacs("Rene Blancarte", "954879587", "+51", "Personal", 
                        "Av. Colon 105", "Arequipa", "Perú", "04001")
                .addContacs("Maria Perez", "951236547", null, "Celular")
                .addPhones("985469875", null, "Celular")
                .addPhones("458796", "054", "Casa")
                .build();
        System.out.println(emp);
        
      
        System.out.println("\nSEGUNDO EJEMPLO: ");   
        Employee emp1 = new Employee.EmployeeBuilder()
                .addPhones("954265458", null, "Personal")
        		.setName("Blanca Vidauzarraga Linares")
                .setGender("Female")
                .build();
        System.out.println(emp1);
        
        
        System.out.println("\nTERCER EJEMPLO: ");   
        Employee emp2 = new Employee.EmployeeBuilder()
                .addPhones("956874598", null, "Personal")
                .build();
        System.out.println(emp2);
    }
}