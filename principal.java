public class principal{
    public static void main(String[] args) {
        functions.slowWrite("Bem vindo ao AluraBank Chat-bot\n"); 
        functions.write("Sou o seu atendente virtual altamente qualificado para atende-lo," 
        + " para comerçarmos, qual o seu nome?");
        String name = functions.input();

        //verifica se no nome tem apenas letras e espaços, sem simbolos
        while(!functions.isValidName(name)){
            functions.write("Por favor, digite um nome válido:");
            name = functions.input();
        };

        functions.write("\nOlá " + name + " é um prazer poder te atender hoje, por favor digite o seu " +
        "CPF para darmos continuidade no atendimento");
        // is vallid cpf, hide cpf, and return cpf
        String CPF = functions.input();

       //oi prof, essa parte verifica se o cpf digitado é válido (tem 11 caracteres e sem serem numeros seguidos iguais);

        while(true){
            String result = functions.isValidCPF(CPF);
            
            if(result == "CPF válido"){                                                             //pedindo a senha do meliante
                functions.write("\nObrigado, agora estamos a um passo de te judar, digite a sua senha para validar o login:");
                break;
            }
            else{
                functions.write(result);
                CPF = functions.input();
            }
        };
        
        String cpfHidden = functions.hideCPF(CPF);
        //input da senha do cliente
        String stolenPassword = functions.input();

        functions.slowWrite("\n\nHAHAHA Voce caiu em um phishing, acabei de conseguir seus dadosss:\nNome: "+ name + "\nCPF: "
        + cpfHidden + "\nSenha: " + stolenPassword+ "\n");
        
        }
    }