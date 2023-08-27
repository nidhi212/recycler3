package Models;

public class dataModels {
    int pic;
    String name,timing,msg,line;

    public dataModels(int pic, String name, String timing, String msg, String line) {
        this.pic = pic;
        this.name = name;
        this.timing = timing;
        this.msg = msg;
        this.line = line;
    }



    public int getPic() {
        return pic;
    }

    public String getName() {
        return name;
    }

    public String getTiming() {
        return timing;
    }

    public String getMsg() {
        return msg;
    }

    public String getLine() {
        return line;
    }
}
