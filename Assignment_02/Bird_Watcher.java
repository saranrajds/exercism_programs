
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();            
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        
        return birdsPerDay[this.birdsPerDay.length-1]; 
    }

    public void incrementTodaysCount() {
        int today = birdsPerDay[this.birdsPerDay.length-1];
        birdsPerDay[this.birdsPerDay.length-1] = today+1;
    }

    public boolean hasDayWithoutBirds() {

        for(int i : birdsPerDay)
        {
            if (i == 0)
                return true;
        }
        return false;
        // return birdsPerDay[birdsPerDay.length-1] == 0;
    }

    public int getCountForFirstDays(int numberOfDays) {

        int count = 0;
        for(int i = 0; i < numberOfDays && i < birdsPerDay.length; i++)
        {
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        
        int count = 0;
        for(int i : birdsPerDay)
        {
            if (i >= 5)
                count += 1;
        }
        return count;
    }
}
