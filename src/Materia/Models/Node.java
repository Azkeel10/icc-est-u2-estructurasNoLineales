package Materia.Models;

public class Node {
//-----------------------------------------------------------------------------
    private int valor;
    private Node nodoIzquierda;
    private Node nodoDerecha;
//-----------------------------------------------------------------------------
    public Node(int value) {
        this.valor = value;
        this.nodoIzquierda = null;
        this.nodoDerecha = null;
    }
//-----------------------------------------------------------------------------
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getNodoIzquierda() {
        return nodoIzquierda;
    }

    public void setNodoIzquierda(Node nodoIzquierda) {
        this.nodoIzquierda = nodoIzquierda;
    }

    public Node getNodoDerecha() {
        return nodoDerecha;
    }

    public void setNodoDerecha(Node nodoDerecha) {
        this.nodoDerecha = nodoDerecha;
    }
//-----------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Node [valor=" + valor + ", nodoIzquierda=" + nodoIzquierda + 
                ", nodoDerecha=" + nodoDerecha + "]";
    }
    
}
