public class Day2 {
    public static void main(String args[]){
        int NumberOfBottles = 5;
        String word = "bottles";
        while (NumberOfBottles > 0) {
            if (NumberOfBottles == 1) {
                word = "bottle";
                
            }
            System.out.println(NumberOfBottles + " green " + word + "hanging on the wall");
            System.out.println("If on accidentally falls down");
            NumberOfBottles = NumberOfBottles - 1;
            System.out.println(NumberOfBottles + " green " + word + "hanging on the wall");
            
        }
    }
}
