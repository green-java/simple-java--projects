public class loopscope {
    static int i=9;
    public static void main(String[] args) {
        System.out.println("within the loop");
        for(int i=0;i<=5;i++){
            
            System.out.println(i);//i can print only within scope
        }
        System.out.println("out of the loop \t "+i); //out of the for print i=9;
    }
}
