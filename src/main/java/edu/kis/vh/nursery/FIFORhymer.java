package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer tempCountingOutRhymer = new DefaultCountingOutRhymer();
    
    @Override
    public int countOut() {
        while (!callCheck())
            
        tempCountingOutRhymer.countIn(super.countOut());
        
        int ret = tempCountingOutRhymer.countOut();
        
        while (!tempCountingOutRhymer.callCheck())
            
        countIn(tempCountingOutRhymer.countOut());
        
        return ret;
    }
}
