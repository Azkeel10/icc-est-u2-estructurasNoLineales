import Materia.Controllers.BinaryTree;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------Programa funcionando----------");

        BinaryTree ab = new BinaryTree();
        ab.insert(50);
        ab.insert(17);
        ab.insert(76);
        ab.insert(9);
        ab.insert(23);
        ab.insert(54);
        ab.insert(14);
        ab.insert(19);

        System.out.println("\n----------Arbol----------");
        System.out.println("El peso es: " + ab.getPesoTree());
        System.out.println("El tamaño del arbol es: " + ab.getHeightTree());

        // System.out.println("\n----------PreOrden----------");
        // ab.printPreOrden();

        // System.out.println();

        // System.out.println("\n----------PosOrden----------");
        // ab.printPosOrden();

        // System.out.println();

        System.out.println("\n----------InOrden----------");
        ab.printInOrden();

        /* 
         * System.out.println("\n----------Busqueda----------");

         * if(ab.findeValue(23)){
         *     System.out.println("\nEncontro el valor 23");
         * }else{
         *     System.out.println("\nNo encontro el valor 23");
         * }

         * if(ab.findeValue(77)){
         *     System.out.println("\nEncontro el valor 77");
         * }else{
         *     System.out.println("\nNo encontro el valor 77");
         * }
         */

        System.out.println("\n\n----------InOrdenArbol + tamaño----------");
        ab.printInOrdenTree();

        System.out.println("\n\n----------InOrdenArbol + factor de equilibrio----------");
        ab.printInOrdenTreeFactorEquilibrio();

        System.out.println("\n\nArbol esta equilibrado: " + ab.equilibrado() );

        System.out.println("\nExiste el nodo 15= " + ab.findeValue(15));
        System.out.println("Agregamos valor = 15");
        ab.insert(15);

        System.out.println("\nArbol esta equilibrado: " + ab.equilibrado());

        System.out.println("\n\n----------InOrdenArbol + factor de equilibrio----------");
        ab.printInOrdenTreeFactorEquilibrio();

        System.out.print("\n\nNodos desequilibrados son: ");
        ab.printNodosDes();
    }
}
