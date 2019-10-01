

public class Estudiante {

    
    public static void main(String[] args) {
        
    Scanner enter= new Scanner(System.in);
    
    File estudiante = new File ("Datas.csv");
    
    String name, last_name;
    int day_birth, month_birth, year_birth, CI;
        
    if(!estudiante.exists()){
        try {
            estudiante.createNewFile();
            System.out.println("Type a name: ");
            name = enter.next();
            System.out.println("Type a last name: ");
            last_name = enter.next();
            System.out.println("Enter the day of your birth");
            day_birth = enter.nextInt();            
            System.out.println("Enter the month of your birth: ");
            month_birth = enter.nextInt();
            System.out.print("Enter the year of your bith");
            year_birth = enter.nextInt();            
            System.out.print("Enter a card number: ");
            CI = enter.nextInt();
                            
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
            mostrar = new PrintWriter(escribir);
                mostrar.println("Name: " + name );
                mostrar.println("Last name: " + last_name );
                mostrar.println("date of birth: " + day_birth + " / " + month_birth + " / " + year_birth );
                mostrar.println("CI: " + CI);
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
               
    }
    else{
        try {
                //arch.createNewFile();
            System.out.print("Type a name: ");
            name = enter.next();
            System.out.print("Type a last name: ");
            last_name = enter.next();
            System.out.print("Enter the day of your birth");
            day_birth = enter.nextInt();            
            System.out.print("Enter the month of your birth: ");
            month_birth = enter.nextInt();
            System.out.print("Enter the year of your bith");
            year_birth = enter.nextInt();            
            System.out.print("Enter a card number: ");
            CI = enter.nextInt();
           
                
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
                mostrar = new PrintWriter(escribir);
                mostrar.println("Nombre: "+ name);
                mostrar.println("Last name: "+ last_name);
                 mostrar.println("date of birth: " + day_birth + " / " + month_birth + " / " + year_birth );
                mostrar.println("CI: "+ CI);
               
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
    }
    }
    
}