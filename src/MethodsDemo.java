public class MethodsDemo {

    public static void main(String[] args) {

        MethodsDemo demo = new MethodsDemo();

        String name = demo.getdata();
        System.out.println(name);
        

        System.out.println("----------");
        
        MethodsDemo2 demo2 = new MethodsDemo2();
        String name2 = demo2.getdata2();
        System.out.println(name2);
        
        System.out.println("----------");
        
        getdata3();
        
    }

    
    
    public String getdata() {
        System.out.println("Hello world11111111111!");
        return "happy me11111111.........";
    }
    
    public static String getdata3() {
        System.out.println("Hello world3333333!");
        return "happy me33333333.........";
    }
    
}