import java.lang.constant.ConstantDesc;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class functions {

    public static String input() {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine(); 
        return entrada;
    }
    
    //conc == concatenate
    public static String conc(String texto1, String texto2){
        return " "+texto1+ " " +texto2 + " ";
    }


    public static String write(String text){
        System.out.println(text);
        return text;
    }

    public static boolean isValidName(String name) {
        return name != null && Pattern.matches("[a-zA-Z\\s]+", name);
    }


    public static void slowWrite(String output) {
        for(int i = 0; i < output.length(); ++i) {
            char c = output.charAt(i);
            System.out.print(c);

            try {
                TimeUnit.MILLISECONDS.sleep(30L);
            } catch (Exception var4) {
            }
        }

     }

     public static String isValidCPF(String cpf){
        boolean isValid = cpf.matches("[0-9]{11}");
        if (isValid) {
            return cpf;
        } else {
            return "CPF inválido";
        }

     }

     public static String hideCPF(String cpf){
        String cpfHidden = cpf.replaceAll("\\d(?=\\d{4})", "*");
      return cpfHidden;
     }
    

}

