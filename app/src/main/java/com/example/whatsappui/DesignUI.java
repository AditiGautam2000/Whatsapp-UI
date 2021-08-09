package com.example.whatsappui;

public class DesignUI {
    private int imageView;
    private String name;
    private String msg;
    private String time;

    DesignUI(int imageView,String name,String msg,String time)
    {
        this.name=name;
        this.imageView=imageView;
        this.msg=msg;
        this.time=time;
    }

    public int getImageView() {
        return imageView;
    }

    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }

    public String getTime() {
        return time;
    }


}
