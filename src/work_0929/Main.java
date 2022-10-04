package work_0929;

interface A   // Interface 1
{
    public abstract void text1();    // Abstract method
}


interface B   // Interface 2
{
    public abstract void text2();   // Abstract method
}


class C implements A,B   // Interface is implemented
{

    // Abstract methods are overridden
    public void text1()
    {
        System.out.println("Hello");
    }

    public void text2()
    {
        System.out.println("What's your name?");
    }
}


class Main
{
    public static void main(String[] args)
    {
        C obj = new C(); // Create a C object
        obj.text1();
        obj.text2();
    }
}
