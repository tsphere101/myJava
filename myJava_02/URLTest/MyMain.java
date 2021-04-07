import java.util.Scanner;
package URLTest;

import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Element;

import java.io.IOExeptions;

public class MyMain{
    public static void main(String[] args) {

        System.out.println();
        
        String url = "https://en.wikipedia.org/";

        Scanner sc = new Scanner(System.in);

        double temp;
        temp = Double.parseDouble(sc.nextLine());



        crawl(1, url, new ArrayList<String>());

        System.out.println("HELLO World");

    }

    private static void crawl(int level, String url, ArrayList<String> visited){
        if(level <= 5) {
            
        }
    }

    private static Document request(String url, ArrayList<String> v)
    {
        return new Document();
    }



}