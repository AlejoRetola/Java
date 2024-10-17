package ej10.ej10;

import java.util.List;

public class MostEffort implements Strategy{

	@Override
	public JobDescription getNextJob(List<JobDescription> jobs) {
		JobDescription nextJob = jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                .orElse(null);
		return nextJob;
	}

}
