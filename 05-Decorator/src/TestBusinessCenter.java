// File by Murat Gungor, modified by Astrid Konicki

import LegacyCode.BusinessCenter;
import LegacyCode.FileRecorder;
import NewRecorders.CompressFile;
import NewRecorders.EncryptFile;

public class TestBusinessCenter {

 public static void testDataRecorder() {

        String fileName = ".//RecordingFile.txt";
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000\t";

        FileRecorder fileRecorder = new FileRecorder(fileName);
        fileRecorder.clearFileContent();

        BusinessCenter businessCenter = new BusinessCenter();
        businessCenter.perform(fileRecorder, salaryRecords);
        
        System.out.println("- Input ----------------------");
        System.out.println(salaryRecords);
        System.out.println("- Recorded --------------------");
        System.out.println(fileRecorder.readData());
        
        System.out.println("*********************");

    }

    public static void testDataRecorderWithEncryption() {

        String fileName = ".//RecordingFileEncrypt.txt";
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        //You can add/edit code below
        FileRecorder fileRecorder = new FileRecorder(fileName);
        fileRecorder.clearFileContent();

        EncryptFile encryptFile = new EncryptFile(fileRecorder);

        BusinessCenter businessCenter = new BusinessCenter();
        businessCenter.perform(encryptFile, salaryRecords);

        System.out.println("- Input ----------------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------------");
        System.out.println(fileRecorder.readData()); // Print encoded content
        System.out.println("- Decoded --------------------");
        System.out.println(encryptFile.readData()); // Print decoded content
    }

    public static void testDataRecorderWithEncryptionAndCompression() {

        String fileName = ".//RecordingFileEncryptCompress.txt";
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

		//You can add/edit code below
        FileRecorder fileRecorder = new FileRecorder(fileName);
        fileRecorder.clearFileContent();

        EncryptFile encryptFile = new EncryptFile(fileRecorder);
        CompressFile compressFile = new CompressFile(encryptFile);

        BusinessCenter businessCenter = new BusinessCenter();
        businessCenter.perform(compressFile, salaryRecords);

        System.out.println("- Input ----------------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded & Compressed -------");
        System.out.println(fileRecorder.readData()); // Print encoded & compressed content
        System.out.println("- Decoded & Decompressed -----");
        System.out.println(compressFile.readData()); // Print decoded content
    }

    public static void main(String[] args) {
        System.out.println("Testing basic data recorder: ");
        testDataRecorder(); // Done for you
        System.out.println("\nTesting encryption data recorder: ");
        testDataRecorderWithEncryption();
        System.out.println("\nTesting encryption and compression data recorders: ");
        testDataRecorderWithEncryptionAndCompression();
    }
}