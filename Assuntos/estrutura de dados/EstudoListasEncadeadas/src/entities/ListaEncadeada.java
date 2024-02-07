package entities;

public class ListaEncadeada<T> {

//	PRIMEIRO NO DE ENTRADA
    private No<T> referenciaEntrada;

//  CONSTRUTOR DA CLASSE, QUE INSTACIA O VALOR DA REFERENCIA COMO NULO, POIS NÃO TEM NENHUM ELEMENTO AINDA
    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

//  PRIMEIRO VERIFICA SE A LISTA ESTA VAZIA, COM O MÉTODO "isEmpty"
//  SE TIVER VAZIA, É ADICIONADO O NOVO NÓ NA VARIÁVEL "referenciaEntrada", QUE SE TRATA DO PRIMEIRO ELEMENTO DA LISTA
    public void add(T conteudo){
        No<T> novoNo = new No(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
//      SE A LISTA NÃO ESTIVER VAZIA, É CRIADO UM NOVO NÓ PARA AUXILIAR NA OPERAÇÃO
//		ESSA VARIÁVEL RECEBE O VALOR DA REFERENCIA DE ENTRADA, QUE SE TRATA DA LISTA CRIADA       
        No<T> noAuxiliar = referenciaEntrada;
//      O FOR PERCORRE O TAMANHO DA LISTA, ATRAVÉS DO MÉTODO "size" 
//      A VARIÁVEL AUXILIAR VAI INCREMENTANDO SEMPRE O PROXIMO NÓ ATÉ CHEGAR NO ULTINMO
        for(int i = 0; i < size() - 1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
//      AO CHEGAR NO ULTIMO É ATRIBUIDO UMA NOVA VARIÁVEL
        noAuxiliar.setProximoNo(novoNo);
    }

    
//  RETORNA O CONTEUDO DO ITEM NA POSIÇÃO INDICADA
    public T get(int index){
        return getNo(index).getConteudo();
    }

//  METODO APENAS DA CLASSE PARA AUXILIAR NO RETORNO DE VARIÁVEIS NO IDICE INDICADO
    private No<T> getNo(int index){
//    	VALIDA SE O INDEX DA LISTA É DO TAMANHO DA LISTA
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
//      FAZ UMA INCREMENTAÇÃO ATÉ CHEGAR NO INDICE INDICADO
        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
//      RETORNA O NO DO INDICE
        return noRetorno;
    }

//  REMOVE UM NÓ DO INDICE INDICADO
    public T remove(int index){
        validaIndice(index);
        No<T> noPivor = getNo(index);
        if(index == 0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

//  RETORNA O TAMANHO DA LISTA 
    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

//  VALIDA SE O INDICE É DO TAMANHO DA LISTA
    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + '.');
        }
    }

//  VERIFICA SE A LISTA ESTÁ VAZIA
    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

//  METODOS GET E SET
    public No<T> getReferenciaEntrada() {
        return referenciaEntrada;
    }

    public void setReferenciaEntrada(No<T> referenciaEntrada) {
        this.referenciaEntrada = referenciaEntrada;
    }

//  METODO TOSTRING
    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
