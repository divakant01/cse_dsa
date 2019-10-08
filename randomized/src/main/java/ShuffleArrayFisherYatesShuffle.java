import java.util.Random;

/**
 * @author Divakant Pandey
 */
public class ShuffleArrayFisherYatesShuffle {

    public int[] shuffle(int[] array){

        Random r =new Random();

        for (int i =array.length-1 ; i >=0; i--) {

            int random=r.nextInt(i+1);

            swap(array,i,random);
        }

        return array;
    }

    private void swap(int[] array, int i, int random) {
        int temp=array[i];
        array[i]=array[random];
        array[random]=temp;
    }

}
