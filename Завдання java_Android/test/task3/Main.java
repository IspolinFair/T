package test.task3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Success on 04.03.2017.
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
        // Оскільки даний файл уявний процей підключення до нього може виглядати приблизно так

        ArrayList<Character> list = new ArrayList<Character>();

        try
        {
            FileInputStream fileInputStream = new FileInputStream("res/new.txt");//файл над якийм я тестував
            int i = -1;
            while ((i = fileInputStream.read()) != -1)
            {
                list.add((char) i);

            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
                               /* Алгоритм*/


        ArrayList<String> phraseLIst = new ArrayList<String>();
        String phrase = "";
        for (int i = 0; i < list.size(); i++)
        {
            phrase = phrase + list.get(i);
            if (list.get(i).equals('|')) // записуємо кожну фразу окремо одна від одної в String масив
            {
                phraseLIst.add(phrase);
                phrase = "";
            }

        }
        //
        ArrayList<String> summary = new ArrayList<String>(); // в цей list ми запишем унікальні фрази
        ArrayList<Integer> summaryNumber = new ArrayList<Integer>(); //  в цей list ми запишем кількість повторювальних фраз
        while (phraseLIst.size() > 1)
        {
            String countPhrase = phraseLIst.get(0);   // ми будем постійно зрівнювати із першою фразою,
            // а в кінці циклу скорочувати масив на один вид фразии
            int countNumber = 0;
            for (int i = 0; i < phraseLIst.size(); i++)
            {

                if (countPhrase.equals(phraseLIst.get(i)))
                {
                    countNumber++;
                    phraseLIst.remove(i);    // щоб не рахувати повторо ту саму фразу
                }

            }
            summary.add(countPhrase);
            summaryNumber.add(countNumber);
            phraseLIst.remove(0);
        }
        // відсортуємо в порядку спадання
       // ArrayList<String> sortPhrase = new ArrayList<String>(); // фраза
      //  ArrayList<Integer> sortNumber = new ArrayList<Integer>();// її кількість
        boolean bol = true;
        while (bol){
            bol = false;
            for(int i= 0; i<summary.size()-1; i++){
                if (summaryNumber.get(i)<summaryNumber.get(i+1)){
                    int x = summaryNumber.get(i);
                   summaryNumber.set(i,summaryNumber.get(i+1));
                   summaryNumber.set(i+1,x);
                   // теж саме зробим для фраз, щоб не втратити їх відношення в розміщенні до кількості
                    String xS = summary.get(i);
                    summary.set(i,summary.get(i+1));
                    summary.set(i+1,xS);
                    bol = true;
                }

            }
        }


        for (int i = 0; i < 100000; i++) // топ 100000 найбільш вживаних фраз
        {
            System.out.println("Phrase: "+summary.get(i)+"| number = "+summaryNumber.get(i));
        }

    }
}
