package foodyshop.com;


public class getjson {
    public String name;
    public int id;
    public int price;
    public String Phong;
    public getjson() {

    }
    public getjson(String name, int id, int price, String phong) {
        this.name = name;
        this.id  = id;
        this.price = price;
        this.Phong = phong;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhong(){return Phong;}

    public void setPhong(String phong){this.Phong = phong;}
}
