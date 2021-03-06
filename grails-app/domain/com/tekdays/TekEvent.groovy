package com.tekdays

class TekEvent {

	String city
	String name
	String organizer
	String venue

	Date startDate
	Date endDate
	String description 

    static constraints = {
    	// define display order of attributes
    	// listing name first makes it a link by default
    	name()
    	city()
    	description maxSize:5000
    	organizer()
    	venue()
    	startDate()
    	endDate()
    }

    String toString() {
    	"$name, $city"
    }
}
