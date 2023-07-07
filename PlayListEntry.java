package com.example.rectanglemethod;

public class PlayListEntry {
        private String title ;
        private String artist;
        private int playCount=0;

        public void setTitle(String name)
        {
            title = name;
        }

        public String getTitle()
        {
            return title;
        }

        public void setArtist(String art)
        {
            artist = art;
        }

        public String getArtist()
        {
            return artist;
        }

        public void setPlayCount(int count)
        {
            playCount = count;
        }

        public int getPlayCount()
        {
            return playCount;
        }
    }
