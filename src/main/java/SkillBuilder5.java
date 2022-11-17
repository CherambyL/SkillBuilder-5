import java.util.Objects;

/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class SkillBuilder5
{
    /**
     * Calculates the prefix average of array data and returns the prefex average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */
    public static double[] prefixAverage(double[] data)
    {
        //TODO: replace this line with your code.
        double l = 0;
        double[] newdData = new double[data.length];
        int counter = 0;
        for(double i : data){
            l += i;
            newdData[counter] = (double) l / (counter + 1);
            counter++;
        }

        return newdData;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int  indexOf(int searchValue, int[] anArray)
    {
        //TODO: replace this line with your code.
        for(int x = 0; x < anArray.length; x++){
            if (anArray[x] == searchValue){
                return x;
            }
        }
        return -1;
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param s a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int  indexOf(String s, String[] anArray)
    {
        //TODO: replace this line with your code.
        for(int y = 0; y < anArray.length; y++ ){
            if(anArray[y]== s){
                return y;
            }
        }
        return -1;
    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param s string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray)
    {
       int varOne = 0;
       int varTwo =0;
       for(String pie: anArray) {
           if (pie != s) {
               varOne++;
           }
       }
               String[] p = new String[varOne];
           for(String eip: anArray){
               if(!Objects.equals(eip, s)){
                   p[varTwo] = eip;
                   varTwo++;
               }
           }
        return p;
    }

    /**
     * Reverses an array of integers.
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray)
    {
        int[] newArray = new int[anArray.length];
        for(int i = 0; i < anArray.length; i++) newArray[i] = anArray[i];
        int counter = 0;
        for(int i = newArray.length-1; i >= 0; i--){
            anArray[counter] = newArray[i];
            counter++;
        }
    }
}
