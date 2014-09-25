import com.tekdays.TekEvent

class BootStrap {

    def init = { servletContext ->
    	def event1 = new TekEvent(name:'MX Challenge',
    		city:'San Antonio',
    		organizer:'Jose Samules',
    		venue:'TBD',
    		startDate:new Date ('11/21/2015'),
    		endDate: new Date('11/29/2015'),
    		description:'''Bringing developers and creators from Mexico and the US together in the city 
    		of San Antonio''')
    	//check that I can save this event ot the in-memory database
    	if(!event1.save()) {
    		event1.errors.allErrors.each { error ->
    			println "An error occured with event1: ${error}" 
    		}
    	}
    	

    	def event2	=	new TekEvent(name:'Perl for the People',
    		city:'Dallas',
    		organizer:'that guy who made it',
    		venue:'TBD',
    		startDate: new Date ('05/01/2015'),
    		endDate: new Date ('05/04/2015'),
    		description:'''Who said people no longer willingly use Perl?  Let''s 
    		prove them wrong''')
    	// check for correctness of this event
    	if(!event2.save()) {
    		event2.errors.allErrors.each { error ->
    			println "An error occured with event2: ${error}"
    		}
    	}
	}
    
    def destroy = {
    }
}
