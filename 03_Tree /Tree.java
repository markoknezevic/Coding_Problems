class Tree {
    Node node;
    String tree;
    int count;
    public Tree() {
        tree = "";
    }
    public void insert(int data) {
        node = insert2(node, data);
    }
    public Node insert2(Node node, int data) {
        if (node == null)
            node = new Node(data);
        else {
            if (data < node.data)
                node.left = insert2(node.left, data);
            if (data > node.data)
                node.right = insert2(node.right, data);


        }
        return node;
    }

    public void insertS(String[] splitStr) {
        for (count = 1; count < splitStr.length; count++)
            node = insertS2(node, splitStr);
    }
    public Node insertS2(Node node, String[] data) {
        //if(data.length<=i)
        //return null;

        if (node == null)
            node = new Node(Integer.parseInt(data[count]));
        else {

            if (data[count].equals("L")) {
                count++;
                node.left = insertS2(node.left, data);
            }
            if (data[count].equals("R")) {
                count++;
                node.right = insertS2(node.right, data);
            }


        }

        return node;
    }

    public void isp() {
        isp2(node);
    }

    public void isp2(Node node) {
        if (node != null) {
            System.out.println(node.data);
            isp2(node.left);
            isp2(node.right);
        }
    }

    public void inString() {
        tree = inString2(node, tree, "");
    }
    public String inString2(Node node, String a, String o) {
        if (node != null) {
            return a + " " + o + " " + node.data + inString2(node.left, a, o + " L") + inString2(node.right, a, o + " R");
        }
        return a;
    }

    public class Node {
        public Node left;
        public Node right;
        public int data;
        public Node() {}
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
        @Override
        public String toString() {
            return Integer.toString(data);
        }
    }




}