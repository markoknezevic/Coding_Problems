class code {
    public static void main(String[]args){
        int a[]={1,3,5,7,10,15};
        int b[]={2,4,5,7,9};
        int c[]=new int[a.length+b.length];
        int z=0;
        int k=0;
        int brDuplikata=0;
        for(int i=0;i<a.length;i++)
         for(int j=k;j<b.length;j++){
                if(a[i]<b[j]){
                    c[z]=a[i];
                    z++;
                    break;
                }else{
                    c[z]=b[j];
                    k++;
                    z++;
                   
                }
                if(a[i]==b[j]){
                    brDuplikata++;
                    break;
                    
                }
            }
            
            

   if(a[a.length-1]<b[b.length-1])
            for(int i=b.length-(c.length-z-brDuplikata);i<b.length;i++)
            {
                c[z]=b[i];
                z++;
            }
         else
            for(int i=a.length-(c.length-z-brDuplikata);i<a.length;i++)
            {
                c[z]=a[i];
                z++;
            }
        


    for(int i=0;i<c.length-brDuplikata;i++)
        System.out.println(c[i]);
    }
}