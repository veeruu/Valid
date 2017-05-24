package test;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel2;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogOut extends BaseTest
{
@Test(priority=1)
public void testValidLoginLogOut(){
String un=Excel2.getCellData(INPUT_PATH, "ValidLoginLogOut", 1, 0);
String pw=Excel2.getCellData(INPUT_PATH, "ValidLoginLogOut", 1, 1);
String hpt=Excel2.getCellData(INPUT_PATH, "ValidLoginLogOut", 1, 2);
String lpt=Excel2.getCellData(INPUT_PATH, "ValidLoginLogOut", 1, 3);
LoginPage l=new LoginPage(driver);
l.setUserName(un);
l.setPassWord(pw);
l.clickLogin();
EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
e.verifyTitle(hpt);
e.clickLogOut();
l.verifyTitle(lpt);
}
}
