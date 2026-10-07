class MyCalendar {
    private TreeMap<Integer,Integer> calendar;
    public MyCalendar() {
        calendar= new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer prevstart= calendar.floorKey(start);
        Integer nextstart= calendar.ceilingKey(start);

        if(prevstart!=null && calendar.get(prevstart)>start){
            return false;
        }
        if(nextstart!=null && nextstart<end){
            return false;
        }
        calendar.put(start,end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */