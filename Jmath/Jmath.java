public class Jmath{
    int number;
    Jmath(){
        
    }
    
    public static int squard(int x,int m){
        if(m==0){
            return 1;
        }
        
        return x*squard(x,m-1);
    }
    
    public static void main(String[] args){
        System.out.println(Jmath.squard(4,4));
    }
}