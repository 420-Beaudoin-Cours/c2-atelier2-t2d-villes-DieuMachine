public class Villes {
    public static void afficherTab(int[][] tab2D){
        for (int i = 0; i < tab2D.length; i++) {
            for (int j = 0; j < tab2D[i].length; j++) {
                System.out.print(tab2D[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static int sommeUneLigne(int[][] tab2D, int ligne){
        int total = 0;
        for (int i = 0; i < tab2D[ligne].length; i++)
            total += tab2D[ligne][i];
        return total;
    }

    public static double moyenneUneLigne(int[][] tab2D, int ligne){
        double moyenne = 0;
        for (int i = 0; i < tab2D[ligne].length; i++)
            moyenne += tab2D[ligne][i];
        return moyenne/ tab2D[ligne].length;
    }

    public static double moyenneUneCol(int[][] tab2D, int col){
        double moyenne = 0;
        for (int i = 0; i < tab2D.length; i++)
            moyenne += tab2D[i][col];
        return moyenne/ tab2D.length;
    }

    public static int maxLigne(int[][] tab2D, int ligne){
        int max = tab2D[ligne][0];
        for (int i = 0; i < tab2D[ligne].length; i++){
            if (max < tab2D[ligne][i])
                max = tab2D[ligne][i];
        }
        return max;
    }

    public static int minLigne(int[][] tab2D, int ligne){
        int min = tab2D[ligne][0];
        for (int i = 0; i < tab2D[ligne].length; i++){
            if (min > tab2D[ligne][i])
                min = tab2D[ligne][i];
        }
        return min;
    }
}
