public class Livro implements Publicacao {

private String titulo;
private String autor;
private int totPag;
private int pagAtul;
private boolean aberto;
private Pessoa leitor;


public Livro(String titulo, String autor, int totPag, Pessoa leitor ) {
    this.titulo = titulo;
    this.autor = autor;
    this.totPag = totPag;
    this.leitor = leitor;
}

public void status(){

    System.out.println("Leitor: " + this.leitor.nome);
    System.out.println("Título: " + this.getTitulo());
    System.out.println("Autor: " + this.getAutor());
    System.out.println("Pág atual: " + this.pagAtul);

    if (getpagAtul()==gettotPag()) { System.out.println("Pág Final");
        
    }

}

    

public String getTitulo(){
    return titulo;
}
public void setTitulo(String titulo){
    this.titulo = titulo;
}


public String getAutor(){
    return autor;
}
public void setAutor(String autor){
    this.autor = autor;
}


public int gettotPag(){
    return totPag;
}
public void settotPag(int totPag){
    this.totPag = totPag;
}


public int getpagAtul(){
    return pagAtul;
}
public void setpagAtul(int pagAtul){
    this.pagAtul = pagAtul;

}


public boolean getaberto(){
    return aberto;
}
public void setaberto(boolean aberto){
    this.aberto = aberto;
}


public Pessoa getleitor(){
    return leitor;
}
public void setleitor(Pessoa leitor){
    this.leitor = leitor;
}



@Override
public void abrir() {

    setaberto(aberto = true);
    setpagAtul(0);
}


@Override
public void fechar() {

    setaberto(aberto = false);
}


@Override
public void folhear() {

    if (this.getpagAtul()+5 <= this.totPag){

        setpagAtul( pagAtul+5);

    }else setpagAtul(gettotPag());
}


@Override
public void avançpag() {

    if (this.getpagAtul()+1 <= this.gettotPag()){

        pagAtul++;

    }else setpagAtul(gettotPag());
}





@Override
public void voltarpag() {

    if (this.getpagAtul() > 1){

        this.pagAtul--;

    }if (getpagAtul() == 1) System.out.println("Pág. inicial!");

}


}


