public class Travel{
    public Node start;
    
    Travel(){
        this.start=null;
    }
    
    public Node createMap(){
        Node n1 = new Node("H",null,null);
        Node n2 = new Node("F",null,null);
        Node n3 = new Node("S",null,null);
        Node n4 = new Node("U",null,null);
        Node n5 = new Node("E",null,null);
        Node n6 = new Node("Z",null,null);
        Node n7 = new Node("K",null,null);
        Node n8 = new Node("N",null,null);
        Node n9 = new Node("A",null,null);
        Node n10 = new Node("Y",null,null);
        Node n11 = new Node("T",null,null);
        n1.setLeft(n2); n1.setRight(n3);
        n2.setLeft(n4); n2.setRight(n5);
        n3.setLeft(n6); n3.setRight(n7);
        n4.setLeft(n8); n5.setLeft(n9);
        n7.setRight(n10);
        n9.setRight(n11);
        
        return n1;
    }
    
    public void A_course(Node visit){
        if(visit!=null){
            System.out.print(visit.getName()+" ");
            A_course(visit.getLeft());
            A_course(visit.getRight());
        }
    }
    
    public void B_course(Node visit){
        if(visit!=null){
            B_course(visit.getLeft());
            System.out.print(visit.getName()+" ");
            B_course(visit.getRight());
        }
    }
    
    public void C_course(Node visit){
        if(visit!=null){
            C_course(visit.getLeft());
            C_course(visit.getRight());
            System.out.print(visit.getName()+" ");
        }
    }
    
    public static void main(String[] args){
        Travel t = new Travel();
        t.start = t.createMap();
        t.A_course(t.start);
        System.out.println();
        t.B_course(t.start);
        System.out.println();
        t.C_course(t.start);
        System.out.println();
        
    }
    
    public class Node{
        String name;
        private Node left;
        private Node right;
        
        Node(String name,Node left,Node right){
            this.name=name;
            this.left=left;
            this.right=right;
        }
        
        public void setLeft(Node left){
            this.left = left;
        }
        
        public void setRight(Node right){
            this.right = right;
        }
        
        public Node getLeft(){
            return this.left;
        }
        
        public Node getRight(){
            return this.right;
        }
        
        public String getName(){
            return this.name;
        }
    }
}