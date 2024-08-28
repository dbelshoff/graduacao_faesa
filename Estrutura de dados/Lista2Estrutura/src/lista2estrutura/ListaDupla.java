/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2estrutura;

/**
 *
 * @author silas
 */
public class ListaDupla {

    private NoDupla prim;
    private NoDupla ult;
    private int quantNos;

    ListaDupla() {
        this.prim = null;
        this.ult = null;
        this.quantNos = 0;
    }

    public int getQuantNos() {
        return this.quantNos;
    }

    public NoDupla getPrim() {
        return this.prim;
    }

    public NoDupla getUlt() {
        return this.ult;
    }

    public boolean éVazia() {
        return (this.prim == null);
    }

    public void inserirPrimeiro(Item elem) {
        NoDupla novoNo = new NoDupla(elem);
        if (this.éVazia()) {
            this.ult = novoNo;
        } else {
            novoNo.setProx(this.prim);
            this.prim.setAnt(novoNo);
        }
        this.prim = novoNo;
        this.quantNos++;
    }

    public void inserirUltimo(Item elem) {
        NoDupla novoNo = new NoDupla(elem);
        if (this.éVazia()) {
            this.prim = novoNo;
        } else {
            novoNo.setAnt(this.ult);
            this.ult.setProx(novoNo);
        }
        this.ult = novoNo;
        this.quantNos++;
    }

    public NoDupla pesquisarNo(int chave) {
        NoDupla atual = this.prim;
        while ((atual != null) && (atual.getInfo().getChave() != chave)) {
            atual = atual.getProx();
        }
        return atual;
    }

    public boolean removerNo(int chave) {
        NoDupla atual = this.prim;
        while ((atual != null) && (atual.getInfo().getChave() != chave)) {
            atual = atual.getProx();
        }
        if (atual == null) {
            return false;
        } else if (atual == this.prim) {
            this.prim = prim.getProx();
            if (this.prim == this.ult) {
                this.ult = null;
            } else {
                this.prim.setAnt(null);
            }
        } else if (atual == this.ult) {
            this.ult = this.ult.getAnt();
            this.ult.setProx(null);
        } else {
            atual.getProx().setAnt(atual.getAnt());
            atual.getAnt().setProx(atual.getProx());
        }
        this.quantNos--;
        return true;
    }

    public void calculaMaiorMenorEMedia() {
        int maior = prim.getInfo().getChave();
        int menor = prim.getInfo().getChave();
        double media;
        double soma = prim.getInfo().getChave();
        NoDupla atual = prim;

        while (atual.getProx() != null) {
            atual = atual.getProx();
            soma += atual.getInfo().getChave();
            if (atual.getInfo().getChave() > maior) {
                maior = atual.getInfo().getChave();
            }
            if (atual.getInfo().getChave() < menor) {
                menor = atual.getInfo().getChave();
            }

        }

        media = soma / quantNos;

        System.out.println("O maior é " + maior);
        System.out.println("O menor é " + menor);
        System.out.println("A media é " + media);

    }

    public String toString() {
        String msg = "";
        NoDupla atual = this.prim;
        while (atual != null) {
            msg += atual.getInfo().getChave() + "\n";
            atual = atual.getProx();
        }
        return msg;
    }
}