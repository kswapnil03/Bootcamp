package Question5

class Hour {
    int hh;
    int mm;

    public void increment()
    {
       hh++
       mm++
    }
    public  void decrement()
    {
        hh--
        mm--
    }

    public static void main(String[] args) {
        Hour hour=new Hour(hh: 12,mm:24)
        printf "old time ${hour.hh}:${hour.mm} hh:mm\n"
        hour.increment()
        printf "new time after increment ${hour.hh}:${hour.mm} hh:mm\n"
        hour.decrement()
        printf "time after decrement ${hour.hh}:${hour.mm} hh:mm"

    }
}
