package ej10.ej10;

import java.util.List;

public class FIFO implements Strategy{
	public FIFO() {
	}
	
	public JobDescription getNextJob(List<JobDescription> jobs) {
			JobDescription nextJob = null;
			nextJob = jobs.get(0);
	        return nextJob;
		
	}
	
}
