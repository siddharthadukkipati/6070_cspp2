class waterlog {
    private double quantity;
    private String date;
    private String time;
    waterlog() {

    }
    waterlog(double quantity1, String date1, String time1) {
        this.quantity = quantity1;
        this.date = date1;
        this.time  = time1;
    }
    public double getQuantity() {
        return this.quantity;
    }
    public String getdate() {
        return this.date;
    }
    public String gettime() {
        return this.time;
    }
}