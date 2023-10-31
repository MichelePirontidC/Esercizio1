/*import java.util.Scanner;
    public static void loginPin(Conto u1){
        private static final int PIN_TARGET= 1234;

        static Scanner sc = new Scanner(System.in);
        boolean login=false;
        for (int i=TENTATIVI; i>0; i--){
            System.out.println("Inserisci PIN. Tentativi: "+i);
            int provaCodice= sc.nextInt();
            if (provaCodice==PIN_TARGET){
                login=true;
                break;
            }
        }
        if (!login){
            System.out.println("Accesso Negato");
            System.exit(1);
        }
        else if (login) {
            System.out.println("Accesso Effettuato ");
            visualizzaMenu(u1);
        }
    }*/
public class User{
    String nome, cognome;
    int id, password;
     
    public  User(String nome, String cognome,  int id, int password){
        this.nome=nome;
        this.cognome=cognome;
        this.id=id;
        this.password=password;
    }

    public void CreaProdotto{

    }
    public void ModificaProdotto{
        
    }
    public void VisualizzaProdotto{
        
    }
    public void EliminaProdotto{
        
    }

}
