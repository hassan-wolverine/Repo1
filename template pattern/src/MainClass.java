public class MainClass {

    public static void main(String[] args) {
        DataMiner miner = new PdfDataMiner();
        miner.mine("c://7mada.txt");

        miner = new DocDataMiner();
        //miner.mine("c://7mada.txt");
    }

}
