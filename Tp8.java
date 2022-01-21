package tp_algo_base_java;

public class Tp8 {

	public static String concatener(String t[]) {
		String res="";
		for (int i=0; i<t.length; i++)
			res = res + " "+t[i];
		return res;
	}
	
	// meme nom ! ("concatener()") : surcharge
	public static String concatener(char t[]) {
		String res="";
		for (int i=0; i<t.length; i++)
			res = res + t[i];
		return res;
	}
	
	public static boolean present(char t[], char c) {
		for (int i=0; i<t.length; i++)
			if (t[i] == c) return true;
		return false;
	}
	
	public static int occurrences(String t[], String m) {
		int res=0;
		for (int i=0; i<t.length; i++)
			if (t[i] == m) res++;
		return res;
	}
	
	public static boolean concatenerEgal(char t[], String m) {
		if (m.equals(concatener(t))) return true;
		return false;
	}
	
	public static void afficherLettres(String m) {
		for (int i=0; i<m.length(); i++)
			System.out.println(m.charAt(i));
	}
	
	public static boolean present(String m, char c) {
		for (int i=0; i<m.length(); i++)
			if (m.charAt(i) == c) return true;
		return false;
	}
	
	public static boolean present(String t[], char c) {
		for (int i=0; i<t[i].length(); i++)
			if (present(t[i], c)) return true;
		return false;
	}
	
	public static int occurrences(String m, char c) {
		int res=0;
		for (int i=0; i<m.length(); i++)
			if (m.charAt(i) == c) res++;
		return res;
	}
	
	public static String sansEspace(String m) {
		String res="";
		for (int i=0; i<m.length(); i++)
			if (m.charAt(i) != ' ') res = res + m.charAt(i);
		return res;
	}
	
	public static String remplacer(String m, char x, char y) {
		String res="";
		for (int i=0; i<m.length(); i++)
			if (m.charAt(i) == x) res = res + y;
			else res = res + m.charAt(i);
		return res;
	}
	
	public static void main(String[] args) {
		String t1[] = {"aaa", "bb", "aa", "bbb", "aa"};
		char t2[] = {'a', 'b', 'c'};
		System.out.println(concatener(t1));
		System.out.println(concatener(t2));
		System.out.println(present(t2, 'c'));
		System.out.println(occurrences(t1, "aa"));
		System.out.println(concatenerEgal(t2, "abc"));
	
		afficherLettres("toto");
		
		System.out.println(present("toto", 'o'));
		System.out.println(present("toto", 'f'));
		
		System.out.println(present(t1, 'b'));
		System.out.println(present(t1, 'f'));
		
		System.out.println(occurrences("toto", 't'));
		System.out.println(occurrences("toto", 'f'));
		
		System.out.println(sansEspace("aaa bb aa bbb"));
		System.out.println(remplacer("aaa bb aa bbb", 'a', 'c'));
	}
}
