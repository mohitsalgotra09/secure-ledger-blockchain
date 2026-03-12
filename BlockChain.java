import java.util.ArrayList;

public class Blockchain {
    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static int difficulty = 5;

    public static Boolean isChainValid() {
        Block currentBlock; 
        Block previousBlock;
        
        for(int i=1; i < blockchain.size(); i++) {
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i-1);
            if(!currentBlock.hash.equals(currentBlock.calculateHash())) return false;
            if(!previousBlock.hash.equals(currentBlock.previousHash)) return false;
        }
        return true;
    }
}
