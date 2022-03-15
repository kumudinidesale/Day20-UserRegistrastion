package com.Day20_UserRegistrastion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrastionTest {
	@Before
	public void setup() {
		UserRegistrastion userRegistration = new UserRegistrastion();
	}

	// positive test case for userName return->true
	@Test
	public void givenFirstName_WhenFirstNameCapital_ShouldReturnTrue() {
		UserRegistrastion userRegistration = new UserRegistrastion();
		boolean actual = userRegistration.validateUsername("Pranav");

		Assert.assertTrue(actual);
	}

	// negative test case for userName return->false
	@Test
	public void givenFirstName_WhenFirstNameCapital_ShouldReturnFalse() {
		UserRegistrastion userRegistration = new UserRegistrastion();
		boolean actual = userRegistration.validateUsername("abc");
		Assert.assertFalse(actual);
	}

	// positive test case for LastName return->true
	@Test
	public void givenLastName_WhenLastNameCapital_ShouldReturnTrue() {
		UserRegistrastion userRegistration = new UserRegistrastion();
		boolean actual = userRegistration.validateLastname("Abcd");
		Assert.assertTrue(actual);
	}

	// negative test case for userName return->false
	@Test
	public void givenlastName_WhenlastNameCapital_ShouldReturnFalse() {
		UserRegistrastion userRegistration = new UserRegistrastion();
		boolean actual = userRegistration.validateLastname("abcd");
		Assert.assertFalse(actual);
	}

	// positive test case for PhoneNo return->true
	@Test
	public void givenphoneNo_WhenPhoneNoTendigit_ShouldReturnTrue() {
		UserRegistrastion userRegistration = new UserRegistrastion();
		boolean actual = userRegistration.validateMobileNo("917894567456");
		Assert.assertTrue(actual);
	}

	// negative test case for PhoneNo return->false
	@Test
	public void givenPhoneNo_WhenPhoneNoTendigit_Capital_ShouldReturnFalse() {
		UserRegistrastion userRegistration = new UserRegistrastion();
		boolean actual = userRegistration.validateMobileNo("4785748596");
		Assert.assertFalse(actual);
	}

	// positive test case for PhoneNo return->true
	@Test
	public void givenPassword_WhenPasswordCondition_ShouldReturnTrue() {
		UserRegistrastion userRegistration = new UserRegistrastion();
		boolean actual = userRegistration.validatePassword("Pranavv@1");
		Assert.assertTrue(actual);
	}

	// negative test case for PhoneNo return->false
	@Test
	public void givenPhoneNo_WhenPasswordCondition_Capital_ShouldReturnFalse() {
		UserRegistrastion userRegistration = new UserRegistrastion();
		boolean actual = userRegistration.validatePassword("pranav");
		Assert.assertFalse(actual);
	}

}
