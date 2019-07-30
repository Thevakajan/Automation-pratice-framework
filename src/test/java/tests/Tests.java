package tests;

import org.testng.annotations.Test;
import utils.MyScreenRecorder;
import utils.TestBase;

public class Tests extends TestBase {
    @Test
    public void testGenderlInformation() throws Exception {
        MyScreenRecorder.startRecording("Start Gentral Information ");
        MyScreenRecorder.stopRecording();


    }
}
