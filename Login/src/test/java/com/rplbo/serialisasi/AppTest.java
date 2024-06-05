package com.rplbo.serialisasi;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testUserLoginSuccess() {
        User user = new User("userTester", "rahasia123");
        Assert.assertTrue("Login harus berhasil", user.doLogin("rahasia123"));
    }

    @Test
    public void testUserLoginFail() {
        User user = new User("userTester", "rahasia123");
        Assert.assertFalse("Login harus gagal", user.doLogin("salahPassword"));
    }

    @Test
    public void testChangePasswordAndLogin() {
        User user = new User("userTester", "rahasia123");
        user.ubahPassword("passwordBaru");
        Assert.assertTrue("Login dengan password baru harus berhasil", user.doLogin("passwordBaru"));
    }
}