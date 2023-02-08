package tests.rest;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AuthControllerTest extends BaseApiTest {

    @Test
    public void postSingIn() throws IOException {
        // authentication done in setup method of BaseApiTest
        Assert.assertFalse(StringUtils.isEmpty(auth.getToken()), "Token shouldn't be empty");
    }
}
