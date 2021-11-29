
/**
 *Find the shortest path between two words in a large text file.
 */
public class Problem02 {

    static int getShortestPath(String[] text, String w1, String w2) {
        int min = Integer.MAX_VALUE;
        int lastPosWord1 = -1;
        int lastPosWord2 = -1;
        for (int i = 0; i < text.length; i++) {
            String currentWord = text[i];
            if (currentWord.equals(w1)) {
                lastPosWord1 = i;
                int distance = lastPosWord1 - lastPosWord2;
                if (lastPosWord2 >= 0 && min > distance) {
                    min = distance;
                }
            } else if (currentWord.equals(w2)) {
                lastPosWord2 = i;
                int distance = lastPosWord2 - lastPosWord1;
                if (lastPosWord1 >= 0 && min > distance) {
                    min = distance;
                }
            }
        }
        return (min>=Integer.MIN_VALUE-text.length)?-1:min;
    }
    
    public static void main(String[] args) {
        String txt="The first European settler in the area was Thomas Powell, "
                + "who arrived in 1687. On October 18, 1695, he purchased a "
                + "15-square-mile (39 km2) tract of land from three Native "
                + "American tribes. This is known as the Bethpage Purchase and "
                + "includes what is now Farmingdale, as well as Bethpage, Melville, "
                + "North Massapequa, Old Bethpage, Plainedge, and Plainview. "
                + "One of two houses he built in the area (circa 1738) still "
                + "stands on Merritts Road in Farmingdale.";
        System.out.println("The distance is "+ 
                getShortestPath(txt.split(" "), "first", "arrived"));
        
    }

}
