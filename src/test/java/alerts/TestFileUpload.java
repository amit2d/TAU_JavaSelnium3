package alerts;

import org.testng.annotations.Test;
import testBase.TestBase;

import static org.testng.Assert.assertEquals;

public class TestFileUpload extends TestBase {

    @Test
    public void testFileUpload () {
        String filePath = "C:\\tools\\OOSU10.exe";
        var fileUploadPage = homePage.clickOnFileUploadPage();
        fileUploadPage.sendFileAbsolutePath(filePath);
        fileUploadPage.clickUploadButton();
        assertEquals(fileUploadPage.getUploadedFileName(),"OOSU10.exe","File name incorrect!!");
    }

}
