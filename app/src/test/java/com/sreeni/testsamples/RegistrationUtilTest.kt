package com.sreeni.testsamples


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {
    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationForm(
            username = "",
            password = "1234",
            confirmPassword = "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correct repeated passwords return true`() {
        val result = RegistrationUtil.validateRegistrationForm(
            username = "Sreen",
            password = "1234",
            confirmPassword = "1234"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationForm(
            username = "Sreenu",
            password = "1234",
            confirmPassword = "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationForm(
            username = "Sreenu",
            password = "",
            confirmPassword = ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password repeated incorrectly returns false`() {
        val result = RegistrationUtil.validateRegistrationForm(
            username = "Sreenu",
            password = "1234",
            confirmPassword = "abcd"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains lessthan 2 digits returns false`() {
        val result = RegistrationUtil.validateRegistrationForm(
            username = "Sreenu",
            password = "1",
            confirmPassword = "1"
        )
        assertThat(result).isFalse()
    }


    @Test
    fun `check braces count is not correct`() {
        val res = RegistrationUtil.checkBraces(
            "(a+b))"
        )
        assertThat(res).isFalse()
    }

    @Test
    fun `check braces count is correct`() {
        val res = RegistrationUtil.checkBraces(
            "(a+b)"
        )
        assertThat(res).isTrue()
    }
}