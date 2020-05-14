package com.water.publicparams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FeedInfo {

    private String feedId = null;

    public void setFeedId(String id) {
        feedId = id;
    }

    public String getFeedId() {
        return feedId;
    }


    public class VideoInfo {
        private List<String> videoUrl = new ArrayList<>();

        public void addVideoUrl(String url) {
            videoUrl.add(url);
        }

        public List<String> getVideoUrl() {
            return videoUrl;
        }
    }


    public class VideoInfos {
        private List<String> videoUrl = new ArrayList<>();

        public void addVideoUrl(String url) {
            videoUrl.add(url);
        }

        public List<String> getVideoUrl() {
            return Collections.unmodifiableList(videoUrl);
        }
    }
}
