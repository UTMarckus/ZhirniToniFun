class dick {

	public static void main(String[] args) {
		
		int i = 3;
		int k = 5;
		i = count(i);
		k = count(k);
		System.out.println(i);
		System.out.println(k);

	}
	
	private static int count(int x) {
		return ++x;
	}

}
