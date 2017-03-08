package test.task5;

/**
 * Created by Success on 06.03.2017.
 */
public class Fibonacci extends Thread
{
    int n;

    @Override
    public void run()
    {
        valueFib(n);

    }
    static int valueFib(int n){
        if(n<2)
        {
            return n;
        }
        else
        {
            return (valueFib(n - 1) + valueFib(n - 2));
        }
// PS "можливо я не так зрозумів завднання"
    }

}
