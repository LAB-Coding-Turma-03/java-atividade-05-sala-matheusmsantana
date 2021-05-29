package br.com.impacta.models;

public class Produto {
    public int codigo;
    public String descricao;
    public double valor;
    
    public String montarResumo(Produto produto){
        //return "codigo:" + String.valueOf(codigo) + "descricao:" + descricao 
        //+ "valor:" + String.valueOf(valor);
        String resumo = "codigo: "+produto.codigo+", descricao: "+produto.descricao+", valor: "+produto.valor;
        return resumo;
    }
}
