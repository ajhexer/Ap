package com.company;

public class Music {
    private String singerName;
    private String releaseTime;
    private String name;
    private String category;

    /***
     *
     * @param singerName music singer name
     * @param releaseTime music release time
     * @param name music name
     * @param category music category
     */
    public Music(String singerName, String releaseTime, String name, String category){
        this.name=name;
        this.releaseTime= releaseTime;
        this.singerName=singerName;
        this.category = category;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public String getName() {
        return name;
    }
    public String getCategory(){
        return category;
    }
}
