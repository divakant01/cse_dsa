import java.util.Random;

/**
 * @author Divakant Pandey
 *
 * Used for sampling a large array typically which doesnt fit into memory
 *
 */
public class ReservoirSampling {

    public int[] sample(int [] stream,int n,int k){

        final int[] random=new int[k];

        for (int i = 0; i < k; i++) {
            random[i]=stream[i];
        }

        Random r=new Random();

        for (int i=k; i < n; i++) {

            int randomNo=r.nextInt(i+1);

            if(randomNo<k){
                random[randomNo]=stream[i];
            }
        }
        return random;
    }

}
