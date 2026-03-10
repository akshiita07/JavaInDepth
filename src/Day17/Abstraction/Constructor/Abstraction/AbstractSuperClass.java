package Day17.Abstraction.Constructor.Abstraction;

public abstract class AbstractSuperClass {
    public int incr1;
    public int incr2;

    //protected constructor:
    protected AbstractSuperClass(int incr1,int incr2){
        System.out.println("In constructor of AbstractSuperClass");
        this.incr1=incr1;
        this.incr2=incr2;
    }

    public abstract int foo();
    public abstract int bar();

    public int compute(){
        int foo=foo();
        int bar=bar();
        if(foo>5){
            foo+=incr1;
        }
        if(bar>15){
            bar+=incr2;
        }
        int ans=foo+bar;
        System.out.println("foo+bar value is "+ans);
        return ans;
    }
}
