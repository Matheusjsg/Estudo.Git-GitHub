

public class Main {
    public static void main(String[] args) {
        

        Pessoa Juliana = new Pessoa("Juliana", 18, "Feminino");

        Livro Narnia = new Livro("Narnia", "lispe",30, Juliana );




        
        Narnia.setleitor(Juliana);
        
        Narnia.abrir();
        
        Narnia.folhear();

        Narnia.fechar();
        Narnia.folhear();

        Narnia.status();
            
        

    }
}
