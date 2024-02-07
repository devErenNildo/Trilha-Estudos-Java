package entities;

public class No<T> {
	
	
//	ATRIBUTOS DA CLASSE
    private T conteudo;
    private No proximoNo = null;
//////////////////////////////////////////

//  CONSTRUTORES DA CLASSE
    public No(T conteudo){
        this.conteudo = conteudo;
    }

    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }
//////////////////////////////////////////
    
//  METODOS GET E SET DA CLASSE

//  RETORNA O CONTEUDO DO NO
    public T getConteudo() {
        return conteudo;
    }

//  ATRIBUI UM VALLOR NA VARIÁVEL CONTEUDO
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

//  RETORNA O PROXIMO NÓ QUE APONTA PARA O ELEMENTO SEGUINTE DA LISTA
    public No getProximoNo() {
        return proximoNo;
    }

//	ATRIBUI UM VALOR AO PROXIMO NÓ DA LISTA
    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }
////////////////////////////////////////

//	METODO TOSTRING DA CLASSE
    @Override
    public String toString() {
        return "No{" + conteudo + '}';
    }

//  RETORNA TODA A LISTA
    public String toStringEncadeado() {
        String str = "No{" + conteudo + "}";

        if(proximoNo != null){
            str += "->" + proximoNo.toString();
        }else{
            str += "->null";
        }
        return str;
    }
}