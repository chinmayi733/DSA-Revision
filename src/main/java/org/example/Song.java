package org.example;


//HashCode and Equals for Song class
public class Song {

    public String Artist;
    public String songName;

    public String getArtist() {
        return Artist;
    }
    public void setArtist(String artist) {
        Artist = artist;
    }
    public String getSongName() {
        return songName;
    }

    Song (String songName,String artist) {
        this.Artist = artist;
        this.songName = songName;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        return (((Song) o).getArtist().equals(this.getArtist())) &&
               ((Song) o).getSongName().equals(this.getSongName());
    }

    @Override
    public int hashCode() {
        return this.getSongName().hashCode() +
               this.getArtist().hashCode();
    }
}
