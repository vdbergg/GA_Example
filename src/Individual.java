/**
 * Created by berg on 11/11/16.
 */

public class Individual {
    public static int defaultGeneLength = 232;
    private byte[] genes = new byte[defaultGeneLength];

    /**
     * Cache
     */
    private int fitness = 0;

    /**
     * Create a random individual
     */
    public void genereteIndividual() {
        for (int i = 0; i < size(); i++) {
            byte gene = (byte) Math.round(Math.random());
            genes[i] = gene;
        }
    }

    public static void setDefaultGeneLength(int length) {
        defaultGeneLength = length;
    }

    public byte getGene(int index) {
        return genes[index];
    }

    public void setGene(int index, byte value) {
        genes[index] = value;
        fitness = 0;
    }

    public int size() {
        return genes.length;
    }

    public int getFitness() {
        if (fitness == 0) fitness = FitnessCal.getFitness(this);
        return fitness;
    }

    public String toString() {
        String geneString = "";
        for (int i = 0; i < size(); i++) geneString += getGene(i);
        return geneString;
    }
}
