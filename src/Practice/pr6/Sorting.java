package Practice.pr6;

public class Sorting {
    static int[] studID = new int[] {23, 24, 67, 88, 2, 34, 77, 91, 11, 60};

    static void sort(int[] list) {
        int i, j, pocket;
        for (i=1; i!=list.length; i=i+1) {
            for (j=0; j!=i; j=j+1) {
                if (list[i]<list[j]) {
                    pocket=list[j];
                    list[j]=list[i];
                    list[i]=pocket;
                }
            }
        }
    }

    public static void main(String[] args) {
        sort(studID);
        System.out.println(studID[0]+" "+studID[1]+" "+studID[2]+" "+studID[3]+" "+studID[4]+" "+studID[5]+" "+studID[6]+" "+studID[7]+" "+studID[8]+" "+studID[9]);
    }
}
