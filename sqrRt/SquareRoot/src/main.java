public class main {
    public static void main(String[] args) throws Exception {
        int hi[] = {1,2,3};

        hi.toString();
    }
    public void toString(int[] ho) {
            String returnedString = "";
        returnedString += "{";
        for (int i=0;i<ho.length;i++) {
            returnedString += ho[i] + " ,";
        }
        returnedString+="}";
        System.out.println(returnedString);
    }
}


