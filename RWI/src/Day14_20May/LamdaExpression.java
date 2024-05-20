package Day14_20May;
//No Parameter
interface Sayable{
    public String say();
}
 class LambdaExpression{
    public static void main(String[] args) {
        Sayable s=()->{
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}