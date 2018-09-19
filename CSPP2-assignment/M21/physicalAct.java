class physicalAct {
    private String actname;
    private String start;
    private String end;
    private String date;
    // private String note;
    physicalAct() {

    }
    physicalAct(String actname1, String start1, String end1, String date1) {
        this.start = start1;
        this.end = end1;
        this.actname = actname1;
        this.date = date1;
        // this.note = note1;
    }
    public String getActname() {
        return this.actname;
    }
    public String getStart() {
        return this.start;
    }
    public String getEnd() {
        return this.end;
    }
    public String getdate() {
        return this.date;
    }
}