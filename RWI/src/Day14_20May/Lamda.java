package Day14_20May;

//Without Lambda Expression
interface Drawable{
    public void draw();
}
 class Lambda {
    public static void main(String[] args) {
        int width = 10;

        //without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
    }
}