package lista2estrutura;

public class Lista2Estrutura {

    public static void main(String[] args) {
        // TODO code application logic here

        ListaDupla listaDupla = new ListaDupla();

        Item item1 = new Item(0);
        Item item2 = new Item(1);
        Item item3 = new Item(2);
        Item item4 = new Item(3);
        Item item5 = new Item(4);
        Item item6 = new Item(5);
        Item item7 = new Item(6);
        
        
        listaDupla.inserirPrimeiro(item1);
        listaDupla.inserirPrimeiro(item2);
        listaDupla.inserirPrimeiro(item3);
        listaDupla.inserirPrimeiro(item4);
        listaDupla.inserirPrimeiro(item5);
        listaDupla.inserirPrimeiro(item6);
        listaDupla.inserirPrimeiro(item7);
        
        System.out.println(listaDupla.toString());
        
        listaDupla.calculaMaiorMenorEMedia();
    }
}
