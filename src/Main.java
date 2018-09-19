import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Info of the following web pages:");
        System.out.println("http://erdani.com/tdpl/hamlet.txt: ");
        System.out.println("https://www.bls.gov/tus/charts/chart9.txt:");
        System.out.println("http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt");
        System.out.println("Word count");
        String[] strarray1 = WebScrapper.urlToString("http://erdani.com/tdpl/hamlet.txt").split(" ");
        System.out.println(strarray1.length);
        String[] strarray2 = WebScrapper.urlToString("https://www.bls.gov/tus/charts/chart9.txt").split(" ");
        System.out.println(strarray2.length);
        String[] strarray3 = WebScrapper.urlToString("http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt").split(" ");
        System.out.println(strarray3.length);
        String[] hamlet = WebScrapper.urlToString("http://erdani.com/tdpl/hamlet.txt").split(" ");
        System.out.println("The number of times \"Prince\" showed up in Hamlet is " + WebScrapper.numofword(hamlet, "Prince"));
        System.out.println("Unique Word count");
        System.out.println(WebScrapper.numofuniquewords(strarray1));
        System.out.println(WebScrapper.numofuniquewords(strarray2));
        System.out.println(WebScrapper.numofuniquewords(strarray3));
    }
}
