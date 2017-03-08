package test.task2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Success on 04.03.2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        /* Наскільки я зрозумів компліментарною парою конкретного числа є пара чисел, яка
        його утворює.. тобто комплементарними парами числа 5 можуть будуть кординати або 2,3 та 3,2 чи 1,4 та 4,1.
         */


        String s = "Ведіть число для знаходження його комплементарної пари";
        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        ArrayList<Integer> iList = new ArrayList<Integer>();
        ArrayList<Integer> jList = new ArrayList<Integer>();
        for (int i = 0; i < k+1; i++)
        {
            iList.add(k - i);
            jList.add(k - (k - i));

        }
        System.out.println("Компліментарними парами числа "+k+" є:");
        for (int i = 0; i < iList.size(); i++)
        {
            System.out.println("кординати i:"+iList.get(i) +", j:"+jList.get(i));
        }


    }
}
