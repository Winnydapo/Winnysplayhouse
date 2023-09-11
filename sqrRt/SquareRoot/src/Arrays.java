class Arrays {
    // This class provides various array manipulation methods.

    // Method to convert an integer array to a string representation
    public static void toString(int[] originalArr) {
        String returnedString = "[";

        // Loop through the array elements
        for (int i = 0; i < originalArr.length; i++) {
            // Check if it's the last element to avoid adding an extra comma
            if (i == originalArr.length - 1) {
                returnedString += originalArr[i];
            } else {
                returnedString += originalArr[i] + ",";
            }
        }

        returnedString += "]";
        System.out.println(returnedString);
    }

    // Method to create a copy of an integer array with length of a specific length
    public static int[] copyOf(int[] original, int newLength) {
        int[] copy = new int[newLength];

        // Copy elements from the original array to the new array
        for (int i = 0; i < newLength && i < original.length; i++) {
            copy[i] = original[i];
        }

        // Print the copied array using the toString method
        Arrays.toString(copy);
        return copy; // Return the copied array
    }

    // Method to create a subarray by specifying a range within the original array
    public static int[] copyOfRange(int[] originalArr, int beginning, int end) {
        int[] copy = new int[end - beginning];

        // Copy elements from the specified range of the original array
        for (int i = 0; i < (end - beginning); i++) { 
            copy[i] = originalArr[i + beginning];
        }

        // Print the copied array using the toString method
        Arrays.toString(copy);
        return copy;
    }

    // Method to fill an array with a specified value
    public static int[] fill(int[] originalArr, int value) {
        int[] copy = new int[originalArr.length];

        // Fill the new array with the specified value
        for (int i = 0; i < originalArr.length; i++) {
            copy[i] = value;
        }

        // Print the filled array using the toString method
        Arrays.toString(copy);
        return copy;
    }

    // Method to check if two arrays are equal element by element
    public static boolean equals(int[] arr1, int[] arr2) {
        // If the arrays have different lengths, they can't be equal
        if (arr1.length != arr2.length) {
            return false;
        }

        // Compare elements of the two arrays
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false; // If any elements differ, the arrays are not equal
            }
        }

        return true; // If all elements are equal, the arrays are equal
    }
}
