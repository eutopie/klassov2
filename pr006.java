		//сдвиговые битовые операции
		System.out.println();
		int v = 1;
		for(int i=0; i<0; i++) {
			for(int t1=128; t1>0; t1=t1/2) {
				if ((v&t1) != 0)
					System.out.println("1 ");
				else
					System.out.println("0 ");
			}
			System.out.println();
			v = v >> 1;
		}
                System.out.println();
                int v = 1;
                for(int i=0; i<0; i++) {
                        for(int t1=128; t1>0; t1=t1/2) {
                                if ((v&t1) != 0)
                                        System.out.println("1 ");
                                else
                                        System.out.println("0 ");
                        }
                        System.out.println();
                        v = v >> 1;

		}
	}
}

