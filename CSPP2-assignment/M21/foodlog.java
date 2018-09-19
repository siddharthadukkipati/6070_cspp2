class foodlog {
    private String fooditem;
    private double quantity;
    private String date;
    private String time;
    foodlog() {

    }
    foodlog(String fooditem1, int quantity1, String date1, String time1) {
        this.fooditem = fooditem1;
        this.quantity = quantity1;
        this.date = date1;
        this.time = time1;
    }
    public String getFooditem() {
        return this.fooditem;
    }
    public double getQuantity() {
        return this.quantity;
    }
    public String getDate() {
        return this.date;
    }
    public String getTime() {
        return this.time;
    }
}