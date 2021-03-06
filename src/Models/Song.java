package Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by Cooper on 5/18/2017.
 */
public class Song {


    public Song(){

    }

    public Song (String songName, String songArtist, String songAlbum){

        setSongName(songName);
        setSongArtist(songArtist);
        setSongAlbum(songAlbum);

    }
    public Song (String songURL){
        setSongURL(songURL);
    }
    public Song(String songName, String songURL, String songArtist, String songAlbum){
        setSongName(songName);
        setSongArtist(songArtist);
        setSongAlbum(songAlbum);
        setSongURL(songURL);
    }
    public Song(String songName, String songURL, String songArtist, String songAlbum, int genre, int tuning){
        setSongName(songName);
        setSongArtist(songArtist);
        setSongAlbum(songAlbum);
        setSongURL(songURL);
        setGenreID(genre);
        setTuningID(tuning);
    }

    private SimpleIntegerProperty songID = new SimpleIntegerProperty();
    private SimpleStringProperty songName = new SimpleStringProperty();
    private SimpleStringProperty songURL= new SimpleStringProperty();
    private SimpleStringProperty songArtist= new SimpleStringProperty();
    private SimpleStringProperty songAlbum= new SimpleStringProperty();
    private SimpleIntegerProperty tuningID = new SimpleIntegerProperty();
    private SimpleIntegerProperty genreID =new SimpleIntegerProperty();
    private SimpleIntegerProperty gearID =new SimpleIntegerProperty();
    private SimpleStringProperty songGenre= new SimpleStringProperty();

    public String getSongGenre() {
        return songGenre.get();
    }

    public SimpleStringProperty songGenreProperty() {
        return songGenre;
    }

    public void setSongGenre(String songGenre) {
        this.songGenre.set(songGenre);
    }

    public int getSongID() {
        return songID.get();
    }

    public SimpleIntegerProperty songIDProperty() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID.set(songID);
    }

    public String getSongName() {
        return songName.get();
    }

    public SimpleStringProperty songNameProperty() {
        return songName;
    }

    public void setSongName(String songNamer) {
        //this.songName.set(songName);
        songName.set(songNamer);
    }

    public String getSongURL() {
        return songURL.get();
    }

    public SimpleStringProperty songURLProperty() {
        return songURL;
    }

    public void setSongURL(String songURL) {
        this.songURL.set(songURL);
    }

    public String getSongArtist() {
        return songArtist.get();
    }

    public SimpleStringProperty songArtistProperty() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist.set(songArtist);
    }

    public String getSongAlbum() {
        return songAlbum.get();
    }

    public SimpleStringProperty songAlbumProperty() {
        return songAlbum;
    }

    public void setSongAlbum(String songAlbum) {
        this.songAlbum.set(songAlbum);
    }

    public int getTuningID() {
        return tuningID.get();
    }

    public SimpleIntegerProperty tuningIDProperty() {
        return tuningID;
    }

    public void setTuningID(int tuningID) {
        this.tuningID.set(tuningID);
    }

    public int getGenreID() {
        return genreID.get();
    }

    public SimpleIntegerProperty genreIDProperty() {
        return genreID;
    }

    public void setGenreID(int genreID) {
        this.genreID.set(genreID);
    }

    public int getGearID() {
        return gearID.get();
    }

    public SimpleIntegerProperty gearIDProperty() {
        return gearID;
    }

    public void setGearID(int gearID) {
        this.gearID.set(gearID);
    }
}
