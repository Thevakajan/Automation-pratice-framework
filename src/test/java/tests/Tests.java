package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.MyScreenRecorder;
import utils.TestBase;

import static utils.MyScreenRecorder.*;

public class Tests extends TestBase {
    @Test
    public void testGenderlInformation() throws Exception {
        MyScreenRecorder.startRecording("Start Gentral Information ");
        LoginPage.setUserName("admin");
        LoginPage.setPassword("Admin123");
        LoginPage.clickLogin();
        MyScreenRecorder.stopRecording();


    }
}
