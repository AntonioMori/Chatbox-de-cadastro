public class principal{

    public static void main(String[] args) {
        functions.slowWrite("Bem vindo ao AluraBank Chat-bot\n"); 
        functions.write("Sou o seu atendente virtual altamente qualificado para atende-lo," 
        + " para comerçarmos, qual o seu nome?");
        String name = functions.input();

        while(!functions.isValidName(name)){
            functions.write("Por favor, digite um nome válido:\n");
            name = functions.input();
        };

        functions.slowWrite("Olá " + name + " é um prazer poder te atender hoje, por favor valide o seu " +
        "login digitando o seu CPF para darmos continuidade no atendimento\n");
        functions.input();
        // is vallid cpf, hide cpf, and return cpf

        
        }
    }