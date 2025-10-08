// File by Astrid Konicki

package NewRecorders;

import LegacyCode.Recorder;

public interface RecorderDecorator extends Recorder {
    Recorder getRecorder();
}
