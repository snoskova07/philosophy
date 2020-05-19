import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Philosophy {

    public static void main( String[] args ) throws IOException{

        ArrayList<String> titles = new ArrayList();
        int count =0;

for (int i =0; i<100; i++) {
    //     Document doc = Jsoup.connect("https://ru.wikipedia.org/wiki/%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F:%D0%A1%D0%BB%D1%83%D1%87%D0%B0%D0%B9%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0").get();
    Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/Special:Random").get();
    String title = doc.title();
    titles.add(title);
    count = count + 1;
        if (title.contains("Phi")) {
        break;
    }
 //   System.out.println("Title : " + title);
}
        System.out.println(count);
       for (int i =0; i<count; i++) {
            System.out.println("Title : " + titles.get(i));

        }

    }

}