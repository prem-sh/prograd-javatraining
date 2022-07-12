package sortingAlgorithms;

public class HotelList {

    private Hotel[] hotelList;
    private int capacity;
    private int tail;
    public HotelList(int capacity){
        this.hotelList = new Hotel[capacity];
        this.capacity = capacity;
        this.tail = 0;
    }
    public void printList(){
        System.out.println("================== List of Hotels ("+tail+"/"+capacity+") ==============");
        System.out.println("====================================================");
        for(Hotel i : hotelList) {
            if ((i != null)) {
                i.printHotel();
            }
        }
    }
    public String addHotel(Hotel hotel){
        if(this.tail < capacity){
            this.hotelList[this.tail] = hotel;
            tail++;
            return "Hotel added Successfuly";
        }
        return "Not Enough space to add a Hotel";
    }

    public static void main(String[] args) {
        HotelList list = new HotelList(10);
        byte r[] ;
        String keys[] ;
        r = new byte[]{3, 5, 0, 3, 1}; keys = new String[]{"food", "dating", "pizza"};
        Hotel h1 = new Hotel("MGR mess",r,234,keys);
        r = new byte[]{3, 3, 3, 5, 5}; keys = new String[]{"food", "dating", "pizza"};
        Hotel h2 = new Hotel("Kiran mess",r,245,keys);
        r = new byte[]{5, 5, 5, 5, 5}; keys = new String[]{"food", "dating", "pizza"};
        Hotel h3 = new Hotel("10 No Hotel",r,656,keys);
        r = new byte[]{3, 0,5,2,3}; keys = new String[]{"food", "dating", "pizza"};
        Hotel h4 = new Hotel("5 star Hotel",r,2545,keys);
        r = new byte[]{3, 4,4,5,0}; keys = new String[]{"food", "dating", "pizza"};
        Hotel h5 = new Hotel("Rajini mess",r,24647,keys);
        list.addHotel(h1);
        list.addHotel(h2);
        list.addHotel(h3);
        list.addHotel(h4);
        list.addHotel(h5);
        list.printList();
    }
}

class Hotel{
    private String name;
    private Rating rating;
    private int popularity;
    private String[] keyWords;
    public Hotel(String name, byte rating[], int popularity, String[] keywords){
        this.name = name;
        this.rating = new Rating(rating);
        this.popularity = popularity;
        this.keyWords = keywords;
    }

    public void printHotel(){
        System.out.println("Hotel : "+name+" | popularity : "+popularity+" | Ratings : "+rating.getAvgRating());
        System.out.println("----------------------------------------------------");
    }

    class Rating{
        byte comfort, facility, valueOfMoney, service, food;
        public Rating(byte ...ratings){
            this.comfort = ratings[0];
            this.facility = ratings[1];
            this.valueOfMoney = ratings[2];
            this.service = ratings[3];
            this.food = ratings[4];
        }

        public byte getComfort() {
            return comfort;
        }

        public byte getFacility() {
            return facility;
        }

        public byte getValueOfMoney() {
            return valueOfMoney;
        }

        public byte getService() {
            return service;
        }

        public byte getFood() {
            return food;
        }

        public byte getAvgRating(){
            return (byte) ((comfort+facility+valueOfMoney+service+food)/5);
        }
    }
}