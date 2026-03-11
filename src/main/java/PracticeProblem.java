public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void bubbleSortString(String [] strings) {
		for (int i=0; i<strings.length-1;i++) {
			boolean c=false;
			for (int j=0;j<strings.length-1;j++) {
				if (strings[j].compareToIgnoreCase(strings[j+1])>0) {
					String x=strings[j];
					strings[j]=strings[j+1];
					strings[j+1]=x;
					c=true;
				}
			}
			if (!c) {
				i=strings.length;
			}
		}
	}

}
