package 클로링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class crawiling2 {
	
	String [] comNum = {"005930", "180640", "001060", "096530", "028300"};
	Connection[] conNum = new Connection [5];
	Document[] docNum = new Document [5];
	Elements[] listNum = new Elements [5];
	
	
	public void forName(String s, String[] list) {
		for (int i = 0; i < conNum.length; i++) {
			conNum[i] = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + comNum[i]);
			try {
				docNum[i] = conNum[i].get();			
				listNum[i] = docNum[i].select(s);				
				System.out.println();
				list[i] = listNum[i].get(0).text();					
			} catch (Exception e) {
				System.out.println("예외가 있습니다. 처리하세요");
				e.getStackTrace();
			}
		}
			for (String s1 : list) {
				System.out.println(s1);
		}
	
	}
	
	public void forLast(String s, String[] list) {
		for (int i = 0; i < conNum.length; i++) {
			conNum[i] = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + comNum[i]);
			try {
				docNum[i] = conNum[i].get();			
				listNum[i] = docNum[i].select(s);				
				System.out.println();
				list[i] = listNum[i].get(0).text();				
			} catch (Exception e) {
				System.out.println("예외가 있습니다. 처리하세요");
				e.getStackTrace();
			}
		}
				for (String s1 : list) {
					System.out.println(s1);
			}
		
	}
	
	public void forStart(String s, String[] list) {
		for (int i = 0; i < conNum.length; i++) {
			conNum[i] = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + comNum[i]);
			try {
				docNum[i] = conNum[i].get();			
				listNum[i] = docNum[i].select(s);				
				System.out.println();
				list[i] = listNum[i].get(0).text();				
			} catch (Exception e) {
				System.out.println("예외가 있습니다. 처리하세요");
				e.getStackTrace();
			}
		}	
		for (int i = 5; i < 10; i++) {
			System.out.println(list[i]);
		}
	}
	
	public void forYester(String s, String[] list) {
		for (int i = 0; i < conNum.length; i++) {
			conNum[i] = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + comNum[i]);
			try {
				docNum[i] = conNum[i].get();			
				listNum[i] = docNum[i].select(s);				
				System.out.println();
				list[i] = listNum[i].get(0).text();				
			} catch (Exception e) {
				System.out.println("예외가 있습니다. 처리하세요");
				e.getStackTrace();
			}
		}	
		for (int i = 0; i < 5; i++) {
			System.out.println(list[i]);
		}
	}
	
	public void forhigh(String s, String[] list) {
		for (int i = 0; i < conNum.length; i++) {
			conNum[i] = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + comNum[i]);
			try {
				docNum[i] = conNum[i].get();			
				listNum[i] = docNum[i].select(s);				
				System.out.println();
				list[i] = listNum[i].get(0).text();				
			} catch (Exception e) {
				System.out.println("예외가 있습니다. 처리하세요");
				e.getStackTrace();
			}
		}	
		for (String s1 : list) {
			System.out.println(s1);
	}
	}
	
	public void forlow(String s, String[] list) {
		for (int i = 0; i < conNum.length; i++) {
			conNum[i] = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + comNum[i]);
			try {
				docNum[i] = conNum[i].get();			
				listNum[i] = docNum[i].select(s);				
				System.out.println();
				list[i] = listNum[i].get(0).text();				
			} catch (Exception e) {
				System.out.println("예외가 있습니다. 처리하세요");
				e.getStackTrace();
			}
		}	
		for (String s1 : list) {
			System.out.println(s1);
	}
	}
	
	public void forquan(String s, String[] list) {
		for (int i = 0; i < conNum.length; i++) {
			conNum[i] = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + comNum[i]);
			try {
				docNum[i] = conNum[i].get();			
				listNum[i] = docNum[i].select(s);				
				System.out.println();
				list[i] = listNum[i].get(0).text();				
			} catch (Exception e) {
				System.out.println("예외가 있습니다. 처리하세요");
				e.getStackTrace();
			}
		}
		for (String s1 : list) {
			System.out.println(s1);
	}
	}
}
