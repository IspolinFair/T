package test.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Success on 04.03.2017.
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        boolean b =true;
        ArrayList<Character> arrayList = new ArrayList<>();
        for (char c : s.toCharArray())
        {
            arrayList.add(c);

        }
        for (int i = 0; i < arrayList.size(); i++)
        {
            if(arrayList.get(i).equals(arrayList.get(arrayList.size()-1-i))){


            }else {
                b=false;
            }
        }

        System.out.println("Чи є строка паліндромом? "+b);
    }
}
