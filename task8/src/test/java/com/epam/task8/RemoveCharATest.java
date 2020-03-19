package com.epam.task8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveATest {
	RemoveCharFromString  removeCharFromString;
	@BeforeEach
	void setup() {
		removeCharFromString = new RemoveCharFromString();
	}
	 @Test
	    public void removeAtBeginning(){
	        assertEquals("BCD", RemoveCharFromString.remove("ABCD", 'A'));
	        assertEquals("CD", RemoveCharFromString.remove("AACD", 'A'));
	    }
	 
	    @Test
	    public void removeAtMiddle(){
	        assertEquals("BCD", RemoveCharFromString.remove("BACD", 'A'));
	    }
	 
	    @Test
	    public void cornerCases(){
	        assertEquals("", RemoveCharFromString.remove("", 'A'));
	        assertEquals("", RemoveCharFromString.remove("AAAAAAAAAAAAAAAA", 'A'));
	    }

}


