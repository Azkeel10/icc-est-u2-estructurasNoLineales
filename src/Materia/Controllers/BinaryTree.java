package Materia.Controllers;

import Materia.Models.Node;

public class BinaryTree {
//-----------------------------------------------------------------------------
    private Node root;
//-----------------------------------------------------------------------------
    public BinaryTree() {
        this.root = null;
    }
//-----------------------------------------------------------------------------
    public void insert(int value){
        root = insertRec(root, value);
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
            System.out.print(node.getValor() + " , " );
            printInOrdenRec(node.getNodoDerecha());
        }
    }
//-----------------------------------------------------------------------------
}
