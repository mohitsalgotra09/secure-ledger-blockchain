public class Main {
    public static void main(String[] args) {
        Blockchain.blockchain.add(new Block("Genesis Block", "0"));
        Blockchain.blockchain.get(0).mineBlock(Blockchain.difficulty);

        Blockchain.blockchain.add(new Block("Transfer 50 BTC to Mohit", Blockchain.blockchain.get(0).hash));
        Blockchain.blockchain.get(1).mineBlock(Blockchain.difficulty);

        System.out.println("Blockchain is Valid: " + Blockchain.isChainValid());
    }
}
