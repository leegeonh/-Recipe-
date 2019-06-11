package com.example.cknck.recipe;

public class YouTubeVideos {
    String videoUrl;

    public YouTubeVideos() {
    }

    public YouTubeVideos(String videoUrl) {
        this.videoUrl = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/" + videoUrl + "\" frameborder=\"0\" allowfullscreen></iframe>";
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/" + videoUrl + "\" frameborder=\"0\" allowfullscreen></iframe>";
    }
}
