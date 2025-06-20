package Materia.Controllers;

import Materia.Models.Node;

public class BinaryTree {
//-----------------------------------------------------------------------------
    private Node root;
    private int peso;
//-----------------------------------------------------------------------------
    public BinaryTree() {
        this.root = null;
        this.peso = 0;
    }
//-----------------------------------------------------------------------------
    public void insert(int value){
        root = insertRec(root, value);
        peso ++;
    }
//-----------------------------------------------------------------------------
    private Node insertRec(Node padre,int value){
        
        if(padre == null){
            return new Node(value);
            /*
             *  padre = new Node(value);
             *  return padre;
            */
        }

        if(value <= padre.getValor() ){          // Izquierda
            Node newNode = insertRec(padre.getNodoIzquierda(), value);
            padre.setNodoIzquierda(newNode);

        }else if(value > padre.getValor()){     // Derecha
            padre.setNodoDerecha(insertRec(padre.getNodoDerecha(), value));

        }
        return padre;
    }
//-----------------------------------------------------------------------------
    public void printPreOrden(){
        printPreOrdenRec(root);
    }

    private void printPreOrdenRec(Node node){

        if(node != null){
            System.out.print(node.getValor() + " , " );
            printPreOrdenRec(node.getNodoIzquierda());
            printPreOrdenRec(node.getNodoDerecha());
        }
    }
//-----------------------------------------------------------------------------
    public void printPosOrden(){
        printPosOrdenRec(root);
    }

    private void printPosOrdenRec(Node node){

        if(node != null){
            
            printPosOrdenRec(node.getNodoIzquierda());
            printPosOrdenRec(node.getNodoDerecha());
            System.out.print(node.getValor() + " , " );
        }
    }
//-----------------------------------------------------------------------------
    public void printInOrden(){
        printInOrdenRec(root);
    }

    private void printInOrdenRec(Node node){
        if(node != null){

            printInOrdenRec(node.getNodoIzquierda());
            System.out.print(node.getValor()  + " , ");
            printInOrdenRec(node.getNodoDerecha());
        }
    }
//-----------------------------------------------------------------------------
    public boolean findeValue(int valor){
        return findeValueRec(root, valor);
    }

    private boolean findeValueRec(Node node, int valor){
        if (node == null) {
            return false;
        }

        if (node.getValor() == valor) {
            return true;
        }

        if (valor < node.getValor()) {
            return findeValueRec(node.getNodoIzquierda(), valor);
        } else {
            return findeValueRec(node.getNodoDerecha(), valor);
        }
    }
//-----------------------------------------------------------------------------
    public int getHeightTree(){
        return getHeightRec(root);
    }

    public int getHeightRec(Node node){
        if(node == null){
            return 0;
        }

        int leftHeight = getHeightRec(node.getNodoIzquierda());
        int rihgtHeight = getHeightRec(node.getNodoDerecha());

        return Math.max(leftHeight, rihgtHeight) + 1;
        /*
         * if(leftHeight > rihgtHeight){
         *    return leftHeight + 1;
         * } else{
         *     return rihgtHeight + 1;
         * }
         */

    }
//-----------------------------------------------------------------------------
    public void printInOrdenTree(){
        printInOrdenTreeRec(root);
    }

    private void printInOrdenTreeRec(Node node){
        if(node != null){

            printInOrdenTreeRec(node.getNodoIzquierda());
            System.out.print(node.getValor()  + "(h=" + getHeightRec(node) + ")" + " , ");
            printInOrdenTreeRec(node.getNodoDerecha());
        }
    }
//-----------------------------------------------------------------------------
    public int factorEquilibrio(){
        return factorEquilibrioRec(root);
    }

    private int factorEquilibrioRec(Node node){
        if(node == null){
            return 0;
        }

        int leftHeight = getHeightRec(node.getNodoIzquierda());
        int rihgtHeight = getHeightRec(node.getNodoDerecha());

        return leftHeight - rihgtHeight;
        // return getHeightRec(node.getNodoIzquierda()) - getHeightRec(node.getNodoDerecha());
    }
//-----------------------------------------------------------------------------
    public void printInOrdenTreeFactorEquilibrio(){
        printInOrdenTreeFactorEquilibrioRec(root);
    }

    private void printInOrdenTreeFactorEquilibrioRec(Node node){
        if(node != null){

            printInOrdenTreeFactorEquilibrioRec(node.getNodoIzquierda());
            System.out.print(node.getValor()  + "(h=" + factorEquilibrioRec(node) + ")" + " , ");
            printInOrdenTreeFactorEquilibrioRec(node.getNodoDerecha());
        }
    }
//-----------------------------------------------------------------------------
    public int getPesoTree() {
        return peso;
    }
//-----------------------------------------------------------------------------
    public boolean equilibrado(){
        return equilibradoRec(root);
    }
    private boolean equilibradoRec(Node node){
        if(node == null){
            return true;
        }

        int factorEquilibrio = factorEquilibrioRec(node);

        if (factorEquilibrio < -1 || factorEquilibrio > 1) {
            return false;
        }

        return equilibradoRec(node.getNodoIzquierda()) && equilibradoRec(node.getNodoDerecha());
    }
//-----------------------------------------------------------------------------
    public void printNodosDes(){
        printNodosDesRec(root);
    }

    private void printNodosDesRec(Node node){
        if(node != null){
        printNodosDesRec(node.getNodoIzquierda());

        int fe = factorEquilibrioRec(node);
        if(fe < -1 || fe > 1){
            System.out.print(node.getValor() + "(fe=" + fe + ") , ");
        }

        printNodosDesRec(node.getNodoDerecha());
        }
    //-----------------------------------------------------------------------------
    }
}
