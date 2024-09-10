class pr002 {
        public static void main(String args[]) {
		byte b, bb, bbb; // 8-bit peremennaya
		short s, ss, sss; // 16-bit peremennaya
		int i, ii, I; // 32- bit peremennaya
		long l, ll, L;	// 64-bit peremennaya
		b = 127;
		bb = (byte)130;
		s = 32000;
		ss = (short)33000;
		System.out.println("bb = " + bb + "\nss = " + ss);
		sss = 100;
		//bbb = sss; avtopreobrazovanie zapreweno tak kak mojet privesti k potere dannyx
		bbb = (byte)sss;
		System.out.println("bbb = " + bbb + "\nsss = " + sss);

		// primer ispolzovaniya razlichnix celyx tipov 
		ii = 700000; // storona kyba v millimetrax
		int V = ii*ii*ii; // obyem kyba
		long VV = (long)ii*ii*ii;
		System.out.println(VV);
		
		double d, dd;
		d = b/2;
		System.out.println("d = " + d);
		dd = (double)b/2;
		System.out.println("dd = " + dd);
	
	}
}
