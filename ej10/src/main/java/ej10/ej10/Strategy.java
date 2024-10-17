package ej10.ej10;

import java.util.List;

public interface Strategy {
	public JobDescription getNextJob(List<JobDescription> jobs);
}
