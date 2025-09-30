//Author: Original file by Murat Gungor, modified by Astrid Konicki
//
// Certification of Authenticity :
//I certify that this is entirely my own work, except where I have given fully documented
// references to the work of others.I understand the definition and
// consequences of plagiarism and acknowledge that the assessor of this assignment
// may, for the purpose of assessing this assignment :
// -Reproduce this assignment and provide a copy to another member of
// academic staff; and / or
// - Communicate a copy of this assignment to a plagiarism checking service
// (which may then retain a copy of this assignment on its database for
// the purpose of future plagiarism checking)


package NewRecorders;

import LegacyCode.Recorder;

import java.util.Base64;

public class EncryptFile implements RecorderDecorator {

    private Recorder recorder;
    public EncryptFile(Recorder recorder) {
        this.recorder = recorder;
    }
    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }

    @Override
    public Recorder getRecorder() {
        return this.recorder;
    }

    @Override
    public void writeData(String data) {
        getRecorder().writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(getRecorder().readData());
    }
}