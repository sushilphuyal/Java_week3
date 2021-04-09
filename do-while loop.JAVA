public class upto_10th_even_numbers
{
    public static void main(String[] args){
    // 2,4,6,8.... 10th term
    // position -> value 
int p = 1;
    int b = 2;
    do{
        System.out.println(b);
        p++;
        b = b + 2;
    }while(p <=10);
}
}
