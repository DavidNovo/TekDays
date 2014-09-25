package com.tekdays

class TekUser {
	String fullName
	String userName
	String password
	String email
	String website
	String bio

	String toString() {
		fullName
	}

    static constraints = {
    	// need () to ensure ordering
    	fullName ()
    	userName ()
    	password ()
    	email email:true
    	website url:true
    	bio maxSize:5000
    }
}
