public class Main {

    public static void main(String[] args) {

        long totalRows = 1000000000L;
        long rowsPerBlock = 10000;
        long numberOfBlocks;

        numberOfBlocks = totalRows / rowsPerBlock;

        int bytesPerBlock = 16;

        long totalStorage = numberOfBlocks * bytesPerBlock;

        System.out.println("DuckDB Skip-Index Analysis");
        System.out.println("---------------------------");

        System.out.println("Total Rows: " + totalRows);
        System.out.println("Rows Per Block: " + rowsPerBlock);

        System.out.println("Number of Blocks: " + numberOfBlocks);

        System.out.println("Skip-Index Storage: " + totalStorage + " bytes");

        double storageMB = totalStorage / (1024.0 * 1024.0);

        System.out.println("Skip-Index Storage in MB: " + storageMB);

        System.out.println("\nConclusion:");
        System.out.println("Zone maps provide efficient filtering with very low storage overhead.");
    }
}
