package 클로링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class crawiling {
	public static void main(String[] args) {
		String [] comNum = {"005930", "180640", "001060", "096530", "028300"};
		Connection[] conNum = new Connection [5];
		Document[] docNum = new Document [5];
		Elements[] listNum = new Elements [5];
		String[] nameList = new String [5];
		String[] lastList = new String [5];
		String[] startList = new String [10];
		String[] yesterList = new String [5];		
		String[] highList = new String [5];
		String[] lowList = new String [5];
		String[] quanList = new String [5];
		// 
		crawiling2 cr = new crawiling2();
		
		cr.forName(".wrap_company h2 a", nameList);
		cr.forLast(".no_today span", lastList);
		cr.forStart(".first em span", startList);
		cr.forYester(".first em span", startList);
//		cr.forhigh(s, highList);
//		cr.forlow(s, lowList);
//		cr.forquan(s, quanList);
		
		
	}
}
