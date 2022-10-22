package exemploclasse;

/**
 * Fonte: https://is.gd/K6MkCj
 */
public class ExemploClasse {

    /* Essa é a classe principal do projeto porque possui
    * o método principal "public static void main".
    *
    * A classe secundária será criada dentro do pacote: 
    * Botão direito (pacote: exemploclasse) > New > Java Class (nomeada "Conta")
    */
    
    public static void main(String[] args) { 
     
        /* 
        * Processo para instanciar um objeto:
        * 1. Chamar a classe "Conta"
        * 2. Nomear o objeto, no exemplo: "minhaConta"
        * 3. Para criar uma nova conta usa "new Conta()"
        * 
        * Ao invés de usar o a palavra "Conta" da classe, usaremos 
        * agora sempre o objeto "minhaConta"
        */
        
        Conta minhaConta = new Conta();
        
        System.out.println("==== Primeira Conta ====");
        minhaConta.nome = "João Carvalho";
        minhaConta.saldo = 1000;
        
        System.out.println(minhaConta.nome);
        System.out.println(minhaConta.saldo);
        
        /*
        * Chamando o método:
        * 1. nome do objeto "minhaConta"
        * 2. nome do método "mostrarNome()" , "saacrDinheiro", etc.
        */
        minhaConta.mostrarNome();
        minhaConta.sacarDinheiro(400);
        minhaConta.depositarDinheiro(1000);
        minhaConta.limiteConta();
        
        System.out.println();
     
        
        Conta minhaConta2 = new Conta();
        System.out.println("==== Segunda Conta ==== ");
        minhaConta2.nome = "Farna Glishock";
        minhaConta2.saldo = 500;
        
        minhaConta2.mostrarNome();
        minhaConta2.sacarDinheiro(500);
        minhaConta2.depositarDinheiro(800);
        minhaConta2.limiteConta();   
        
    }
    
}
