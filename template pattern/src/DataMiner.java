public abstract class DataMiner {

    // template method
    public void mine(String path) {
        this.openFile(path);
        this.extractData();
        this.parseData();
        this.analyzeData();
        this.sendReport();
        this.closeFile(path);
    }

    public void openFile(String path) {
        System.out.println("open file of this path");
    }

    public abstract void extractData();

    public abstract void parseData();

    public void analyzeData() {
        System.out.println("analyze data of the file");
    }

    public void sendReport() {
        System.out.println("send report of the analyzed data");
    }

    public void closeFile(String path) {
        System.out.println("close file of this path");
    }
}
