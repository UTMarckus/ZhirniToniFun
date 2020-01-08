class dick {

	public static void main(String[] args) {
		
		Reader r = new Reader();
		r.Scan();
		//i = count(i);
		//k = count(k);
		System.out.println(count(r.i));
		System.out.println(count(r.k));

	}
	
	private static int count(int x) {
		return ++x;
	}

}
