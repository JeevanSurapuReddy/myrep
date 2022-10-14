public class Main {

    public static void main(String[] args) {
        ScapegoatTree<Integer, Integer> sgTree = new ScapegoatTree<>();
        int[] nodes = new int[]{3,22,9,6,96,69,25,33,11,7,0,2};
        for (int key: nodes) {
            sgTree.insertWithoutRebalancing(key,key);
        }
        
        sgTree.deleteWithoutRebalancing(69);
        sgTree.delete(11);
        sgTree.inOrder();
        sgTree.preOrder();
        sgTree.postOrder();
        sgTree.successor(25);
        sgTree.predecessor(7);
		
        System.out.println(sgTree);
    }
}
