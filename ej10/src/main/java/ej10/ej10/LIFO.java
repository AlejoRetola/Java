package ej10.ej10;

import java.util.List;

public class LIFO implements Strategy {

	@Override
	public JobDescription getNextJob(List<JobDescription> jobs) {
		JobDescription nextJob = jobs.get(jobs.size()-1);
		return nextJob;
	}

}
