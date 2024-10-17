package ej10.ej10;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected Strategy strat;

    public JobScheduler () {
        this.jobs = new ArrayList<>();
        this.strat = new FIFO();
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public void setStrategy(Strategy typeOfStrat) {
         this.strat = typeOfStrat;
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public Strategy getStrategy() {
        return this.strat;
    }

    public JobDescription next() {
    	JobDescription nextJob = null;
    	if(!jobs.isEmpty()) {
    		nextJob = strat.getNextJob(jobs);
    		this.unschedule(nextJob);
    	}
            
        return nextJob;
    }

}
