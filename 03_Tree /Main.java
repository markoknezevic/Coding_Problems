class Main{
    public static void main(String [] args){
        Tree a=new Tree();
        a.insert(4);
         a.insert(9);
          a.insert(7);
           a.insert(2);
            a.insert(3);
             a.insert(6);
             
        a.isp();
        a.inString();
         System.out.println("\n");
         System.out.println(a.tree+"\n");
        String[] splitStr = a.tree.split("\\s+");
       // System.out.println(splitStr[2]);
        System.out.println("\n");
       Tree beta=new Tree();
      
     
       beta.insertS(splitStr);
       beta.isp();
       beta.inString();
       System.out.println("\n");
         System.out.println(beta.tree+"\n");
    }    
}